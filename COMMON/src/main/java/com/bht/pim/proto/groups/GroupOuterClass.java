// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Group.proto

package com.bht.pim.proto.groups;

import com.bht.pim.proto.projects.ProjectInfoOuterClass;

public final class GroupOuterClass {
    private GroupOuterClass() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_bht_pim_proto_groups_Group_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_bht_pim_proto_groups_Group_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_bht_pim_proto_groups_GroupList_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_bht_pim_proto_groups_GroupList_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_bht_pim_proto_groups_GroupPagination_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_bht_pim_proto_groups_GroupPagination_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\013Group.proto\022\030com.bht.pim.proto.groups\032" +
                        "\036google/protobuf/wrappers.proto\032\033google/" +
                        "protobuf/empty.proto\032\024info/GroupInfo.pro" +
                        "to\032\026info/ProjectInfo.proto\"\202\001\n\005Group\0226\n\t" +
                        "groupInfo\030\001 \001(\0132#.com.bht.pim.proto.grou" +
                        "ps.GroupInfo\022A\n\020enrolledProjects\030\002 \003(\0132\'" +
                        ".com.bht.pim.proto.projects.ProjectInfo\"" +
                        "<\n\tGroupList\022/\n\006groups\030\001 \003(\0132\037.com.bht.p" +
                        "im.proto.groups.Group\"4\n\017GroupPagination" +
                        "\022\016\n\006maxRow\030\001 \001(\005\022\021\n\tpageIndex\030\002 \001(\0052\322\002\n\014" +
                        "GroupService\022L\n\014getGroupById\022\033.google.pr" +
                        "otobuf.Int64Value\032\037.com.bht.pim.proto.gr" +
                        "oups.Group\022J\n\013addNewGroup\022\037.com.bht.pim." +
                        "proto.groups.Group\032\032.google.protobuf.Boo" +
                        "lValue\022^\n\014getGroupList\022).com.bht.pim.pro" +
                        "to.groups.GroupPagination\032#.com.bht.pim." +
                        "proto.groups.GroupList\022H\n\021getNumberOfGro" +
                        "ups\022\026.google.protobuf.Empty\032\033.google.pro" +
                        "tobuf.Int64ValueB\005P\001\210\001\001b\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    @Override
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                                com.google.protobuf.WrappersProto.getDescriptor(),
                                com.google.protobuf.EmptyProto.getDescriptor(),
                                GroupInfoOuterClass.getDescriptor(),
                                ProjectInfoOuterClass.getDescriptor(),
                        }, assigner);
        internal_static_com_bht_pim_proto_groups_Group_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_bht_pim_proto_groups_Group_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_bht_pim_proto_groups_Group_descriptor,
                new String[]{"GroupInfo", "EnrolledProjects",});
        internal_static_com_bht_pim_proto_groups_GroupList_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_com_bht_pim_proto_groups_GroupList_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_bht_pim_proto_groups_GroupList_descriptor,
                new String[]{"Groups",});
        internal_static_com_bht_pim_proto_groups_GroupPagination_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_com_bht_pim_proto_groups_GroupPagination_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_bht_pim_proto_groups_GroupPagination_descriptor,
                new String[]{"MaxRow", "PageIndex",});
        com.google.protobuf.WrappersProto.getDescriptor();
        com.google.protobuf.EmptyProto.getDescriptor();
        GroupInfoOuterClass.getDescriptor();
        ProjectInfoOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}