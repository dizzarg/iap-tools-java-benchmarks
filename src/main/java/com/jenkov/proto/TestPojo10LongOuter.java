// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TestPojo10Long.proto

package com.jenkov.proto;

public final class TestPojo10LongOuter {
  private TestPojo10LongOuter() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TestPojo10LongOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.jenkov.proto.TestPojo10Long)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 field0 = 1;</code>
     */
    boolean hasField0();
    /**
     * <code>required int64 field0 = 1;</code>
     */
    long getField0();

    /**
     * <code>required int64 field1 = 2;</code>
     */
    boolean hasField1();
    /**
     * <code>required int64 field1 = 2;</code>
     */
    long getField1();

    /**
     * <code>required int64 field2 = 3;</code>
     */
    boolean hasField2();
    /**
     * <code>required int64 field2 = 3;</code>
     */
    long getField2();

    /**
     * <code>required int64 field3 = 4;</code>
     */
    boolean hasField3();
    /**
     * <code>required int64 field3 = 4;</code>
     */
    long getField3();

    /**
     * <code>required int64 field4 = 5;</code>
     */
    boolean hasField4();
    /**
     * <code>required int64 field4 = 5;</code>
     */
    long getField4();

    /**
     * <code>required int64 field5 = 6;</code>
     */
    boolean hasField5();
    /**
     * <code>required int64 field5 = 6;</code>
     */
    long getField5();

    /**
     * <code>required int64 field6 = 7;</code>
     */
    boolean hasField6();
    /**
     * <code>required int64 field6 = 7;</code>
     */
    long getField6();

    /**
     * <code>required int64 field7 = 8;</code>
     */
    boolean hasField7();
    /**
     * <code>required int64 field7 = 8;</code>
     */
    long getField7();

    /**
     * <code>required int64 field8 = 9;</code>
     */
    boolean hasField8();
    /**
     * <code>required int64 field8 = 9;</code>
     */
    long getField8();

    /**
     * <code>required int64 field9 = 10;</code>
     */
    boolean hasField9();
    /**
     * <code>required int64 field9 = 10;</code>
     */
    long getField9();
  }
  /**
   * Protobuf type {@code com.jenkov.proto.TestPojo10Long}
   */
  public static final class TestPojo10Long extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.jenkov.proto.TestPojo10Long)
      TestPojo10LongOrBuilder {
    // Use TestPojo10Long.newBuilder() to construct.
    private TestPojo10Long(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TestPojo10Long(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TestPojo10Long defaultInstance;
    public static TestPojo10Long getDefaultInstance() {
      return defaultInstance;
    }

    public TestPojo10Long getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TestPojo10Long(
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
            case 8: {
              bitField0_ |= 0x00000001;
              field0_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              field1_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              field2_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              field3_ = input.readInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              field4_ = input.readInt64();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              field5_ = input.readInt64();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              field6_ = input.readInt64();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              field7_ = input.readInt64();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              field8_ = input.readInt64();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              field9_ = input.readInt64();
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
      return com.jenkov.proto.TestPojo10LongOuter.internal_static_com_jenkov_proto_TestPojo10Long_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jenkov.proto.TestPojo10LongOuter.internal_static_com_jenkov_proto_TestPojo10Long_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long.class, com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long.Builder.class);
    }

    public static com.google.protobuf.Parser<TestPojo10Long> PARSER =
        new com.google.protobuf.AbstractParser<TestPojo10Long>() {
      public TestPojo10Long parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TestPojo10Long(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TestPojo10Long> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FIELD0_FIELD_NUMBER = 1;
    private long field0_;
    /**
     * <code>required int64 field0 = 1;</code>
     */
    public boolean hasField0() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 field0 = 1;</code>
     */
    public long getField0() {
      return field0_;
    }

    public static final int FIELD1_FIELD_NUMBER = 2;
    private long field1_;
    /**
     * <code>required int64 field1 = 2;</code>
     */
    public boolean hasField1() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 field1 = 2;</code>
     */
    public long getField1() {
      return field1_;
    }

    public static final int FIELD2_FIELD_NUMBER = 3;
    private long field2_;
    /**
     * <code>required int64 field2 = 3;</code>
     */
    public boolean hasField2() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 field2 = 3;</code>
     */
    public long getField2() {
      return field2_;
    }

    public static final int FIELD3_FIELD_NUMBER = 4;
    private long field3_;
    /**
     * <code>required int64 field3 = 4;</code>
     */
    public boolean hasField3() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int64 field3 = 4;</code>
     */
    public long getField3() {
      return field3_;
    }

    public static final int FIELD4_FIELD_NUMBER = 5;
    private long field4_;
    /**
     * <code>required int64 field4 = 5;</code>
     */
    public boolean hasField4() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int64 field4 = 5;</code>
     */
    public long getField4() {
      return field4_;
    }

    public static final int FIELD5_FIELD_NUMBER = 6;
    private long field5_;
    /**
     * <code>required int64 field5 = 6;</code>
     */
    public boolean hasField5() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required int64 field5 = 6;</code>
     */
    public long getField5() {
      return field5_;
    }

    public static final int FIELD6_FIELD_NUMBER = 7;
    private long field6_;
    /**
     * <code>required int64 field6 = 7;</code>
     */
    public boolean hasField6() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>required int64 field6 = 7;</code>
     */
    public long getField6() {
      return field6_;
    }

    public static final int FIELD7_FIELD_NUMBER = 8;
    private long field7_;
    /**
     * <code>required int64 field7 = 8;</code>
     */
    public boolean hasField7() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>required int64 field7 = 8;</code>
     */
    public long getField7() {
      return field7_;
    }

    public static final int FIELD8_FIELD_NUMBER = 9;
    private long field8_;
    /**
     * <code>required int64 field8 = 9;</code>
     */
    public boolean hasField8() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>required int64 field8 = 9;</code>
     */
    public long getField8() {
      return field8_;
    }

    public static final int FIELD9_FIELD_NUMBER = 10;
    private long field9_;
    /**
     * <code>required int64 field9 = 10;</code>
     */
    public boolean hasField9() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    /**
     * <code>required int64 field9 = 10;</code>
     */
    public long getField9() {
      return field9_;
    }

    private void initFields() {
      field0_ = 0L;
      field1_ = 0L;
      field2_ = 0L;
      field3_ = 0L;
      field4_ = 0L;
      field5_ = 0L;
      field6_ = 0L;
      field7_ = 0L;
      field8_ = 0L;
      field9_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasField0()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasField1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasField2()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasField3()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasField4()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasField5()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasField6()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasField7()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasField8()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasField9()) {
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
        output.writeInt64(1, field0_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, field1_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, field2_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt64(4, field3_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, field4_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(6, field5_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt64(7, field6_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt64(8, field7_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt64(9, field8_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeInt64(10, field9_);
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
          .computeInt64Size(1, field0_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, field1_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, field2_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, field3_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, field4_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, field5_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, field6_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(8, field7_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(9, field8_);
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(10, field9_);
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

    public static com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long prototype) {
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
     * Protobuf type {@code com.jenkov.proto.TestPojo10Long}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.jenkov.proto.TestPojo10Long)
        com.jenkov.proto.TestPojo10LongOuter.TestPojo10LongOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.jenkov.proto.TestPojo10LongOuter.internal_static_com_jenkov_proto_TestPojo10Long_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.jenkov.proto.TestPojo10LongOuter.internal_static_com_jenkov_proto_TestPojo10Long_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long.class, com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long.Builder.class);
      }

      // Construct using com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long.newBuilder()
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
        field0_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        field1_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        field2_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        field3_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        field4_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        field5_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        field6_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        field7_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        field8_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000100);
        field9_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.jenkov.proto.TestPojo10LongOuter.internal_static_com_jenkov_proto_TestPojo10Long_descriptor;
      }

      public com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long getDefaultInstanceForType() {
        return com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long.getDefaultInstance();
      }

      public com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long build() {
        com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long buildPartial() {
        com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long result = new com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.field0_ = field0_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.field1_ = field1_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.field2_ = field2_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.field3_ = field3_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.field4_ = field4_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.field5_ = field5_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.field6_ = field6_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.field7_ = field7_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.field8_ = field8_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.field9_ = field9_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long) {
          return mergeFrom((com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long other) {
        if (other == com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long.getDefaultInstance()) return this;
        if (other.hasField0()) {
          setField0(other.getField0());
        }
        if (other.hasField1()) {
          setField1(other.getField1());
        }
        if (other.hasField2()) {
          setField2(other.getField2());
        }
        if (other.hasField3()) {
          setField3(other.getField3());
        }
        if (other.hasField4()) {
          setField4(other.getField4());
        }
        if (other.hasField5()) {
          setField5(other.getField5());
        }
        if (other.hasField6()) {
          setField6(other.getField6());
        }
        if (other.hasField7()) {
          setField7(other.getField7());
        }
        if (other.hasField8()) {
          setField8(other.getField8());
        }
        if (other.hasField9()) {
          setField9(other.getField9());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasField0()) {
          
          return false;
        }
        if (!hasField1()) {
          
          return false;
        }
        if (!hasField2()) {
          
          return false;
        }
        if (!hasField3()) {
          
          return false;
        }
        if (!hasField4()) {
          
          return false;
        }
        if (!hasField5()) {
          
          return false;
        }
        if (!hasField6()) {
          
          return false;
        }
        if (!hasField7()) {
          
          return false;
        }
        if (!hasField8()) {
          
          return false;
        }
        if (!hasField9()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.jenkov.proto.TestPojo10LongOuter.TestPojo10Long) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long field0_ ;
      /**
       * <code>required int64 field0 = 1;</code>
       */
      public boolean hasField0() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 field0 = 1;</code>
       */
      public long getField0() {
        return field0_;
      }
      /**
       * <code>required int64 field0 = 1;</code>
       */
      public Builder setField0(long value) {
        bitField0_ |= 0x00000001;
        field0_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 field0 = 1;</code>
       */
      public Builder clearField0() {
        bitField0_ = (bitField0_ & ~0x00000001);
        field0_ = 0L;
        onChanged();
        return this;
      }

      private long field1_ ;
      /**
       * <code>required int64 field1 = 2;</code>
       */
      public boolean hasField1() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 field1 = 2;</code>
       */
      public long getField1() {
        return field1_;
      }
      /**
       * <code>required int64 field1 = 2;</code>
       */
      public Builder setField1(long value) {
        bitField0_ |= 0x00000002;
        field1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 field1 = 2;</code>
       */
      public Builder clearField1() {
        bitField0_ = (bitField0_ & ~0x00000002);
        field1_ = 0L;
        onChanged();
        return this;
      }

      private long field2_ ;
      /**
       * <code>required int64 field2 = 3;</code>
       */
      public boolean hasField2() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int64 field2 = 3;</code>
       */
      public long getField2() {
        return field2_;
      }
      /**
       * <code>required int64 field2 = 3;</code>
       */
      public Builder setField2(long value) {
        bitField0_ |= 0x00000004;
        field2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 field2 = 3;</code>
       */
      public Builder clearField2() {
        bitField0_ = (bitField0_ & ~0x00000004);
        field2_ = 0L;
        onChanged();
        return this;
      }

      private long field3_ ;
      /**
       * <code>required int64 field3 = 4;</code>
       */
      public boolean hasField3() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int64 field3 = 4;</code>
       */
      public long getField3() {
        return field3_;
      }
      /**
       * <code>required int64 field3 = 4;</code>
       */
      public Builder setField3(long value) {
        bitField0_ |= 0x00000008;
        field3_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 field3 = 4;</code>
       */
      public Builder clearField3() {
        bitField0_ = (bitField0_ & ~0x00000008);
        field3_ = 0L;
        onChanged();
        return this;
      }

      private long field4_ ;
      /**
       * <code>required int64 field4 = 5;</code>
       */
      public boolean hasField4() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int64 field4 = 5;</code>
       */
      public long getField4() {
        return field4_;
      }
      /**
       * <code>required int64 field4 = 5;</code>
       */
      public Builder setField4(long value) {
        bitField0_ |= 0x00000010;
        field4_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 field4 = 5;</code>
       */
      public Builder clearField4() {
        bitField0_ = (bitField0_ & ~0x00000010);
        field4_ = 0L;
        onChanged();
        return this;
      }

      private long field5_ ;
      /**
       * <code>required int64 field5 = 6;</code>
       */
      public boolean hasField5() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required int64 field5 = 6;</code>
       */
      public long getField5() {
        return field5_;
      }
      /**
       * <code>required int64 field5 = 6;</code>
       */
      public Builder setField5(long value) {
        bitField0_ |= 0x00000020;
        field5_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 field5 = 6;</code>
       */
      public Builder clearField5() {
        bitField0_ = (bitField0_ & ~0x00000020);
        field5_ = 0L;
        onChanged();
        return this;
      }

      private long field6_ ;
      /**
       * <code>required int64 field6 = 7;</code>
       */
      public boolean hasField6() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>required int64 field6 = 7;</code>
       */
      public long getField6() {
        return field6_;
      }
      /**
       * <code>required int64 field6 = 7;</code>
       */
      public Builder setField6(long value) {
        bitField0_ |= 0x00000040;
        field6_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 field6 = 7;</code>
       */
      public Builder clearField6() {
        bitField0_ = (bitField0_ & ~0x00000040);
        field6_ = 0L;
        onChanged();
        return this;
      }

      private long field7_ ;
      /**
       * <code>required int64 field7 = 8;</code>
       */
      public boolean hasField7() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>required int64 field7 = 8;</code>
       */
      public long getField7() {
        return field7_;
      }
      /**
       * <code>required int64 field7 = 8;</code>
       */
      public Builder setField7(long value) {
        bitField0_ |= 0x00000080;
        field7_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 field7 = 8;</code>
       */
      public Builder clearField7() {
        bitField0_ = (bitField0_ & ~0x00000080);
        field7_ = 0L;
        onChanged();
        return this;
      }

      private long field8_ ;
      /**
       * <code>required int64 field8 = 9;</code>
       */
      public boolean hasField8() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>required int64 field8 = 9;</code>
       */
      public long getField8() {
        return field8_;
      }
      /**
       * <code>required int64 field8 = 9;</code>
       */
      public Builder setField8(long value) {
        bitField0_ |= 0x00000100;
        field8_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 field8 = 9;</code>
       */
      public Builder clearField8() {
        bitField0_ = (bitField0_ & ~0x00000100);
        field8_ = 0L;
        onChanged();
        return this;
      }

      private long field9_ ;
      /**
       * <code>required int64 field9 = 10;</code>
       */
      public boolean hasField9() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>required int64 field9 = 10;</code>
       */
      public long getField9() {
        return field9_;
      }
      /**
       * <code>required int64 field9 = 10;</code>
       */
      public Builder setField9(long value) {
        bitField0_ |= 0x00000200;
        field9_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 field9 = 10;</code>
       */
      public Builder clearField9() {
        bitField0_ = (bitField0_ & ~0x00000200);
        field9_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.jenkov.proto.TestPojo10Long)
    }

    static {
      defaultInstance = new TestPojo10Long(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.jenkov.proto.TestPojo10Long)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jenkov_proto_TestPojo10Long_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_jenkov_proto_TestPojo10Long_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024TestPojo10Long.proto\022\020com.jenkov.proto" +
      "\"\260\001\n\016TestPojo10Long\022\016\n\006field0\030\001 \002(\003\022\016\n\006f" +
      "ield1\030\002 \002(\003\022\016\n\006field2\030\003 \002(\003\022\016\n\006field3\030\004 " +
      "\002(\003\022\016\n\006field4\030\005 \002(\003\022\016\n\006field5\030\006 \002(\003\022\016\n\006f" +
      "ield6\030\007 \002(\003\022\016\n\006field7\030\010 \002(\003\022\016\n\006field8\030\t " +
      "\002(\003\022\016\n\006field9\030\n \002(\003B\'\n\020com.jenkov.protoB" +
      "\023TestPojo10LongOuter"
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
    internal_static_com_jenkov_proto_TestPojo10Long_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_jenkov_proto_TestPojo10Long_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_jenkov_proto_TestPojo10Long_descriptor,
        new java.lang.String[] { "Field0", "Field1", "Field2", "Field3", "Field4", "Field5", "Field6", "Field7", "Field8", "Field9", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
