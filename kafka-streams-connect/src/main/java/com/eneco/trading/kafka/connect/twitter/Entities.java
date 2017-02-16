/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.eneco.trading.kafka.connect.twitter;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Entities extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Entities\",\"namespace\":\"com.eneco.trading.kafka.connect.twitter\",\"fields\":[{\"name\":\"hashtags\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Hashtag\",\"fields\":[{\"name\":\"text\",\"type\":[\"null\",\"string\"]}],\"connect.name\":\"com.eneco.trading.kafka.connect.twitter.Hashtag\"}}]},{\"name\":\"media\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Medium\",\"fields\":[{\"name\":\"display_url\",\"type\":[\"null\",\"string\"]},{\"name\":\"expanded_url\",\"type\":[\"null\",\"string\"]},{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"type\",\"type\":[\"null\",\"string\"]},{\"name\":\"url\",\"type\":[\"null\",\"string\"]}],\"connect.name\":\"com.eneco.trading.kafka.connect.twitter.Medium\"}}]},{\"name\":\"urls\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Url\",\"fields\":[{\"name\":\"display_url\",\"type\":[\"null\",\"string\"]},{\"name\":\"expanded_url\",\"type\":[\"null\",\"string\"]},{\"name\":\"url\",\"type\":[\"null\",\"string\"]}],\"connect.name\":\"com.eneco.trading.kafka.connect.twitter.Url\"}}]},{\"name\":\"user_mentions\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"UserMention\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"screen_name\",\"type\":[\"null\",\"string\"]}],\"connect.name\":\"com.eneco.trading.kafka.connect.twitter.UserMention\"}}]}],\"connect.name\":\"com.eneco.trading.kafka.connect.twitter.Entities\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<com.eneco.trading.kafka.connect.twitter.Hashtag> hashtags;
  @Deprecated public java.util.List<com.eneco.trading.kafka.connect.twitter.Medium> media;
  @Deprecated public java.util.List<com.eneco.trading.kafka.connect.twitter.Url> urls;
  @Deprecated public java.util.List<com.eneco.trading.kafka.connect.twitter.UserMention> user_mentions;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Entities() {}

  /**
   * All-args constructor.
   */
  public Entities(java.util.List<com.eneco.trading.kafka.connect.twitter.Hashtag> hashtags, java.util.List<com.eneco.trading.kafka.connect.twitter.Medium> media, java.util.List<com.eneco.trading.kafka.connect.twitter.Url> urls, java.util.List<com.eneco.trading.kafka.connect.twitter.UserMention> user_mentions) {
    this.hashtags = hashtags;
    this.media = media;
    this.urls = urls;
    this.user_mentions = user_mentions;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return hashtags;
    case 1: return media;
    case 2: return urls;
    case 3: return user_mentions;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: hashtags = (java.util.List<com.eneco.trading.kafka.connect.twitter.Hashtag>)value$; break;
    case 1: media = (java.util.List<com.eneco.trading.kafka.connect.twitter.Medium>)value$; break;
    case 2: urls = (java.util.List<com.eneco.trading.kafka.connect.twitter.Url>)value$; break;
    case 3: user_mentions = (java.util.List<com.eneco.trading.kafka.connect.twitter.UserMention>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'hashtags' field.
   */
  public java.util.List<com.eneco.trading.kafka.connect.twitter.Hashtag> getHashtags() {
    return hashtags;
  }

  /**
   * Sets the value of the 'hashtags' field.
   * @param value the value to set.
   */
  public void setHashtags(java.util.List<com.eneco.trading.kafka.connect.twitter.Hashtag> value) {
    this.hashtags = value;
  }

  /**
   * Gets the value of the 'media' field.
   */
  public java.util.List<com.eneco.trading.kafka.connect.twitter.Medium> getMedia() {
    return media;
  }

  /**
   * Sets the value of the 'media' field.
   * @param value the value to set.
   */
  public void setMedia(java.util.List<com.eneco.trading.kafka.connect.twitter.Medium> value) {
    this.media = value;
  }

  /**
   * Gets the value of the 'urls' field.
   */
  public java.util.List<com.eneco.trading.kafka.connect.twitter.Url> getUrls() {
    return urls;
  }

  /**
   * Sets the value of the 'urls' field.
   * @param value the value to set.
   */
  public void setUrls(java.util.List<com.eneco.trading.kafka.connect.twitter.Url> value) {
    this.urls = value;
  }

  /**
   * Gets the value of the 'user_mentions' field.
   */
  public java.util.List<com.eneco.trading.kafka.connect.twitter.UserMention> getUserMentions() {
    return user_mentions;
  }

  /**
   * Sets the value of the 'user_mentions' field.
   * @param value the value to set.
   */
  public void setUserMentions(java.util.List<com.eneco.trading.kafka.connect.twitter.UserMention> value) {
    this.user_mentions = value;
  }

  /** Creates a new Entities RecordBuilder */
  public static com.eneco.trading.kafka.connect.twitter.Entities.Builder newBuilder() {
    return new com.eneco.trading.kafka.connect.twitter.Entities.Builder();
  }
  
  /** Creates a new Entities RecordBuilder by copying an existing Builder */
  public static com.eneco.trading.kafka.connect.twitter.Entities.Builder newBuilder(com.eneco.trading.kafka.connect.twitter.Entities.Builder other) {
    return new com.eneco.trading.kafka.connect.twitter.Entities.Builder(other);
  }
  
  /** Creates a new Entities RecordBuilder by copying an existing Entities instance */
  public static com.eneco.trading.kafka.connect.twitter.Entities.Builder newBuilder(com.eneco.trading.kafka.connect.twitter.Entities other) {
    return new com.eneco.trading.kafka.connect.twitter.Entities.Builder(other);
  }
  
  /**
   * RecordBuilder for Entities instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Entities>
    implements org.apache.avro.data.RecordBuilder<Entities> {

    private java.util.List<com.eneco.trading.kafka.connect.twitter.Hashtag> hashtags;
    private java.util.List<com.eneco.trading.kafka.connect.twitter.Medium> media;
    private java.util.List<com.eneco.trading.kafka.connect.twitter.Url> urls;
    private java.util.List<com.eneco.trading.kafka.connect.twitter.UserMention> user_mentions;

    /** Creates a new Builder */
    private Builder() {
      super(com.eneco.trading.kafka.connect.twitter.Entities.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.eneco.trading.kafka.connect.twitter.Entities.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.hashtags)) {
        this.hashtags = data().deepCopy(fields()[0].schema(), other.hashtags);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.media)) {
        this.media = data().deepCopy(fields()[1].schema(), other.media);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.urls)) {
        this.urls = data().deepCopy(fields()[2].schema(), other.urls);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.user_mentions)) {
        this.user_mentions = data().deepCopy(fields()[3].schema(), other.user_mentions);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Entities instance */
    private Builder(com.eneco.trading.kafka.connect.twitter.Entities other) {
            super(com.eneco.trading.kafka.connect.twitter.Entities.SCHEMA$);
      if (isValidValue(fields()[0], other.hashtags)) {
        this.hashtags = data().deepCopy(fields()[0].schema(), other.hashtags);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.media)) {
        this.media = data().deepCopy(fields()[1].schema(), other.media);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.urls)) {
        this.urls = data().deepCopy(fields()[2].schema(), other.urls);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.user_mentions)) {
        this.user_mentions = data().deepCopy(fields()[3].schema(), other.user_mentions);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'hashtags' field */
    public java.util.List<com.eneco.trading.kafka.connect.twitter.Hashtag> getHashtags() {
      return hashtags;
    }
    
    /** Sets the value of the 'hashtags' field */
    public com.eneco.trading.kafka.connect.twitter.Entities.Builder setHashtags(java.util.List<com.eneco.trading.kafka.connect.twitter.Hashtag> value) {
      validate(fields()[0], value);
      this.hashtags = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'hashtags' field has been set */
    public boolean hasHashtags() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'hashtags' field */
    public com.eneco.trading.kafka.connect.twitter.Entities.Builder clearHashtags() {
      hashtags = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'media' field */
    public java.util.List<com.eneco.trading.kafka.connect.twitter.Medium> getMedia() {
      return media;
    }
    
    /** Sets the value of the 'media' field */
    public com.eneco.trading.kafka.connect.twitter.Entities.Builder setMedia(java.util.List<com.eneco.trading.kafka.connect.twitter.Medium> value) {
      validate(fields()[1], value);
      this.media = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'media' field has been set */
    public boolean hasMedia() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'media' field */
    public com.eneco.trading.kafka.connect.twitter.Entities.Builder clearMedia() {
      media = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'urls' field */
    public java.util.List<com.eneco.trading.kafka.connect.twitter.Url> getUrls() {
      return urls;
    }
    
    /** Sets the value of the 'urls' field */
    public com.eneco.trading.kafka.connect.twitter.Entities.Builder setUrls(java.util.List<com.eneco.trading.kafka.connect.twitter.Url> value) {
      validate(fields()[2], value);
      this.urls = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'urls' field has been set */
    public boolean hasUrls() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'urls' field */
    public com.eneco.trading.kafka.connect.twitter.Entities.Builder clearUrls() {
      urls = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'user_mentions' field */
    public java.util.List<com.eneco.trading.kafka.connect.twitter.UserMention> getUserMentions() {
      return user_mentions;
    }
    
    /** Sets the value of the 'user_mentions' field */
    public com.eneco.trading.kafka.connect.twitter.Entities.Builder setUserMentions(java.util.List<com.eneco.trading.kafka.connect.twitter.UserMention> value) {
      validate(fields()[3], value);
      this.user_mentions = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'user_mentions' field has been set */
    public boolean hasUserMentions() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'user_mentions' field */
    public com.eneco.trading.kafka.connect.twitter.Entities.Builder clearUserMentions() {
      user_mentions = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Entities build() {
      try {
        Entities record = new Entities();
        record.hashtags = fieldSetFlags()[0] ? this.hashtags : (java.util.List<com.eneco.trading.kafka.connect.twitter.Hashtag>) defaultValue(fields()[0]);
        record.media = fieldSetFlags()[1] ? this.media : (java.util.List<com.eneco.trading.kafka.connect.twitter.Medium>) defaultValue(fields()[1]);
        record.urls = fieldSetFlags()[2] ? this.urls : (java.util.List<com.eneco.trading.kafka.connect.twitter.Url>) defaultValue(fields()[2]);
        record.user_mentions = fieldSetFlags()[3] ? this.user_mentions : (java.util.List<com.eneco.trading.kafka.connect.twitter.UserMention>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
