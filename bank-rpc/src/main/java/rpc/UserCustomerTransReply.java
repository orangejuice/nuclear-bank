// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer.proto

package rpc;

/**
 * Protobuf type {@code rpc.UserCustomerTransReply}
 */
public final class UserCustomerTransReply extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:rpc.UserCustomerTransReply)
        UserCustomerTransReplyOrBuilder {
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int TRANS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:rpc.UserCustomerTransReply)
    private static final UserCustomerTransReply DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<UserCustomerTransReply>
            PARSER = new com.google.protobuf.AbstractParser<UserCustomerTransReply>() {
        public UserCustomerTransReply parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new UserCustomerTransReply(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new UserCustomerTransReply();
    }

    private int bitField0_;
    private ReplyBaseOuterClass.ReplyBase base_;
    private java.util.List<UserCustomerTran> trans_;
    private byte memoizedIsInitialized = -1;

    // Use UserCustomerTransReply.newBuilder() to construct.
    private UserCustomerTransReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private UserCustomerTransReply() {
        trans_ = java.util.Collections.emptyList();
    }

    private UserCustomerTransReply(
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
                        ReplyBaseOuterClass.ReplyBase.Builder subBuilder = null;
                        if (base_ != null) {
                            subBuilder = base_.toBuilder();
                        }
                        base_ = input.readMessage(ReplyBaseOuterClass.ReplyBase.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(base_);
                            base_ = subBuilder.buildPartial();
                        }

                        break;
                    }
                    case 18: {
                        if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                            trans_ = new java.util.ArrayList<UserCustomerTran>();
                            mutable_bitField0_ |= 0x00000002;
                        }
                        trans_.add(
                                input.readMessage(UserCustomerTran.parser(), extensionRegistry));
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
            if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                trans_ = java.util.Collections.unmodifiableList(trans_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return UserCustomerProto.internal_static_rpc_UserCustomerTransReply_descriptor;
    }

    public static UserCustomerTransReply parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static UserCustomerTransReply parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static UserCustomerTransReply parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static UserCustomerTransReply parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static UserCustomerTransReply parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static UserCustomerTransReply parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static UserCustomerTransReply parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static UserCustomerTransReply parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static UserCustomerTransReply parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static UserCustomerTransReply parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static UserCustomerTransReply parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static UserCustomerTransReply parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(UserCustomerTransReply prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static UserCustomerTransReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<UserCustomerTransReply> parser() {
        return PARSER;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return UserCustomerProto.internal_static_rpc_UserCustomerTransReply_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        UserCustomerTransReply.class, Builder.class);
    }

    /**
     * <code>.ReplyBase base = 1;</code>
     */
    public boolean hasBase() {
        return base_ != null;
    }

    /**
     * <code>.ReplyBase base = 1;</code>
     */
    public ReplyBaseOuterClass.ReplyBase getBase() {
        return base_ == null ? ReplyBaseOuterClass.ReplyBase.getDefaultInstance() : base_;
    }

    /**
     * <code>.ReplyBase base = 1;</code>
     */
    public ReplyBaseOuterClass.ReplyBaseOrBuilder getBaseOrBuilder() {
        return getBase();
    }

    /**
     * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
     */
    public java.util.List<UserCustomerTran> getTransList() {
        return trans_;
    }

    /**
     * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
     */
    public java.util.List<? extends UserCustomerTranOrBuilder>
    getTransOrBuilderList() {
        return trans_;
    }

    /**
     * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
     */
    public int getTransCount() {
        return trans_.size();
    }

    /**
     * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
     */
    public UserCustomerTran getTrans(int index) {
        return trans_.get(index);
    }

    /**
     * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
     */
    public UserCustomerTranOrBuilder getTransOrBuilder(
            int index) {
        return trans_.get(index);
    }

    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (base_ != null) {
            output.writeMessage(1, getBase());
        }
        for (int i = 0; i < trans_.size(); i++) {
            output.writeMessage(2, trans_.get(i));
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (base_ != null) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(1, getBase());
        }
        for (int i = 0; i < trans_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(2, trans_.get(i));
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
        if (!(obj instanceof UserCustomerTransReply)) {
            return super.equals(obj);
        }
        UserCustomerTransReply other = (UserCustomerTransReply) obj;

        boolean result = true;
        result = result && (hasBase() == other.hasBase());
        if (hasBase()) {
            result = result && getBase()
                    .equals(other.getBase());
        }
        result = result && getTransList()
                .equals(other.getTransList());
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
        if (hasBase()) {
            hash = (37 * hash) + BASE_FIELD_NUMBER;
            hash = (53 * hash) + getBase().hashCode();
        }
        if (getTransCount() > 0) {
            hash = (37 * hash) + TRANS_FIELD_NUMBER;
            hash = (53 * hash) + getTransList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public Builder newBuilderForType() {
        return newBuilder();
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

    @Override
    public com.google.protobuf.Parser<UserCustomerTransReply> getParserForType() {
        return PARSER;
    }

    public UserCustomerTransReply getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code rpc.UserCustomerTransReply}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:rpc.UserCustomerTransReply)
            UserCustomerTransReplyOrBuilder {
        private int bitField0_;
        private ReplyBaseOuterClass.ReplyBase base_ = null;
        private com.google.protobuf.SingleFieldBuilderV3<
                ReplyBaseOuterClass.ReplyBase, ReplyBaseOuterClass.ReplyBase.Builder, ReplyBaseOuterClass.ReplyBaseOrBuilder> baseBuilder_;
        private java.util.List<UserCustomerTran> trans_ =
                java.util.Collections.emptyList();
        private com.google.protobuf.RepeatedFieldBuilderV3<
                UserCustomerTran, UserCustomerTran.Builder, UserCustomerTranOrBuilder> transBuilder_;

        // Construct using rpc.UserCustomerTransReply.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return UserCustomerProto.internal_static_rpc_UserCustomerTransReply_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return UserCustomerProto.internal_static_rpc_UserCustomerTransReply_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            UserCustomerTransReply.class, Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
                getTransFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (baseBuilder_ == null) {
                base_ = null;
            } else {
                base_ = null;
                baseBuilder_ = null;
            }
            if (transBuilder_ == null) {
                trans_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
            } else {
                transBuilder_.clear();
            }
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return UserCustomerProto.internal_static_rpc_UserCustomerTransReply_descriptor;
        }

        public UserCustomerTransReply getDefaultInstanceForType() {
            return UserCustomerTransReply.getDefaultInstance();
        }

        public UserCustomerTransReply build() {
            UserCustomerTransReply result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public UserCustomerTransReply buildPartial() {
            UserCustomerTransReply result = new UserCustomerTransReply(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (baseBuilder_ == null) {
                result.base_ = base_;
            } else {
                result.base_ = baseBuilder_.build();
            }
            if (transBuilder_ == null) {
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    trans_ = java.util.Collections.unmodifiableList(trans_);
                    bitField0_ = (bitField0_ & ~0x00000002);
                }
                result.trans_ = trans_;
            } else {
                result.trans_ = transBuilder_.build();
            }
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder clone() {
            return super.clone();
        }

        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return super.setField(field, value);
        }

        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, Object value) {
            return super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof UserCustomerTransReply) {
                return mergeFrom((UserCustomerTransReply) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(UserCustomerTransReply other) {
            if (other == UserCustomerTransReply.getDefaultInstance()) return this;
            if (other.hasBase()) {
                mergeBase(other.getBase());
            }
            if (transBuilder_ == null) {
                if (!other.trans_.isEmpty()) {
                    if (trans_.isEmpty()) {
                        trans_ = other.trans_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                    } else {
                        ensureTransIsMutable();
                        trans_.addAll(other.trans_);
                    }
                    onChanged();
                }
            } else {
                if (!other.trans_.isEmpty()) {
                    if (transBuilder_.isEmpty()) {
                        transBuilder_.dispose();
                        transBuilder_ = null;
                        trans_ = other.trans_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                        transBuilder_ =
                                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                        getTransFieldBuilder() : null;
                    } else {
                        transBuilder_.addAllMessages(other.trans_);
                    }
                }
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
            UserCustomerTransReply parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (UserCustomerTransReply) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        /**
         * <code>.ReplyBase base = 1;</code>
         */
        public boolean hasBase() {
            return baseBuilder_ != null || base_ != null;
        }

        /**
         * <code>.ReplyBase base = 1;</code>
         */
        public ReplyBaseOuterClass.ReplyBase getBase() {
            if (baseBuilder_ == null) {
                return base_ == null ? ReplyBaseOuterClass.ReplyBase.getDefaultInstance() : base_;
            } else {
                return baseBuilder_.getMessage();
            }
        }

        /**
         * <code>.ReplyBase base = 1;</code>
         */
        public Builder setBase(
                ReplyBaseOuterClass.ReplyBase.Builder builderForValue) {
            if (baseBuilder_ == null) {
                base_ = builderForValue.build();
                onChanged();
            } else {
                baseBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        /**
         * <code>.ReplyBase base = 1;</code>
         */
        public Builder setBase(ReplyBaseOuterClass.ReplyBase value) {
            if (baseBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                base_ = value;
                onChanged();
            } else {
                baseBuilder_.setMessage(value);
            }

            return this;
        }

        /**
         * <code>.ReplyBase base = 1;</code>
         */
        public Builder mergeBase(ReplyBaseOuterClass.ReplyBase value) {
            if (baseBuilder_ == null) {
                if (base_ != null) {
                    base_ =
                            ReplyBaseOuterClass.ReplyBase.newBuilder(base_).mergeFrom(value).buildPartial();
                } else {
                    base_ = value;
                }
                onChanged();
            } else {
                baseBuilder_.mergeFrom(value);
            }

            return this;
        }

        /**
         * <code>.ReplyBase base = 1;</code>
         */
        public Builder clearBase() {
            if (baseBuilder_ == null) {
                base_ = null;
                onChanged();
            } else {
                base_ = null;
                baseBuilder_ = null;
            }

            return this;
        }

        /**
         * <code>.ReplyBase base = 1;</code>
         */
        public ReplyBaseOuterClass.ReplyBase.Builder getBaseBuilder() {

            onChanged();
            return getBaseFieldBuilder().getBuilder();
        }

        /**
         * <code>.ReplyBase base = 1;</code>
         */
        public ReplyBaseOuterClass.ReplyBaseOrBuilder getBaseOrBuilder() {
            if (baseBuilder_ != null) {
                return baseBuilder_.getMessageOrBuilder();
            } else {
                return base_ == null ?
                        ReplyBaseOuterClass.ReplyBase.getDefaultInstance() : base_;
            }
        }

        /**
         * <code>.ReplyBase base = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                ReplyBaseOuterClass.ReplyBase, ReplyBaseOuterClass.ReplyBase.Builder, ReplyBaseOuterClass.ReplyBaseOrBuilder>
        getBaseFieldBuilder() {
            if (baseBuilder_ == null) {
                baseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        ReplyBaseOuterClass.ReplyBase, ReplyBaseOuterClass.ReplyBase.Builder, ReplyBaseOuterClass.ReplyBaseOrBuilder>(
                        getBase(),
                        getParentForChildren(),
                        isClean());
                base_ = null;
            }
            return baseBuilder_;
        }

        private void ensureTransIsMutable() {
            if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                trans_ = new java.util.ArrayList<UserCustomerTran>(trans_);
                bitField0_ |= 0x00000002;
            }
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public java.util.List<UserCustomerTran> getTransList() {
            if (transBuilder_ == null) {
                return java.util.Collections.unmodifiableList(trans_);
            } else {
                return transBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public int getTransCount() {
            if (transBuilder_ == null) {
                return trans_.size();
            } else {
                return transBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public UserCustomerTran getTrans(int index) {
            if (transBuilder_ == null) {
                return trans_.get(index);
            } else {
                return transBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public Builder setTrans(
                int index, UserCustomerTran value) {
            if (transBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureTransIsMutable();
                trans_.set(index, value);
                onChanged();
            } else {
                transBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public Builder setTrans(
                int index, UserCustomerTran.Builder builderForValue) {
            if (transBuilder_ == null) {
                ensureTransIsMutable();
                trans_.set(index, builderForValue.build());
                onChanged();
            } else {
                transBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public Builder addTrans(UserCustomerTran value) {
            if (transBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureTransIsMutable();
                trans_.add(value);
                onChanged();
            } else {
                transBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public Builder addTrans(
                int index, UserCustomerTran value) {
            if (transBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureTransIsMutable();
                trans_.add(index, value);
                onChanged();
            } else {
                transBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public Builder addTrans(
                UserCustomerTran.Builder builderForValue) {
            if (transBuilder_ == null) {
                ensureTransIsMutable();
                trans_.add(builderForValue.build());
                onChanged();
            } else {
                transBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public Builder addTrans(
                int index, UserCustomerTran.Builder builderForValue) {
            if (transBuilder_ == null) {
                ensureTransIsMutable();
                trans_.add(index, builderForValue.build());
                onChanged();
            } else {
                transBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public Builder addAllTrans(
                Iterable<? extends UserCustomerTran> values) {
            if (transBuilder_ == null) {
                ensureTransIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                        values, trans_);
                onChanged();
            } else {
                transBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public Builder clearTrans() {
            if (transBuilder_ == null) {
                trans_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                onChanged();
            } else {
                transBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public Builder removeTrans(int index) {
            if (transBuilder_ == null) {
                ensureTransIsMutable();
                trans_.remove(index);
                onChanged();
            } else {
                transBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public UserCustomerTran.Builder getTransBuilder(
                int index) {
            return getTransFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public UserCustomerTranOrBuilder getTransOrBuilder(
                int index) {
            if (transBuilder_ == null) {
                return trans_.get(index);
            } else {
                return transBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public java.util.List<? extends UserCustomerTranOrBuilder>
        getTransOrBuilderList() {
            if (transBuilder_ != null) {
                return transBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(trans_);
            }
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public UserCustomerTran.Builder addTransBuilder() {
            return getTransFieldBuilder().addBuilder(
                    UserCustomerTran.getDefaultInstance());
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public UserCustomerTran.Builder addTransBuilder(
                int index) {
            return getTransFieldBuilder().addBuilder(
                    index, UserCustomerTran.getDefaultInstance());
        }

        /**
         * <code>repeated .rpc.UserCustomerTran trans = 2;</code>
         */
        public java.util.List<UserCustomerTran.Builder>
        getTransBuilderList() {
            return getTransFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
                UserCustomerTran, UserCustomerTran.Builder, UserCustomerTranOrBuilder>
        getTransFieldBuilder() {
            if (transBuilder_ == null) {
                transBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                        UserCustomerTran, UserCustomerTran.Builder, UserCustomerTranOrBuilder>(
                        trans_,
                        ((bitField0_ & 0x00000002) == 0x00000002),
                        getParentForChildren(),
                        isClean());
                trans_ = null;
            }
            return transBuilder_;
        }

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:rpc.UserCustomerTransReply)
    }

}

