#!/usr/bin/env bash
# min.compaction.lag.ms=0 The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.
# min.cleanable.dirty.ratio=0.5 This configuration controls how frequently the log compactor will attempt to clean the log
bin/kafka-topics.sh --zookeeper localhost:2181 \
                    --create \
                    --partitions 1 \
                    --replication-factor 1 \
                    --topic compacted \
                    --config segment.bytes=10000 \
                    --config cleanup.policy=compact \
                    --config min.compaction.lag.ms=10 \
                    --config min.cleanable.dirty.ratio=0.01
