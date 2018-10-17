// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bank.proto

package rpc;

/**
 * Protobuf type {@code rpc.UserForgetUserIdRequest}
 */
public  final class UserForgetUserIdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.UserForgetUserIdRequest)
    UserForgetUserIdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserForgetUserIdRequest.newBuilder() to construct.
  private UserForgetUserIdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserForgetUserIdRequest() {
    iban_ = "";
    phone_ = "";
    email_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserForgetUserIdRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            iban_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (birthDate_ != null) {
              subBuilder = birthDate_.toBuilder();
            }
            birthDate_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(birthDate_);
              birthDate_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            phone_ = s;
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BankProto.internal_static_rpc_UserForgetUserIdRequest_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BankProto.internal_static_rpc_UserForgetUserIdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            UserForgetUserIdRequest.class, UserForgetUserIdRequest.Builder.class);
  }

  public static final int IBAN_FIELD_NUMBER = 1;
  private volatile Object iban_;
  /**
   * <code>string iban = 1;</code>
   */
  public String getIban() {
    Object ref = iban_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      iban_ = s;
      return s;
    }
  }
  /**
   * <code>string iban = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIbanBytes() {
    Object ref = iban_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      iban_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BIRTH_DATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp birthDate_;
  /**
   * <code>.google.protobuf.Timestamp birth_date = 2;</code>
   */
  public boolean hasBirthDate() {
    return birthDate_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp birth_date = 2;</code>
   */
  public com.google.protobuf.Timestamp getBirthDate() {
    return birthDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : birthDate_;
  }
  /**
   * <code>.google.protobuf.Timestamp birth_date = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getBirthDateOrBuilder() {
    return getBirthDate();
  }

  public static final int PHONE_FIELD_NUMBER = 3;
  private volatile Object phone_;
  /**
   * <code>string phone = 3;</code>
   */
  public String getPhone() {
    Object ref = phone_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      phone_ = s;
      return s;
    }
  }
  /**
   * <code>string phone = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPhoneBytes() {
    Object ref = phone_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      phone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 4;
  private volatile Object email_;
  /**
   * <code>string email = 4;</code>
   */
  public String getEmail() {
    Object ref = email_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 4;</code>
   */
  public com.google.protobuf.ByteString
      getEmailBytes() {
    Object ref = email_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIbanBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, iban_);
    }
    if (birthDate_ != null) {
      output.writeMessage(2, getBirthDate());
    }
    if (!getPhoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, phone_);
    }
    if (!getEmailBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, email_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIbanBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, iban_);
    }
    if (birthDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBirthDate());
    }
    if (!getPhoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, phone_);
    }
    if (!getEmailBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, email_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof UserForgetUserIdRequest)) {
      return super.equals(obj);
    }
    UserForgetUserIdRequest other = (UserForgetUserIdRequest) obj;

    boolean result = true;
    result = result && getIban()
        .equals(other.getIban());
    result = result && (hasBirthDate() == other.hasBirthDate());
    if (hasBirthDate()) {
      result = result && getBirthDate()
          .equals(other.getBirthDate());
    }
    result = result && getPhone()
        .equals(other.getPhone());
    result = result && getEmail()
        .equals(other.getEmail());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IBAN_FIELD_NUMBER;
    hash = (53 * hash) + getIban().hashCode();
    if (hasBirthDate()) {
      hash = (37 * hash) + BIRTH_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getBirthDate().hashCode();
    }
    hash = (37 * hash) + PHONE_FIELD_NUMBER;
    hash = (53 * hash) + getPhone().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static UserForgetUserIdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserForgetUserIdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserForgetUserIdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserForgetUserIdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserForgetUserIdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UserForgetUserIdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UserForgetUserIdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UserForgetUserIdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static UserForgetUserIdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static UserForgetUserIdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static UserForgetUserIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UserForgetUserIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(UserForgetUserIdRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rpc.UserForgetUserIdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.UserForgetUserIdRequest)
      UserForgetUserIdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BankProto.internal_static_rpc_UserForgetUserIdRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BankProto.internal_static_rpc_UserForgetUserIdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UserForgetUserIdRequest.class, UserForgetUserIdRequest.Builder.class);
    }

    // Construct using rpc.UserForgetUserIdRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      iban_ = "";

      if (birthDateBuilder_ == null) {
        birthDate_ = null;
      } else {
        birthDate_ = null;
        birthDateBuilder_ = null;
      }
      phone_ = "";

      email_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BankProto.internal_static_rpc_UserForgetUserIdRequest_descriptor;
    }

    public UserForgetUserIdRequest getDefaultInstanceForType() {
      return UserForgetUserIdRequest.getDefaultInstance();
    }

    public UserForgetUserIdRequest build() {
      UserForgetUserIdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public UserForgetUserIdRequest buildPartial() {
      UserForgetUserIdRequest result = new UserForgetUserIdRequest(this);
      result.iban_ = iban_;
      if (birthDateBuilder_ == null) {
        result.birthDate_ = birthDate_;
      } else {
        result.birthDate_ = birthDateBuilder_.build();
      }
      result.phone_ = phone_;
      result.email_ = email_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof UserForgetUserIdRequest) {
        return mergeFrom((UserForgetUserIdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(UserForgetUserIdRequest other) {
      if (other == UserForgetUserIdRequest.getDefaultInstance()) return this;
      if (!other.getIban().isEmpty()) {
        iban_ = other.iban_;
        onChanged();
      }
      if (other.hasBirthDate()) {
        mergeBirthDate(other.getBirthDate());
      }
      if (!other.getPhone().isEmpty()) {
        phone_ = other.phone_;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      UserForgetUserIdRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (UserForgetUserIdRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object iban_ = "";
    /**
     * <code>string iban = 1;</code>
     */
    public String getIban() {
      Object ref = iban_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        iban_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string iban = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIbanBytes() {
      Object ref = iban_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        iban_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string iban = 1;</code>
     */
    public Builder setIban(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      iban_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string iban = 1;</code>
     */
    public Builder clearIban() {

      iban_ = getDefaultInstance().getIban();
      onChanged();
      return this;
    }
    /**
     * <code>string iban = 1;</code>
     */
    public Builder setIbanBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      iban_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp birthDate_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> birthDateBuilder_;
    /**
     * <code>.google.protobuf.Timestamp birth_date = 2;</code>
     */
    public boolean hasBirthDate() {
      return birthDateBuilder_ != null || birthDate_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp birth_date = 2;</code>
     */
    public com.google.protobuf.Timestamp getBirthDate() {
      if (birthDateBuilder_ == null) {
        return birthDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : birthDate_;
      } else {
        return birthDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp birth_date = 2;</code>
     */
    public Builder setBirthDate(com.google.protobuf.Timestamp value) {
      if (birthDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        birthDate_ = value;
        onChanged();
      } else {
        birthDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp birth_date = 2;</code>
     */
    public Builder setBirthDate(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (birthDateBuilder_ == null) {
        birthDate_ = builderForValue.build();
        onChanged();
      } else {
        birthDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp birth_date = 2;</code>
     */
    public Builder mergeBirthDate(com.google.protobuf.Timestamp value) {
      if (birthDateBuilder_ == null) {
        if (birthDate_ != null) {
          birthDate_ =
            com.google.protobuf.Timestamp.newBuilder(birthDate_).mergeFrom(value).buildPartial();
        } else {
          birthDate_ = value;
        }
        onChanged();
      } else {
        birthDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp birth_date = 2;</code>
     */
    public Builder clearBirthDate() {
      if (birthDateBuilder_ == null) {
        birthDate_ = null;
        onChanged();
      } else {
        birthDate_ = null;
        birthDateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp birth_date = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getBirthDateBuilder() {

      onChanged();
      return getBirthDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp birth_date = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getBirthDateOrBuilder() {
      if (birthDateBuilder_ != null) {
        return birthDateBuilder_.getMessageOrBuilder();
      } else {
        return birthDate_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : birthDate_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp birth_date = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>
        getBirthDateFieldBuilder() {
      if (birthDateBuilder_ == null) {
        birthDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getBirthDate(),
                getParentForChildren(),
                isClean());
        birthDate_ = null;
      }
      return birthDateBuilder_;
    }

    private Object phone_ = "";
    /**
     * <code>string phone = 3;</code>
     */
    public String getPhone() {
      Object ref = phone_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        phone_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string phone = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      Object ref = phone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        phone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string phone = 3;</code>
     */
    public Builder setPhone(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      phone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string phone = 3;</code>
     */
    public Builder clearPhone() {

      phone_ = getDefaultInstance().getPhone();
      onChanged();
      return this;
    }
    /**
     * <code>string phone = 3;</code>
     */
    public Builder setPhoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      phone_ = value;
      onChanged();
      return this;
    }

    private Object email_ = "";
    /**
     * <code>string email = 4;</code>
     */
    public String getEmail() {
      Object ref = email_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string email = 4;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 4;</code>
     */
    public Builder setEmail(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 4;</code>
     */
    public Builder clearEmail() {

      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 4;</code>
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      email_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rpc.UserForgetUserIdRequest)
  }

  // @@protoc_insertion_point(class_scope:rpc.UserForgetUserIdRequest)
  private static final UserForgetUserIdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UserForgetUserIdRequest();
  }

  public static UserForgetUserIdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserForgetUserIdRequest>
      PARSER = new com.google.protobuf.AbstractParser<UserForgetUserIdRequest>() {
    public UserForgetUserIdRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserForgetUserIdRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserForgetUserIdRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UserForgetUserIdRequest> getParserForType() {
    return PARSER;
  }

  public UserForgetUserIdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

