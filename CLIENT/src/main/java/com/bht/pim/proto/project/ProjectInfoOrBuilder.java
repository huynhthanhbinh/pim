// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProjectInfo.proto

package com.bht.pim.proto.project;

public interface ProjectInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.bht.pim.proto.project.ProjectInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.bht.pim.proto.project.Project project = 1;</code>
   */
  boolean hasProject();
  /**
   * <code>.com.bht.pim.proto.project.Project project = 1;</code>
   */
  Project getProject();
  /**
   * <code>.com.bht.pim.proto.project.Project project = 1;</code>
   */
  ProjectOrBuilder getProjectOrBuilder();

  /**
   * <code>string groupLeader = 2;</code>
   */
  String getGroupLeader();

    /**
     * <code>string groupLeader = 2;</code>
     */
    com.google.protobuf.ByteString
    getGroupLeaderBytes();

  /**
   * <code>repeated .com.bht.pim.proto.employee.Employee employees = 3;</code>
   */
  java.util.List<com.bht.pim.proto.employee.Employee> 
      getEmployeesList();
  /**
   * <code>repeated .com.bht.pim.proto.employee.Employee employees = 3;</code>
   */
  com.bht.pim.proto.employee.Employee getEmployees(int index);
  /**
   * <code>repeated .com.bht.pim.proto.employee.Employee employees = 3;</code>
   */
  int getEmployeesCount();
  /**
   * <code>repeated .com.bht.pim.proto.employee.Employee employees = 3;</code>
   */
  java.util.List<? extends com.bht.pim.proto.employee.EmployeeOrBuilder> 
      getEmployeesOrBuilderList();
  /**
   * <code>repeated .com.bht.pim.proto.employee.Employee employees = 3;</code>
   */
  com.bht.pim.proto.employee.EmployeeOrBuilder getEmployeesOrBuilder(
          int index);
}
