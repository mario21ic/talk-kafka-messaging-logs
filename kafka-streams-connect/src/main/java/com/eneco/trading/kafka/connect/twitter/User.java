/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.eneco.trading.kafka.connect.twitter;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.eneco.trading.kafka.connect.twitter\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"screen_name\",\"type\":[\"null\",\"string\"]},{\"name\":\"location\",\"type\":[\"null\",\"string\"]},{\"name\":\"verified\",\"type\":\"boolean\"},{\"name\":\"friends_count\",\"type\":\"int\"},{\"name\":\"followers_count\",\"type\":\"int\"},{\"name\":\"statuses_count\",\"type\":\"int\"}],\"connect.name\":\"com.eneco.trading.kafka.connect.twitter.User\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence screen_name;
  @Deprecated public java.lang.CharSequence location;
  @Deprecated public boolean verified;
  @Deprecated public int friends_count;
  @Deprecated public int followers_count;
  @Deprecated public int statuses_count;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public User() {}

  /**
   * All-args constructor.
   */
  public User(java.lang.Long id, java.lang.CharSequence name, java.lang.CharSequence screen_name, java.lang.CharSequence location, java.lang.Boolean verified, java.lang.Integer friends_count, java.lang.Integer followers_count, java.lang.Integer statuses_count) {
    this.id = id;
    this.name = name;
    this.screen_name = screen_name;
    this.location = location;
    this.verified = verified;
    this.friends_count = friends_count;
    this.followers_count = followers_count;
    this.statuses_count = statuses_count;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return screen_name;
    case 3: return location;
    case 4: return verified;
    case 5: return friends_count;
    case 6: return followers_count;
    case 7: return statuses_count;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: screen_name = (java.lang.CharSequence)value$; break;
    case 3: location = (java.lang.CharSequence)value$; break;
    case 4: verified = (java.lang.Boolean)value$; break;
    case 5: friends_count = (java.lang.Integer)value$; break;
    case 6: followers_count = (java.lang.Integer)value$; break;
    case 7: statuses_count = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'screen_name' field.
   */
  public java.lang.CharSequence getScreenName() {
    return screen_name;
  }

  /**
   * Sets the value of the 'screen_name' field.
   * @param value the value to set.
   */
  public void setScreenName(java.lang.CharSequence value) {
    this.screen_name = value;
  }

  /**
   * Gets the value of the 'location' field.
   */
  public java.lang.CharSequence getLocation() {
    return location;
  }

  /**
   * Sets the value of the 'location' field.
   * @param value the value to set.
   */
  public void setLocation(java.lang.CharSequence value) {
    this.location = value;
  }

  /**
   * Gets the value of the 'verified' field.
   */
  public java.lang.Boolean getVerified() {
    return verified;
  }

  /**
   * Sets the value of the 'verified' field.
   * @param value the value to set.
   */
  public void setVerified(java.lang.Boolean value) {
    this.verified = value;
  }

  /**
   * Gets the value of the 'friends_count' field.
   */
  public java.lang.Integer getFriendsCount() {
    return friends_count;
  }

  /**
   * Sets the value of the 'friends_count' field.
   * @param value the value to set.
   */
  public void setFriendsCount(java.lang.Integer value) {
    this.friends_count = value;
  }

  /**
   * Gets the value of the 'followers_count' field.
   */
  public java.lang.Integer getFollowersCount() {
    return followers_count;
  }

  /**
   * Sets the value of the 'followers_count' field.
   * @param value the value to set.
   */
  public void setFollowersCount(java.lang.Integer value) {
    this.followers_count = value;
  }

  /**
   * Gets the value of the 'statuses_count' field.
   */
  public java.lang.Integer getStatusesCount() {
    return statuses_count;
  }

  /**
   * Sets the value of the 'statuses_count' field.
   * @param value the value to set.
   */
  public void setStatusesCount(java.lang.Integer value) {
    this.statuses_count = value;
  }

  /** Creates a new User RecordBuilder */
  public static com.eneco.trading.kafka.connect.twitter.User.Builder newBuilder() {
    return new com.eneco.trading.kafka.connect.twitter.User.Builder();
  }
  
  /** Creates a new User RecordBuilder by copying an existing Builder */
  public static com.eneco.trading.kafka.connect.twitter.User.Builder newBuilder(com.eneco.trading.kafka.connect.twitter.User.Builder other) {
    return new com.eneco.trading.kafka.connect.twitter.User.Builder(other);
  }
  
  /** Creates a new User RecordBuilder by copying an existing User instance */
  public static com.eneco.trading.kafka.connect.twitter.User.Builder newBuilder(com.eneco.trading.kafka.connect.twitter.User other) {
    return new com.eneco.trading.kafka.connect.twitter.User.Builder(other);
  }
  
  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private long id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence screen_name;
    private java.lang.CharSequence location;
    private boolean verified;
    private int friends_count;
    private int followers_count;
    private int statuses_count;

    /** Creates a new Builder */
    private Builder() {
      super(com.eneco.trading.kafka.connect.twitter.User.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.eneco.trading.kafka.connect.twitter.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.screen_name)) {
        this.screen_name = data().deepCopy(fields()[2].schema(), other.screen_name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.location)) {
        this.location = data().deepCopy(fields()[3].schema(), other.location);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.verified)) {
        this.verified = data().deepCopy(fields()[4].schema(), other.verified);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.friends_count)) {
        this.friends_count = data().deepCopy(fields()[5].schema(), other.friends_count);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.followers_count)) {
        this.followers_count = data().deepCopy(fields()[6].schema(), other.followers_count);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.statuses_count)) {
        this.statuses_count = data().deepCopy(fields()[7].schema(), other.statuses_count);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing User instance */
    private Builder(com.eneco.trading.kafka.connect.twitter.User other) {
            super(com.eneco.trading.kafka.connect.twitter.User.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.screen_name)) {
        this.screen_name = data().deepCopy(fields()[2].schema(), other.screen_name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.location)) {
        this.location = data().deepCopy(fields()[3].schema(), other.location);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.verified)) {
        this.verified = data().deepCopy(fields()[4].schema(), other.verified);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.friends_count)) {
        this.friends_count = data().deepCopy(fields()[5].schema(), other.friends_count);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.followers_count)) {
        this.followers_count = data().deepCopy(fields()[6].schema(), other.followers_count);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.statuses_count)) {
        this.statuses_count = data().deepCopy(fields()[7].schema(), other.statuses_count);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.Long getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'screen_name' field */
    public java.lang.CharSequence getScreenName() {
      return screen_name;
    }
    
    /** Sets the value of the 'screen_name' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder setScreenName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.screen_name = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'screen_name' field has been set */
    public boolean hasScreenName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'screen_name' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder clearScreenName() {
      screen_name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'location' field */
    public java.lang.CharSequence getLocation() {
      return location;
    }
    
    /** Sets the value of the 'location' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder setLocation(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.location = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'location' field has been set */
    public boolean hasLocation() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'location' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder clearLocation() {
      location = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'verified' field */
    public java.lang.Boolean getVerified() {
      return verified;
    }
    
    /** Sets the value of the 'verified' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder setVerified(boolean value) {
      validate(fields()[4], value);
      this.verified = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'verified' field has been set */
    public boolean hasVerified() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'verified' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder clearVerified() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'friends_count' field */
    public java.lang.Integer getFriendsCount() {
      return friends_count;
    }
    
    /** Sets the value of the 'friends_count' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder setFriendsCount(int value) {
      validate(fields()[5], value);
      this.friends_count = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'friends_count' field has been set */
    public boolean hasFriendsCount() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'friends_count' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder clearFriendsCount() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'followers_count' field */
    public java.lang.Integer getFollowersCount() {
      return followers_count;
    }
    
    /** Sets the value of the 'followers_count' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder setFollowersCount(int value) {
      validate(fields()[6], value);
      this.followers_count = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'followers_count' field has been set */
    public boolean hasFollowersCount() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'followers_count' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder clearFollowersCount() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'statuses_count' field */
    public java.lang.Integer getStatusesCount() {
      return statuses_count;
    }
    
    /** Sets the value of the 'statuses_count' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder setStatusesCount(int value) {
      validate(fields()[7], value);
      this.statuses_count = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'statuses_count' field has been set */
    public boolean hasStatusesCount() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'statuses_count' field */
    public com.eneco.trading.kafka.connect.twitter.User.Builder clearStatusesCount() {
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public User build() {
      try {
        User record = new User();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.screen_name = fieldSetFlags()[2] ? this.screen_name : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.location = fieldSetFlags()[3] ? this.location : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.verified = fieldSetFlags()[4] ? this.verified : (java.lang.Boolean) defaultValue(fields()[4]);
        record.friends_count = fieldSetFlags()[5] ? this.friends_count : (java.lang.Integer) defaultValue(fields()[5]);
        record.followers_count = fieldSetFlags()[6] ? this.followers_count : (java.lang.Integer) defaultValue(fields()[6]);
        record.statuses_count = fieldSetFlags()[7] ? this.statuses_count : (java.lang.Integer) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
