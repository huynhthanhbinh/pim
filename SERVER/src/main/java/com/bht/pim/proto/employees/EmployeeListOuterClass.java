// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EmployeeList.proto

package com.bht.pim.proto.employees;

public final class EmployeeListOuterClass {
  private EmployeeListOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
          internal_static_com_bht_pim_proto_employees_EmployeeList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_com_bht_pim_proto_employees_EmployeeList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
          internal_static_com_bht_pim_proto_employees_NoParam_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internal_static_com_bht_pim_proto_employees_NoParam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
            "\n\022EmployeeList.proto\022\033com.bht.pim.proto." +
                    "employees\032\016Employee.proto\"G\n\014EmployeeLis" +
                    "t\0227\n\010employee\030\001 \003(\0132%.com.bht.pim.proto." +
                    "employees.Employee\"\t\n\007NoParam2y\n\023Employe" +
                    "eListService\022b\n\017getEmployeeList\022$.com.bh" +
                    "t.pim.proto.employees.NoParam\032).com.bht." +
                    "pim.proto.employees.EmployeeListB\005P\001\210\001\001b" +
                    "\006proto3"
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
          EmployeeOuterClass.getDescriptor(),
        }, assigner);
      internal_static_com_bht_pim_proto_employees_EmployeeList_descriptor =
      getDescriptor().getMessageTypes().get(0);
      internal_static_com_bht_pim_proto_employees_EmployeeList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
              internal_static_com_bht_pim_proto_employees_EmployeeList_descriptor,
              new String[]{"Employee",});
      internal_static_com_bht_pim_proto_employees_NoParam_descriptor =
      getDescriptor().getMessageTypes().get(1);
      internal_static_com_bht_pim_proto_employees_NoParam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
              internal_static_com_bht_pim_proto_employees_NoParam_descriptor,
        new String[] { });
    EmployeeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}