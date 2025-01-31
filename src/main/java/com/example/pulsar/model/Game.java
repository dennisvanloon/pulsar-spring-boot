/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.pulsar.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Game extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -9177677754874453912L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Game\",\"namespace\":\"com.example.pulsar.model\",\"fields\":[{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"publisher\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Game> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Game> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Game> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Game> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Game> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Game to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Game from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Game instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Game fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence name;
  private java.lang.CharSequence publisher;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Game() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param publisher The new value for publisher
   */
  public Game(java.lang.CharSequence name, java.lang.CharSequence publisher) {
    this.name = name;
    this.publisher = publisher;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return publisher;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: publisher = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
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
   * Gets the value of the 'publisher' field.
   * @return The value of the 'publisher' field.
   */
  public java.lang.CharSequence getPublisher() {
    return publisher;
  }


  /**
   * Sets the value of the 'publisher' field.
   * @param value the value to set.
   */
  public void setPublisher(java.lang.CharSequence value) {
    this.publisher = value;
  }

  /**
   * Creates a new Game RecordBuilder.
   * @return A new Game RecordBuilder
   */
  public static com.example.pulsar.model.Game.Builder newBuilder() {
    return new com.example.pulsar.model.Game.Builder();
  }

  /**
   * Creates a new Game RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Game RecordBuilder
   */
  public static com.example.pulsar.model.Game.Builder newBuilder(com.example.pulsar.model.Game.Builder other) {
    if (other == null) {
      return new com.example.pulsar.model.Game.Builder();
    } else {
      return new com.example.pulsar.model.Game.Builder(other);
    }
  }

  /**
   * Creates a new Game RecordBuilder by copying an existing Game instance.
   * @param other The existing instance to copy.
   * @return A new Game RecordBuilder
   */
  public static com.example.pulsar.model.Game.Builder newBuilder(com.example.pulsar.model.Game other) {
    if (other == null) {
      return new com.example.pulsar.model.Game.Builder();
    } else {
      return new com.example.pulsar.model.Game.Builder(other);
    }
  }

  /**
   * RecordBuilder for Game instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Game>
    implements org.apache.avro.data.RecordBuilder<Game> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence publisher;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.pulsar.model.Game.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.publisher)) {
        this.publisher = data().deepCopy(fields()[1].schema(), other.publisher);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Game instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.pulsar.model.Game other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.publisher)) {
        this.publisher = data().deepCopy(fields()[1].schema(), other.publisher);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.example.pulsar.model.Game.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.example.pulsar.model.Game.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'publisher' field.
      * @return The value.
      */
    public java.lang.CharSequence getPublisher() {
      return publisher;
    }


    /**
      * Sets the value of the 'publisher' field.
      * @param value The value of 'publisher'.
      * @return This builder.
      */
    public com.example.pulsar.model.Game.Builder setPublisher(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.publisher = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'publisher' field has been set.
      * @return True if the 'publisher' field has been set, false otherwise.
      */
    public boolean hasPublisher() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'publisher' field.
      * @return This builder.
      */
    public com.example.pulsar.model.Game.Builder clearPublisher() {
      publisher = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Game build() {
      try {
        Game record = new Game();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.publisher = fieldSetFlags()[1] ? this.publisher : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Game>
    WRITER$ = (org.apache.avro.io.DatumWriter<Game>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Game>
    READER$ = (org.apache.avro.io.DatumReader<Game>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.name == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.name);
    }

    if (this.publisher == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.publisher);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 0) {
        in.readNull();
        this.name = null;
      } else {
        this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.publisher = null;
      } else {
        this.publisher = in.readString(this.publisher instanceof Utf8 ? (Utf8)this.publisher : null);
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 0) {
            in.readNull();
            this.name = null;
          } else {
            this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          }
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.publisher = null;
          } else {
            this.publisher = in.readString(this.publisher instanceof Utf8 ? (Utf8)this.publisher : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










