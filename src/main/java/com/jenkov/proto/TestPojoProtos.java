// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TestPojo.proto

package com.jenkov.proto;

public final class TestPojoProtos {
  private TestPojoProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TestPojoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.jenkov.proto.TestPojo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bool boolean1 = 4;</code>
     *
     * <pre>
     *13
     * </pre>
     */
    boolean hasBoolean1();
    /**
     * <code>required bool boolean1 = 4;</code>
     *
     * <pre>
     *13
     * </pre>
     */
    boolean getBoolean1();

    /**
     * <code>required bool boolean2 = 5;</code>
     *
     * <pre>
     *13
     * </pre>
     */
    boolean hasBoolean2();
    /**
     * <code>required bool boolean2 = 5;</code>
     *
     * <pre>
     *13
     * </pre>
     */
    boolean getBoolean2();

    /**
     * <code>required int32 short1 = 6;</code>
     */
    boolean hasShort1();
    /**
     * <code>required int32 short1 = 6;</code>
     */
    int getShort1();

    /**
     * <code>required int32 int1 = 7;</code>
     */
    boolean hasInt1();
    /**
     * <code>required int32 int1 = 7;</code>
     */
    int getInt1();

    /**
     * <code>required int64 long1 = 8;</code>
     */
    boolean hasLong1();
    /**
     * <code>required int64 long1 = 8;</code>
     */
    long getLong1();

    /**
     * <code>required float float1 = 9;</code>
     */
    boolean hasFloat1();
    /**
     * <code>required float float1 = 9;</code>
     */
    float getFloat1();

    /**
     * <code>required double dbl1 = 10;</code>
     */
    boolean hasDbl1();
    /**
     * <code>required double dbl1 = 10;</code>
     */
    double getDbl1();

