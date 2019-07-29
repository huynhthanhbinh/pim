// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupList.proto

package com.bht.pim.proto.group;

/**
 * Protobuf type {@code com.bht.pim.proto.group.GroupList}
 */
public final class GroupList extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.bht.pim.proto.group.GroupList)
        GroupListOrBuilder {
    public static final int GROUPLIST_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:com.bht.pim.proto.group.GroupList)
    private static final GroupList DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<GroupList>
            PARSER = new com.google.protobuf.AbstractParser<GroupList>() {
        public GroupList parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new GroupList(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new GroupList();
    }

    private java.util.List<Group> groupList_;
    private byte memoizedIsInitialized = -1;

    // Use GroupList.newBuilder() to construct.
    private GroupList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GroupList() {
        groupList_ = java.util.Collections.emptyList();
    }

    private GroupList(
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
                        if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                            groupList_ = new java.util.ArrayList<Group>();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        groupList_.add(
                                input.readMessage(Group.parser(), extensionRegistry));
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
            if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                groupList_ = java.util.Collections.unmodifiableList(groupList_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.bht.pim.proto.group.GroupListOuterClass.internal_static_com_bht_pim_proto_group_GroupList_descriptor;
    }

    public static GroupList parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static GroupList parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static GroupList parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static GroupList parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static GroupList parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static GroupList parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static GroupList parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static GroupList parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static GroupList parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static GroupList parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static GroupList parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static GroupList parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(GroupList prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static GroupList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<GroupList> parser() {
        return PARSER;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.bht.pim.proto.group.GroupListOuterClass.internal_static_com_bht_pim_proto_group_GroupList_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        GroupList.class, Builder.class);
    }

    /**
     * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
     */
    public java.util.List<Group> getGroupListList() {
        return groupList_;
    }

    /**
     * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
     */
    public java.util.List<? extends GroupOrBuilder>
    getGroupListOrBuilderList() {
        return groupList_;
    }

    /**
     * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
     */
    public int getGroupListCount() {
        return groupList_.size();
    }

    /**
     * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
     */
    public Group getGroupList(int index) {
        return groupList_.get(index);
    }

    /**
     * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
     */
    public com.bht.pim.proto.group.GroupOrBuilder getGroupListOrBuilder(
            int index) {
        return groupList_.get(index);
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
        for (int i = 0; i < groupList_.size(); i++) {
            output.writeMessage(1, groupList_.get(i));
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        for (int i = 0; i < groupList_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(1, groupList_.get(i));
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
        if (!(obj instanceof GroupList)) {
            return super.equals(obj);
        }
        GroupList other = (GroupList) obj;

        boolean result = true;
        result = result && getGroupListList()
                .equals(other.getGroupListList());
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
        if (getGroupListCount() > 0) {
            hash = (37 * hash) + GROUPLIST_FIELD_NUMBER;
            hash = (53 * hash) + getGroupListList().hashCode();
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
    public com.google.protobuf.Parser<GroupList> getParserForType() {
        return PARSER;
    }

    public GroupList getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code com.bht.pim.proto.group.GroupList}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:com.bht.pim.proto.group.GroupList)
            com.bht.pim.proto.group.GroupListOrBuilder {
        private int bitField0_;
        private java.util.List<Group> groupList_ =
                java.util.Collections.emptyList();
        private com.google.protobuf.RepeatedFieldBuilderV3<
                Group, Group.Builder, GroupOrBuilder> groupListBuilder_;

        // Construct using com.bht.pim.proto.group.GroupList.newBuilder()
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
            return com.bht.pim.proto.group.GroupListOuterClass.internal_static_com_bht_pim_proto_group_GroupList_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.bht.pim.proto.group.GroupListOuterClass.internal_static_com_bht_pim_proto_group_GroupList_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            GroupList.class, Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
                getGroupListFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (groupListBuilder_ == null) {
                groupList_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
            } else {
                groupListBuilder_.clear();
            }
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.bht.pim.proto.group.GroupListOuterClass.internal_static_com_bht_pim_proto_group_GroupList_descriptor;
        }

        public GroupList getDefaultInstanceForType() {
            return GroupList.getDefaultInstance();
        }

        public GroupList build() {
            GroupList result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public GroupList buildPartial() {
            GroupList result = new GroupList(this);
            int from_bitField0_ = bitField0_;
            if (groupListBuilder_ == null) {
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    groupList_ = java.util.Collections.unmodifiableList(groupList_);
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.groupList_ = groupList_;
            } else {
                result.groupList_ = groupListBuilder_.build();
            }
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
            if (other instanceof GroupList) {
                return mergeFrom((GroupList) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(GroupList other) {
            if (other == GroupList.getDefaultInstance()) return this;
            if (groupListBuilder_ == null) {
                if (!other.groupList_.isEmpty()) {
                    if (groupList_.isEmpty()) {
                        groupList_ = other.groupList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureGroupListIsMutable();
                        groupList_.addAll(other.groupList_);
                    }
                    onChanged();
                }
            } else {
                if (!other.groupList_.isEmpty()) {
                    if (groupListBuilder_.isEmpty()) {
                        groupListBuilder_.dispose();
                        groupListBuilder_ = null;
                        groupList_ = other.groupList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                        groupListBuilder_ =
                                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                        getGroupListFieldBuilder() : null;
                    } else {
                        groupListBuilder_.addAllMessages(other.groupList_);
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
            GroupList parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (GroupList) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private void ensureGroupListIsMutable() {
            if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                groupList_ = new java.util.ArrayList<Group>(groupList_);
                bitField0_ |= 0x00000001;
            }
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public java.util.List<Group> getGroupListList() {
            if (groupListBuilder_ == null) {
                return java.util.Collections.unmodifiableList(groupList_);
            } else {
                return groupListBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public int getGroupListCount() {
            if (groupListBuilder_ == null) {
                return groupList_.size();
            } else {
                return groupListBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Group getGroupList(int index) {
            if (groupListBuilder_ == null) {
                return groupList_.get(index);
            } else {
                return groupListBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Builder setGroupList(
                int index, Group value) {
            if (groupListBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureGroupListIsMutable();
                groupList_.set(index, value);
                onChanged();
            } else {
                groupListBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Builder setGroupList(
                int index, Group.Builder builderForValue) {
            if (groupListBuilder_ == null) {
                ensureGroupListIsMutable();
                groupList_.set(index, builderForValue.build());
                onChanged();
            } else {
                groupListBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Builder addGroupList(Group value) {
            if (groupListBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureGroupListIsMutable();
                groupList_.add(value);
                onChanged();
            } else {
                groupListBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Builder addGroupList(
                int index, Group value) {
            if (groupListBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureGroupListIsMutable();
                groupList_.add(index, value);
                onChanged();
            } else {
                groupListBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Builder addGroupList(
                Group.Builder builderForValue) {
            if (groupListBuilder_ == null) {
                ensureGroupListIsMutable();
                groupList_.add(builderForValue.build());
                onChanged();
            } else {
                groupListBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Builder addGroupList(
                int index, Group.Builder builderForValue) {
            if (groupListBuilder_ == null) {
                ensureGroupListIsMutable();
                groupList_.add(index, builderForValue.build());
                onChanged();
            } else {
                groupListBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Builder addAllGroupList(
                Iterable<? extends Group> values) {
            if (groupListBuilder_ == null) {
                ensureGroupListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                        values, groupList_);
                onChanged();
            } else {
                groupListBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Builder clearGroupList() {
            if (groupListBuilder_ == null) {
                groupList_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
            } else {
                groupListBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Builder removeGroupList(int index) {
            if (groupListBuilder_ == null) {
                ensureGroupListIsMutable();
                groupList_.remove(index);
                onChanged();
            } else {
                groupListBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Group.Builder getGroupListBuilder(
                int index) {
            return getGroupListFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public com.bht.pim.proto.group.GroupOrBuilder getGroupListOrBuilder(
                int index) {
            if (groupListBuilder_ == null) {
                return groupList_.get(index);
            } else {
                return groupListBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public java.util.List<? extends GroupOrBuilder>
        getGroupListOrBuilderList() {
            if (groupListBuilder_ != null) {
                return groupListBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(groupList_);
            }
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Group.Builder addGroupListBuilder() {
            return getGroupListFieldBuilder().addBuilder(
                    Group.getDefaultInstance());
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public Group.Builder addGroupListBuilder(
                int index) {
            return getGroupListFieldBuilder().addBuilder(
                    index, Group.getDefaultInstance());
        }

        /**
         * <code>repeated .com.bht.pim.proto.group.Group groupList = 1;</code>
         */
        public java.util.List<Group.Builder>
        getGroupListBuilderList() {
            return getGroupListFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
                Group, Group.Builder, GroupOrBuilder>
        getGroupListFieldBuilder() {
            if (groupListBuilder_ == null) {
                groupListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                        Group, Group.Builder, GroupOrBuilder>(
                        groupList_,
                        ((bitField0_ & 0x00000001) == 0x00000001),
                        getParentForChildren(),
                        isClean());
                groupList_ = null;
            }
            return groupListBuilder_;
        }

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:com.bht.pim.proto.group.GroupList)
    }

}

