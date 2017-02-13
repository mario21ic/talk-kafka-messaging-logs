package io.github.jeqo.talk.kafka.producers;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Histogram;
import io.prometheus.client.Summary;
import io.prometheus.client.exporter.PushGateway;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.tamaya.Configuration;
import org.apache.tamaya.ConfigurationProvider;

import java.io.IOException;
import java.util.Properties;
import java.util.stream.IntStream;

/**
 * Created by jeqo on 13.02.17.
 */
public class ProducerAckOne {
    private static final String TOPIC = "ack-one";

    public static void main(String[] args) {
        Configuration config = ConfigurationProvider.getConfiguration();

        String bootstrapServers = config.getOrDefault("KAFKA_BOOTSTRAP_SERVERS", "localhost:9092");

        produceRecords(bootstrapServers);
    }

    private static void produceRecords(String bootstrapServers) {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.put(ProducerConfig.ACKS_CONFIG, "1");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        Producer<Integer, String> producer = new KafkaProducer<>(properties);

        CollectorRegistry registry = new CollectorRegistry();
        final Histogram requestLatency = Histogram.build()
                .name("kafka_producer_ack_one_latency")
                .help("Request latency in seconds.")
                .register(registry);

        IntStream.rangeClosed(1, 100).boxed()
                .map(number ->
                        new ProducerRecord<>(
                                TOPIC,
                                number, //Key
                                String.format("record-%s", number))) //Value
                .forEach(record -> {
                    Histogram.Timer requestTimer = requestLatency.startTimer();
                    try {
                        producer.send(record);
                    } finally {
                        try {
                            requestTimer.observeDuration();
                            PushGateway pg = new PushGateway("127.0.0.1:9091");
                            pg.pushAdd(registry, "kafka-producer-ack");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
        producer.close();
    }
}