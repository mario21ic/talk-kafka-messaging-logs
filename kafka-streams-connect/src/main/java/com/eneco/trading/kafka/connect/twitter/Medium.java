/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.eneco.trading.kafka.connect.twitter;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Medium extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Medium\",\"namespace\":\"com.eneco.trading.kafka.connect.twitter\",\"fields\":[{\"name\":\"display_url\",\"type\":[\"null\",\"string\"]},{\"name\":\"expanded_url\",\"type\":[\"null\",\"string\"]},{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"type\",\"type\":[\"null\",\"string\"]},{\"name\":\"url\",\"type\":[\"null\",\"string\"]}],\"connect.name\":\"com.eneco.trading.kafka.connect.twitter.Medium\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence display_url;
  @Deprecated public java.lang.CharSequence expanded_url;
  @Deprecated public long id;
  @Deprecated public java.lang.CharSequence type;
  @Deprecated public java.lang.CharSequence url;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Medium() {}

  /**
   * All-args constructor.
   */
  public Medium(java.lang.CharSequence display_url, java.lang.CharSequence expanded_url, java.lang.Long id, java.lang.CharSequence type, java.lang.CharSequence url) {
    this.display_url = display_url;
    this.expanded_url = expanded_url;
    this.id = id;
    this.type = type;
    this.url = url;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return display_url;
    case 1: return expanded_url;
    case 2: return id;
    case 3: return type;
    case 4: return url;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: display_url = (java.lang.CharSequence)value$; break;
    case 1: expanded_url = (java.lang.CharSequence)value$; break;
    case 2: id = (java.lang.Long)value$; break;
    case 3: type = (java.lang.CharSequence)value$; break;
    case 4: url = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'display_url' field.
   */
  public java.lang.CharSequence getDisplayUrl() {
    return display_url;
  }

  /**
   * Sets the value of the 'display_url' field.
   * @param value the value to set.
   */
  public void setDisplayUrl(java.lang.CharSequence value) {
    this.display_url = value;
  }

  /**
   * Gets the value of the 'expanded_url' field.
   */
  public java.lang.CharSequence getExpandedUrl() {
    return expanded_url;
  }

  /**
   * Sets the value of the 'expanded_url' field.
   * @param value the value to set.
   */
  public void setExpandedUrl(java.lang.CharSequence value) {
    this.expanded_url = value;
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'url' field.
   */
  public java.lang.CharSequence getUrl() {
    return url;
  }

  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.CharSequence value) {
    this.url = value;
  }

  /** Creates a new Medium RecordBuilder */
  public static com.eneco.trading.kafka.connect.twitter.Medium.Builder newBuilder() {
    return new com.eneco.trading.kafka.connect.twitter.Medium.Builder();
  }
  
  /** Creates a new Medium RecordBuilder by copying an existing Builder */
  public static com.eneco.trading.kafka.connect.twitter.Medium.Builder newBuilder(com.eneco.trading.kafka.connect.twitter.Medium.Builder other) {
    return new com.eneco.trading.kafka.connect.twitter.Medium.Builder(other);
  }
  
  /** Creates a new Medium RecordBuilder by copying an existing Medium instance */
  public static com.eneco.trading.kafka.connect.twitter.Medium.Builder newBuilder(com.eneco.trading.kafka.connect.twitter.Medium other) {
    return new com.eneco.trading.kafka.connect.twitter.Medium.Builder(other);
  }
  
  /**
   * RecordBuilder for Medium instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Medium>
    implements org.apache.avro.data.RecordBuilder<Medium> {

    private java.lang.CharSequence display_url;
    private java.lang.CharSequence expanded_url;
    private long id;
    private java.lang.CharSequence type;
    private java.lang.CharSequence url;

    /** Creates a new Builder */
    private Builder() {
      super(com.eneco.trading.kafka.connect.twitter.Medium.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.eneco.trading.kafka.connect.twitter.Medium.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.display_url)) {
        this.display_url = data().deepCopy(fields()[0].schema(), other.display_url);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.expanded_url)) {
        this.expanded_url = data().deepCopy(fields()[1].schema(), other.expanded_url);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.id)) {
        this.id = data().deepCopy(fields()[2].schema(), other.id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.url)) {
        this.url = data().deepCopy(fields()[4].schema(), other.url);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Medium instance */
    private Builder(com.eneco.trading.kafka.connect.twitter.Medium other) {
            super(com.eneco.trading.kafka.connect.twitter.Medium.SCHEMA$);
      if (isValidValue(fields()[0], other.display_url)) {
        this.display_url = data().deepCopy(fields()[0].schema(), other.display_url);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.expanded_url)) {
        this.expanded_url = data().deepCopy(fields()[1].schema(), other.expanded_url);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.id)) {
        this.id = data().deepCopy(fields()[2].schema(), other.id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.url)) {
        this.url = data().deepCopy(fields()[4].schema(), other.url);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'display_url' field */
    public java.lang.CharSequence getDisplayUrl() {
      return display_url;
    }
    
    /** Sets the value of the 'display_url' field */
    public com.eneco.trading.kafka.connect.twitter.Medium.Builder setDisplayUrl(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.display_url = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'display_url' field has been set */
    public boolean hasDisplayUrl() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'display_url' field */
    public com.eneco.trading.kafka.connect.twitter.Medium.Builder clearDisplayUrl() {
      display_url = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'expanded_url' field */
    public java.lang.CharSequence getExpandedUrl() {
      return expanded_url;
    }
    
    /** Sets the value of the 'expanded_url' field */
    public com.eneco.trading.kafka.connect.twitter.Medium.Builder setExpandedUrl(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.expanded_url = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'expanded_url' field has been set */
    public boolean hasExpandedUrl() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'expanded_url' field */
    public com.eneco.trading.kafka.connect.twitter.Medium.Builder clearExpandedUrl() {
      expanded_url = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public java.lang.Long getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public com.eneco.trading.kafka.connect.twitter.Medium.Builder setId(long value) {
      validate(fields()[2], value);
      this.id = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'id' field */
    public com.eneco.trading.kafka.connect.twitter.Medium.Builder clearId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'type' field */
    public java.lang.CharSequence getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public com.eneco.trading.kafka.connect.twitter.Medium.Builder setType(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.type = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'type' field */
    public com.eneco.trading.kafka.connect.twitter.Medium.Builder clearType() {
      type = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'url' field */
    public java.lang.CharSequence getUrl() {
      return url;
    }
    
    /** Sets the value of the 'url' field */
    public com.eneco.trading.kafka.connect.twitter.Medium.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.url = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'url' field has been set */
    public boolean hasUrl() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'url' field */
    public com.eneco.trading.kafka.connect.twitter.Medium.Builder clearUrl() {
      url = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Medium build() {
      try {
        Medium record = new Medium();
        record.display_url = fieldSetFlags()[0] ? this.display_url : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.expanded_url = fieldSetFlags()[1] ? this.expanded_url : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.id = fieldSetFlags()[2] ? this.id : (java.lang.Long) defaultValue(fields()[2]);
        record.type = fieldSetFlags()[3] ? this.type : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.url = fieldSetFlags()[4] ? this.url : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
