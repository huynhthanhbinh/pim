// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProjectInfo.proto

package com.bht.pim.proto.project;

public final class ProjectInfoOuterClass {
  private ProjectInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bht_pim_proto_project_ProjectInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bht_pim_proto_project_ProjectInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bht_pim_proto_project_ProjectId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bht_pim_proto_project_ProjectId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bht_pim_proto_project_Success_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_bht_pim_proto_project_Success_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021ProjectInfo.proto\022\031com.bht.pim.proto.p" +
      "roject\032\024ProjectNumbers.proto\032\rProject.pr" +
              "oto\032\016Employee.proto\"\220\001\n\013ProjectInfo\0223\n\007p" +
      "roject\030\001 \001(\0132\".com.bht.pim.proto.project" +
              ".Project\022\023\n\013groupLeader\030\002 \001(\t\0227\n\temploye" +
              "es\030\003 \003(\0132$.com.bht.pim.proto.employee.Em" +
              "ployee\"\027\n\tProjectId\022\n\n\002id\030\001 \001(\003\"\034\n\007Succe" +
              "ss\022\021\n\tisSuccess\030\001 \001(\0102\373\002\n\016ProjectService" +
              "\022^\n\016getProjectById\022$.com.bht.pim.proto.p" +
              "roject.ProjectId\032&.com.bht.pim.proto.pro" +
              "ject.ProjectInfo\022W\n\raddNewProject\022\".com." +
              "bht.pim.proto.project.Project\032\".com.bht." +
              "pim.proto.project.Success\022U\n\013editProject" +
              "\022\".com.bht.pim.proto.project.Project\032\".c" +
              "om.bht.pim.proto.project.Success\022Y\n\rdele" +
              "teProject\022$.com.bht.pim.proto.project.Pr" +
              "ojectId\032\".com.bht.pim.proto.project.Succ" +
              "essB\002P\001b\006proto3"
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
          com.bht.pim.proto.project.ProjectNumbersOuterClass.getDescriptor(),
          ProjectOuterClass.getDescriptor(),
          com.bht.pim.proto.employee.EmployeeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_com_bht_pim_proto_project_ProjectInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_bht_pim_proto_project_ProjectInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bht_pim_proto_project_ProjectInfo_descriptor,
            new String[]{"Project", "GroupLeader", "Employees",});
    internal_static_com_bht_pim_proto_project_ProjectId_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_bht_pim_proto_project_ProjectId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bht_pim_proto_project_ProjectId_descriptor,
        new String[] { "Id", });
    internal_static_com_bht_pim_proto_project_Success_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_bht_pim_proto_project_Success_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_bht_pim_proto_project_Success_descriptor,
        new String[] { "IsSuccess", });
    com.bht.pim.proto.project.ProjectNumbersOuterClass.getDescriptor();
    ProjectOuterClass.getDescriptor();
    com.bht.pim.proto.employee.EmployeeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}