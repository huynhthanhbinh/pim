// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProjectInfo.proto

package com.bht.pim.proto.projects;

import com.bht.pim.proto.employees.Employee;
import com.bht.pim.proto.employees.EmployeeOrBuilder;

/**
 * Protobuf type {@code com.bht.pim.proto.projects.ProjectInfo}
 */
public final class ProjectInfo extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:com.bht.pim.proto.projects.ProjectInfo)
        ProjectInfoOrBuilder {
    public static final int PROJECT_FIELD_NUMBER = 1;
    public static final int EMPLOYEE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:com.bht.pim.proto.projects.ProjectInfo)
    private static final ProjectInfo DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<ProjectInfo>
            PARSER = new com.google.protobuf.AbstractParser<ProjectInfo>() {
        public ProjectInfo parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new ProjectInfo(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new ProjectInfo();
    }

    private int bitField0_;
    private Project project_;
    private java.util.List<Employee> employee_;
    private byte memoizedIsInitialized = -1;

    // Use ProjectInfo.newBuilder() to construct.
    private ProjectInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ProjectInfo() {
        employee_ = java.util.Collections.emptyList();
    }

    private ProjectInfo(
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
                        Project.Builder subBuilder = null;
                        if (project_ != null) {
                            subBuilder = project_.toBuilder();
                        }
                        project_ = input.readMessage(Project.parser(), extensionRegistry);
                        if (subBuilder != null) {
                            subBuilder.mergeFrom(project_);
                            project_ = subBuilder.buildPartial();
                        }

                        break;
                    }
                    case 18: {
                        if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                            employee_ = new java.util.ArrayList<Employee>();
                            mutable_bitField0_ |= 0x00000002;
                        }
                        employee_.add(
                                input.readMessage(Employee.parser(), extensionRegistry));
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
                employee_ = java.util.Collections.unmodifiableList(employee_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return ProjectInfoOuterClass.internal_static_com_bht_pim_proto_projects_ProjectInfo_descriptor;
    }

    public static ProjectInfo parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ProjectInfo parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ProjectInfo parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ProjectInfo parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ProjectInfo parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ProjectInfo parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ProjectInfo parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static ProjectInfo parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ProjectInfo parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static ProjectInfo parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static ProjectInfo parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static ProjectInfo parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ProjectInfo prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static ProjectInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<ProjectInfo> parser() {
        return PARSER;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return ProjectInfoOuterClass.internal_static_com_bht_pim_proto_projects_ProjectInfo_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        ProjectInfo.class, ProjectInfo.Builder.class);
    }

    /**
     * <code>.com.bht.pim.proto.projects.Project project = 1;</code>
     */
    public boolean hasProject() {
        return project_ != null;
    }

    /**
     * <code>.com.bht.pim.proto.projects.Project project = 1;</code>
     */
    public Project getProject() {
        return project_ == null ? Project.getDefaultInstance() : project_;
    }

    /**
     * <code>.com.bht.pim.proto.projects.Project project = 1;</code>
     */
    public ProjectOrBuilder getProjectOrBuilder() {
        return getProject();
    }

    /**
     * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
     */
    public java.util.List<Employee> getEmployeeList() {
        return employee_;
    }

    /**
     * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
     */
    public java.util.List<? extends EmployeeOrBuilder>
    getEmployeeOrBuilderList() {
        return employee_;
    }

    /**
     * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
     */
    public int getEmployeeCount() {
        return employee_.size();
    }

    /**
     * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
     */
    public Employee getEmployee(int index) {
        return employee_.get(index);
    }

    /**
     * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
     */
    public EmployeeOrBuilder getEmployeeOrBuilder(
            int index) {
        return employee_.get(index);
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
        if (project_ != null) {
            output.writeMessage(1, getProject());
        }
        for (int i = 0; i < employee_.size(); i++) {
            output.writeMessage(2, employee_.get(i));
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (project_ != null) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(1, getProject());
        }
        for (int i = 0; i < employee_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(2, employee_.get(i));
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
        if (!(obj instanceof ProjectInfo)) {
            return super.equals(obj);
        }
        ProjectInfo other = (ProjectInfo) obj;

        boolean result = true;
        result = result && (hasProject() == other.hasProject());
        if (hasProject()) {
            result = result && getProject()
                    .equals(other.getProject());
        }
        result = result && getEmployeeList()
                .equals(other.getEmployeeList());
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
        if (hasProject()) {
            hash = (37 * hash) + PROJECT_FIELD_NUMBER;
            hash = (53 * hash) + getProject().hashCode();
        }
        if (getEmployeeCount() > 0) {
            hash = (37 * hash) + EMPLOYEE_FIELD_NUMBER;
            hash = (53 * hash) + getEmployeeList().hashCode();
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
    public com.google.protobuf.Parser<ProjectInfo> getParserForType() {
        return PARSER;
    }

    public ProjectInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code com.bht.pim.proto.projects.ProjectInfo}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:com.bht.pim.proto.projects.ProjectInfo)
            ProjectInfoOrBuilder {
        private int bitField0_;
        private Project project_ = null;
        private com.google.protobuf.SingleFieldBuilderV3<
                Project, Project.Builder, ProjectOrBuilder> projectBuilder_;
        private java.util.List<Employee> employee_ =
                java.util.Collections.emptyList();
        private com.google.protobuf.RepeatedFieldBuilderV3<
                Employee, Employee.Builder, EmployeeOrBuilder> employeeBuilder_;

        // Construct using com.bht.pim.proto.projects.ProjectInfo.newBuilder()
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
            return ProjectInfoOuterClass.internal_static_com_bht_pim_proto_projects_ProjectInfo_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProjectInfoOuterClass.internal_static_com_bht_pim_proto_projects_ProjectInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ProjectInfo.class, ProjectInfo.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
                getEmployeeFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (projectBuilder_ == null) {
                project_ = null;
            } else {
                project_ = null;
                projectBuilder_ = null;
            }
            if (employeeBuilder_ == null) {
                employee_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
            } else {
                employeeBuilder_.clear();
            }
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return ProjectInfoOuterClass.internal_static_com_bht_pim_proto_projects_ProjectInfo_descriptor;
        }

        public ProjectInfo getDefaultInstanceForType() {
            return ProjectInfo.getDefaultInstance();
        }

        public ProjectInfo build() {
            ProjectInfo result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public ProjectInfo buildPartial() {
            ProjectInfo result = new ProjectInfo(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (projectBuilder_ == null) {
                result.project_ = project_;
            } else {
                result.project_ = projectBuilder_.build();
            }
            if (employeeBuilder_ == null) {
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    employee_ = java.util.Collections.unmodifiableList(employee_);
                    bitField0_ = (bitField0_ & ~0x00000002);
                }
                result.employee_ = employee_;
            } else {
                result.employee_ = employeeBuilder_.build();
            }
            result.bitField0_ = to_bitField0_;
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
            if (other instanceof ProjectInfo) {
                return mergeFrom((ProjectInfo) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(ProjectInfo other) {
            if (other == ProjectInfo.getDefaultInstance()) return this;
            if (other.hasProject()) {
                mergeProject(other.getProject());
            }
            if (employeeBuilder_ == null) {
                if (!other.employee_.isEmpty()) {
                    if (employee_.isEmpty()) {
                        employee_ = other.employee_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                    } else {
                        ensureEmployeeIsMutable();
                        employee_.addAll(other.employee_);
                    }
                    onChanged();
                }
            } else {
                if (!other.employee_.isEmpty()) {
                    if (employeeBuilder_.isEmpty()) {
                        employeeBuilder_.dispose();
                        employeeBuilder_ = null;
                        employee_ = other.employee_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                        employeeBuilder_ =
                                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                        getEmployeeFieldBuilder() : null;
                    } else {
                        employeeBuilder_.addAllMessages(other.employee_);
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
            ProjectInfo parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (ProjectInfo) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        /**
         * <code>.com.bht.pim.proto.projects.Project project = 1;</code>
         */
        public boolean hasProject() {
            return projectBuilder_ != null || project_ != null;
        }

        /**
         * <code>.com.bht.pim.proto.projects.Project project = 1;</code>
         */
        public Project getProject() {
            if (projectBuilder_ == null) {
                return project_ == null ? Project.getDefaultInstance() : project_;
            } else {
                return projectBuilder_.getMessage();
            }
        }

        /**
         * <code>.com.bht.pim.proto.projects.Project project = 1;</code>
         */
        public Builder setProject(Project value) {
            if (projectBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                project_ = value;
                onChanged();
            } else {
                projectBuilder_.setMessage(value);
            }

            return this;
        }

        /**
         * <code>.com.bht.pim.proto.projects.Project project = 1;</code>
         */
        public Builder setProject(
                Project.Builder builderForValue) {
            if (projectBuilder_ == null) {
                project_ = builderForValue.build();
                onChanged();
            } else {
                projectBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        /**
         * <code>.com.bht.pim.proto.projects.Project project = 1;</code>
         */
        public Builder mergeProject(Project value) {
            if (projectBuilder_ == null) {
                if (project_ != null) {
                    project_ =
                            Project.newBuilder(project_).mergeFrom(value).buildPartial();
                } else {
                    project_ = value;
                }
                onChanged();
            } else {
                projectBuilder_.mergeFrom(value);
            }

            return this;
        }

        /**
         * <code>.com.bht.pim.proto.projects.Project project = 1;</code>
         */
        public Builder clearProject() {
            if (projectBuilder_ == null) {
                project_ = null;
                onChanged();
            } else {
                project_ = null;
                projectBuilder_ = null;
            }

            return this;
        }

        /**
         * <code>.com.bht.pim.proto.projects.Project project = 1;</code>
         */
        public Project.Builder getProjectBuilder() {

            onChanged();
            return getProjectFieldBuilder().getBuilder();
        }

        /**
         * <code>.com.bht.pim.proto.projects.Project project = 1;</code>
         */
        public ProjectOrBuilder getProjectOrBuilder() {
            if (projectBuilder_ != null) {
                return projectBuilder_.getMessageOrBuilder();
            } else {
                return project_ == null ?
                        Project.getDefaultInstance() : project_;
            }
        }

        /**
         * <code>.com.bht.pim.proto.projects.Project project = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                Project, Project.Builder, ProjectOrBuilder>
        getProjectFieldBuilder() {
            if (projectBuilder_ == null) {
                projectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        Project, Project.Builder, ProjectOrBuilder>(
                        getProject(),
                        getParentForChildren(),
                        isClean());
                project_ = null;
            }
            return projectBuilder_;
        }

        private void ensureEmployeeIsMutable() {
            if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                employee_ = new java.util.ArrayList<Employee>(employee_);
                bitField0_ |= 0x00000002;
            }
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public java.util.List<Employee> getEmployeeList() {
            if (employeeBuilder_ == null) {
                return java.util.Collections.unmodifiableList(employee_);
            } else {
                return employeeBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public int getEmployeeCount() {
            if (employeeBuilder_ == null) {
                return employee_.size();
            } else {
                return employeeBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Employee getEmployee(int index) {
            if (employeeBuilder_ == null) {
                return employee_.get(index);
            } else {
                return employeeBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Builder setEmployee(
                int index, Employee value) {
            if (employeeBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureEmployeeIsMutable();
                employee_.set(index, value);
                onChanged();
            } else {
                employeeBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Builder setEmployee(
                int index, Employee.Builder builderForValue) {
            if (employeeBuilder_ == null) {
                ensureEmployeeIsMutable();
                employee_.set(index, builderForValue.build());
                onChanged();
            } else {
                employeeBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Builder addEmployee(Employee value) {
            if (employeeBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureEmployeeIsMutable();
                employee_.add(value);
                onChanged();
            } else {
                employeeBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Builder addEmployee(
                int index, Employee value) {
            if (employeeBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureEmployeeIsMutable();
                employee_.add(index, value);
                onChanged();
            } else {
                employeeBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Builder addEmployee(
                Employee.Builder builderForValue) {
            if (employeeBuilder_ == null) {
                ensureEmployeeIsMutable();
                employee_.add(builderForValue.build());
                onChanged();
            } else {
                employeeBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Builder addEmployee(
                int index, Employee.Builder builderForValue) {
            if (employeeBuilder_ == null) {
                ensureEmployeeIsMutable();
                employee_.add(index, builderForValue.build());
                onChanged();
            } else {
                employeeBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Builder addAllEmployee(
                Iterable<? extends Employee> values) {
            if (employeeBuilder_ == null) {
                ensureEmployeeIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                        values, employee_);
                onChanged();
            } else {
                employeeBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Builder clearEmployee() {
            if (employeeBuilder_ == null) {
                employee_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                onChanged();
            } else {
                employeeBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Builder removeEmployee(int index) {
            if (employeeBuilder_ == null) {
                ensureEmployeeIsMutable();
                employee_.remove(index);
                onChanged();
            } else {
                employeeBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Employee.Builder getEmployeeBuilder(
                int index) {
            return getEmployeeFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public EmployeeOrBuilder getEmployeeOrBuilder(
                int index) {
            if (employeeBuilder_ == null) {
                return employee_.get(index);
            } else {
                return employeeBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public java.util.List<? extends EmployeeOrBuilder>
        getEmployeeOrBuilderList() {
            if (employeeBuilder_ != null) {
                return employeeBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(employee_);
            }
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Employee.Builder addEmployeeBuilder() {
            return getEmployeeFieldBuilder().addBuilder(
                    Employee.getDefaultInstance());
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public Employee.Builder addEmployeeBuilder(
                int index) {
            return getEmployeeFieldBuilder().addBuilder(
                    index, Employee.getDefaultInstance());
        }

        /**
         * <code>repeated .com.bht.pim.proto.employees.Employee employee = 2;</code>
         */
        public java.util.List<Employee.Builder>
        getEmployeeBuilderList() {
            return getEmployeeFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
                Employee, Employee.Builder, EmployeeOrBuilder>
        getEmployeeFieldBuilder() {
            if (employeeBuilder_ == null) {
                employeeBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                        Employee, Employee.Builder, EmployeeOrBuilder>(
                        employee_,
                        ((bitField0_ & 0x00000002) == 0x00000002),
                        getParentForChildren(),
                        isClean());
                employee_ = null;
            }
            return employeeBuilder_;
        }

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:com.bht.pim.proto.projects.ProjectInfo)
    }

}