    /**
     * <code>required string str1 = 11;</code>
     */
    boolean hasStr1();
    /**
     * <code>required string str1 = 11;</code>
     */
    java.lang.String getStr1();
    /**
     * <code>required string str1 = 11;</code>
     */
    com.google.protobuf.ByteString
        getStr1Bytes();
  }
  /**
   * Protobuf type {@code com.jenkov.proto.TestPojo}
   */
  public static final class TestPojo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.jenkov.proto.TestPojo)
      TestPojoOrBuilder {
    // Use TestPojo.newBuilder() to construct.
    private TestPojo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TestPojo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TestPojo defaultInstance;
    public static TestPojo getDefaultInstance() {
      return defaultInstance;
    }

    public TestPojo getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TestPojo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 32: {
              bitField0_ |= 0x00000001;
              boolean1_ = input.readBool();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000002;
              boolean2_ = input.readBool();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000004;
              short1_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000008;
              int1_ = input.readInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000010;
              long1_ = input.readInt64();
              break;
            }
            case 77: {
              bitField0_ |= 0x00000020;
              float1_ = input.readFloat();
              break;
            }
            case 81: {
              bitField0_ |= 0x00000040;
              dbl1_ = input.readDouble();
              break;
            }
            case 90: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000080;
              str1_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jenkov.proto.TestPojoProtos.internal_static_com_jenkov_proto_TestPojo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jenkov.proto.TestPojoProtos.internal_static_com_jenkov_proto_TestPojo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jenkov.proto.TestPojoProtos.TestPojo.class, com.jenkov.proto.TestPojoProtos.TestPojo.Builder.class);
    }

    public static com.google.protobuf.Parser<TestPojo> PARSER =
        new com.google.protobuf.AbstractParser<TestPojo>() {
      public TestPojo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TestPojo(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TestPojo> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int BOOLEAN1_FIELD_NUMBER = 4;
    private boolean boolean1_;
    /**
     * <code>required bool boolean1 = 4;</code>
     *
     * <pre>
     *13
     * </pre>
     */
    public boolean hasBoolean1() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bool boolean1 = 4;</code>
     *
     * <pre>
     *13
     * </pre>
     */
    public boolean getBoolean1() {
      return boolean1_;
    }

    public static final int BOOLEAN2_FIELD_NUMBER = 5;
    private boolean boolean2_;
    /**
     * <code>required bool boolean2 = 5;</code>
     *
     * <pre>
     *13
     * </pre>
     */
    public boolean hasBoolean2() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bool boolean2 = 5;</code>
     *
     * <pre>
     *13
     * </pre>
     */
    public boolean getBoolean2() {
      return boolean2_;
    }

    public static final int SHORT1_FIELD_NUMBER = 6;
    private int short1_;
    /**
     * <code>required int32 short1 = 6;</code>
     */
    public boolean hasShort1() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 short1 = 6;</code>
     */
    public int getShort1() {
      return short1_;
    }

    public static final int INT1_FIELD_NUMBER = 7;
    private int int1_;
    /**
     * <code>required int32 int1 = 7;</code>
     */
    public boolean hasInt1() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 int1 = 7;</code>
     */
    public int getInt1() {
      return int1_;
    }

    public static final int LONG1_FIELD_NUMBER = 8;
    private long long1_;
    /**
     * <code>required int64 long1 = 8;</code>
     */
    public boolean hasLong1() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int64 long1 = 8;</code>
     */
    public long getLong1() {
      return long1_;
    }

    public static final int FLOAT1_FIELD_NUMBER = 9;
    private float float1_;
    /**
     * <code>required float float1 = 9;</code>
     */
    public boolean hasFloat1() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required float float1 = 9;</code>
     */
    public float getFloat1() {
      return float1_;
    }

    public static final int DBL1_FIELD_NUMBER = 10;
    private double dbl1_;
    /**
     * <code>required double dbl1 = 10;</code>
     */
    public boolean hasDbl1() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>required double dbl1 = 10;</code>
     */
    public double getDbl1() {
      return dbl1_;
    }

    public static final int STR1_FIELD_NUMBER = 11;
    private java.lang.Object str1_;
    /**
     * <code>required string str1 = 11;</code>
     */
    public boolean hasStr1() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>required string str1 = 11;</code>
     */
    public java.lang.String getStr1() {
      java.lang.Object ref = str1_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          str1_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string str1 = 11;</code>
     */
    public com.google.protobuf.ByteString
        getStr1Bytes() {
      java.lang.Object ref = str1_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        str1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      boolean1_ = false;
      boolean2_ = false;
      short1_ = 0;
      int1_ = 0;
      long1_ = 0L;
      float1_ = 0F;
      dbl1_ = 0D;
      str1_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasBoolean1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBoolean2()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasShort1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasInt1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLong1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFloat1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDbl1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStr1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(4, boolean1_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(5, boolean2_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(6, short1_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(7, int1_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(8, long1_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeFloat(9, float1_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeDouble(10, dbl1_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeBytes(11, getStr1Bytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, boolean1_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, boolean2_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, short1_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, int1_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(8, long1_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(9, float1_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(10, dbl1_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(11, getStr1Bytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.jenkov.proto.TestPojoProtos.TestPojo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jenkov.proto.TestPojoProtos.TestPojo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jenkov.proto.TestPojoProtos.TestPojo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jenkov.proto.TestPojoProtos.TestPojo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jenkov.proto.TestPojoProtos.TestPojo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.jenkov.proto.TestPojoProtos.TestPojo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.jenkov.proto.TestPojoProtos.TestPojo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.jenkov.proto.TestPojoProtos.TestPojo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.jenkov.proto.TestPojoProtos.TestPojo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.jenkov.proto.TestPojoProtos.TestPojo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.jenkov.proto.TestPojoProtos.TestPojo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.jenkov.proto.TestPojo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.jenkov.proto.TestPojo)
        com.jenkov.proto.TestPojoProtos.TestPojoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.jenkov.proto.TestPojoProtos.internal_static_com_jenkov_proto_TestPojo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.jenkov.proto.TestPojoProtos.internal_static_com_jenkov_proto_TestPojo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.jenkov.proto.TestPojoProtos.TestPojo.class, com.jenkov.proto.TestPojoProtos.TestPojo.Builder.class);
      }

      // Construct using com.jenkov.proto.TestPojoProtos.TestPojo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        boolean1_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        boolean2_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        short1_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        int1_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        long1_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        float1_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000020);
        dbl1_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000040);
        str1_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.jenkov.proto.TestPojoProtos.internal_static_com_jenkov_proto_TestPojo_descriptor;
      }

      public com.jenkov.proto.TestPojoProtos.TestPojo getDefaultInstanceForType() {
        return com.jenkov.proto.TestPojoProtos.TestPojo.getDefaultInstance();
      }

      public com.jenkov.proto.TestPojoProtos.TestPojo build() {
        com.jenkov.proto.TestPojoProtos.TestPojo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.jenkov.proto.TestPojoProtos.TestPojo buildPartial() {
        com.jenkov.proto.TestPojoProtos.TestPojo result = new com.jenkov.proto.TestPojoProtos.TestPojo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.boolean1_ = boolean1_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.boolean2_ = boolean2_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.short1_ = short1_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.int1_ = int1_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.long1_ = long1_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.float1_ = float1_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.dbl1_ = dbl1_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.str1_ = str1_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.jenkov.proto.TestPojoProtos.TestPojo) {
          return mergeFrom((com.jenkov.proto.TestPojoProtos.TestPojo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.jenkov.proto.TestPojoProtos.TestPojo other) {
        if (other == com.jenkov.proto.TestPojoProtos.TestPojo.getDefaultInstance()) return this;
        if (other.hasBoolean1()) {
          setBoolean1(other.getBoolean1());
        }
        if (other.hasBoolean2()) {
          setBoolean2(other.getBoolean2());
        }
        if (other.hasShort1()) {
          setShort1(other.getShort1());
        }
        if (other.hasInt1()) {
          setInt1(other.getInt1());
        }
        if (other.hasLong1()) {
          setLong1(other.getLong1());
        }
        if (other.hasFloat1()) {
          setFloat1(other.getFloat1());
        }
        if (other.hasDbl1()) {
          setDbl1(other.getDbl1());
        }
        if (other.hasStr1()) {
          bitField0_ |= 0x00000080;
          str1_ = other.str1_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBoolean1()) {
          
          return false;
        }
        if (!hasBoolean2()) {
          
          return false;
        }
        if (!hasShort1()) {
          
          return false;
        }
        if (!hasInt1()) {
          
          return false;
        }
        if (!hasLong1()) {
          
          return false;
        }
        if (!hasFloat1()) {
          
          return false;
        }
        if (!hasDbl1()) {
          
          return false;
        }
        if (!hasStr1()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.jenkov.proto.TestPojoProtos.TestPojo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.jenkov.proto.TestPojoProtos.TestPojo) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean boolean1_ ;
      /**
       * <code>required bool boolean1 = 4;</code>
       *
       * <pre>
       *13
       * </pre>
       */
      public boolean hasBoolean1() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bool boolean1 = 4;</code>
       *
       * <pre>
       *13
       * </pre>
       */
      public boolean getBoolean1() {
        return boolean1_;
      }
      /**
       * <code>required bool boolean1 = 4;</code>
       *
       * <pre>
       *13
       * </pre>
       */
      public Builder setBoolean1(boolean value) {
        bitField0_ |= 0x00000001;
        boolean1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool boolean1 = 4;</code>
       *
       * <pre>
       *13
       * </pre>
       */
      public Builder clearBoolean1() {
        bitField0_ = (bitField0_ & ~0x00000001);
        boolean1_ = false;
        onChanged();
        return this;
      }

      private boolean boolean2_ ;
      /**
       * <code>required bool boolean2 = 5;</code>
       *
       * <pre>
       *13
       * </pre>
       */
      public boolean hasBoolean2() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bool boolean2 = 5;</code>
       *
       * <pre>
       *13
       * </pre>
       */
      public boolean getBoolean2() {
        return boolean2_;
      }
      /**
       * <code>required bool boolean2 = 5;</code>
       *
       * <pre>
       *13
       * </pre>
       */
      public Builder setBoolean2(boolean value) {
        bitField0_ |= 0x00000002;
        boolean2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool boolean2 = 5;</code>
       *
       * <pre>
       *13
       * </pre>
       */
      public Builder clearBoolean2() {
        bitField0_ = (bitField0_ & ~0x00000002);
        boolean2_ = false;
        onChanged();
        return this;
      }

      private int short1_ ;
      /**
       * <code>required int32 short1 = 6;</code>
       */
      public boolean hasShort1() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 short1 = 6;</code>
       */
      public int getShort1() {
        return short1_;
      }
      /**
       * <code>required int32 short1 = 6;</code>
       */
      public Builder setShort1(int value) {
        bitField0_ |= 0x00000004;
        short1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 short1 = 6;</code>
       */
      public Builder clearShort1() {
        bitField0_ = (bitField0_ & ~0x00000004);
        short1_ = 0;
        onChanged();
        return this;
      }

      private int int1_ ;
      /**
       * <code>required int32 int1 = 7;</code>
       */
      public boolean hasInt1() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 int1 = 7;</code>
       */
      public int getInt1() {
        return int1_;
      }
      /**
       * <code>required int32 int1 = 7;</code>
       */
      public Builder setInt1(int value) {
        bitField0_ |= 0x00000008;
        int1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 int1 = 7;</code>
       */
      public Builder clearInt1() {
        bitField0_ = (bitField0_ & ~0x00000008);
        int1_ = 0;
        onChanged();
        return this;
      }

      private long long1_ ;
      /**
       * <code>required int64 long1 = 8;</code>
       */
      public boolean hasLong1() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int64 long1 = 8;</code>
       */
      public long getLong1() {
        return long1_;
      }
      /**
       * <code>required int64 long1 = 8;</code>
       */
      public Builder setLong1(long value) {
        bitField0_ |= 0x00000010;
        long1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 long1 = 8;</code>
       */
      public Builder clearLong1() {
        bitField0_ = (bitField0_ & ~0x00000010);
        long1_ = 0L;
        onChanged();
        return this;
      }

      private float float1_ ;
      /**
       * <code>required float float1 = 9;</code>
       */
      public boolean hasFloat1() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required float float1 = 9;</code>
       */
      public float getFloat1() {
        return float1_;
      }
      /**
       * <code>required float float1 = 9;</code>
       */
      public Builder setFloat1(float value) {
        bitField0_ |= 0x00000020;
        float1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float float1 = 9;</code>
       */
      public Builder clearFloat1() {
        bitField0_ = (bitField0_ & ~0x00000020);
        float1_ = 0F;
        onChanged();
        return this;
      }

      private double dbl1_ ;
      /**
       * <code>required double dbl1 = 10;</code>
       */
      public boolean hasDbl1() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>required double dbl1 = 10;</code>
       */
      public double getDbl1() {
        return dbl1_;
      }
      /**
       * <code>required double dbl1 = 10;</code>
       */
      public Builder setDbl1(double value) {
        bitField0_ |= 0x00000040;
        dbl1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double dbl1 = 10;</code>
       */
      public Builder clearDbl1() {
        bitField0_ = (bitField0_ & ~0x00000040);
        dbl1_ = 0D;
        onChanged();
        return this;
      }

      private java.lang.Object str1_ = "";
      /**
       * <code>required string str1 = 11;</code>
       */
      public boolean hasStr1() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>required string str1 = 11;</code>
       */
      public java.lang.String getStr1() {
        java.lang.Object ref = str1_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            str1_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string str1 = 11;</code>
       */
      public com.google.protobuf.ByteString
          getStr1Bytes() {
        java.lang.Object ref = str1_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          str1_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string str1 = 11;</code>
       */
      public Builder setStr1(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        str1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string str1 = 11;</code>
       */
      public Builder clearStr1() {
        bitField0_ = (bitField0_ & ~0x00000080);
        str1_ = getDefaultInstance().getStr1();
        onChanged();
        return this;
      }
      /**
       * <code>required string str1 = 11;</code>
       */
      public Builder setStr1Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        str1_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.jenkov.proto.TestPojo)
    }

    static {
      defaultInstance = new TestPojo(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.jenkov.proto.TestPojo)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jenkov_proto_TestPojo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_jenkov_proto_TestPojo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016TestPojo.proto\022\020com.jenkov.proto\"\207\001\n\010T" +
      "estPojo\022\020\n\010boolean1\030\004 \002(\010\022\020\n\010boolean2\030\005 " +
      "\002(\010\022\016\n\006short1\030\006 \002(\005\022\014\n\004int1\030\007 \002(\005\022\r\n\005lon" +
      "g1\030\010 \002(\003\022\016\n\006float1\030\t \002(\002\022\014\n\004dbl1\030\n \002(\001\022\014" +
      "\n\004str1\030\013 \002(\tB\"\n\020com.jenkov.protoB\016TestPo" +
      "joProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_jenkov_proto_TestPojo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_jenkov_proto_TestPojo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_jenkov_proto_TestPojo_descriptor,
        new java.lang.String[] { "Boolean1", "Boolean2", "Short1", "Int1", "Long1", "Float1", "Dbl1", "Str1", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
