// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Employee.proto

package com.bht.pim.proto.employee;

public interface EmployeeOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.bht.pim.proto.employee.Employee)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 id = 1;</code>
     */
    long getId();

    /**
     * <code>string visa = 2;</code>
     */
    String getVisa();

    /**
     * <code>string visa = 2;</code>
     */
    com.google.protobuf.ByteString
    getVisaBytes();

    /**
     * <code>string first_name = 3;</code>
     */
    String getFirstName();

    /**
     * <code>string first_name = 3;</code>
     */
    com.google.protobuf.ByteString
    getFirstNameBytes();

    /**
     * <code>string last_name = 4;</code>
     */
    String getLastName();

    /**
     * <code>string last_name = 4;</code>
     */
    com.google.protobuf.ByteString
    getLastNameBytes();

    /**
     * <code>.com.bht.pim.proto.date.Date birthday = 5;</code>
     */
    boolean hasBirthday();

    /**
     * <code>.com.bht.pim.proto.date.Date birthday = 5;</code>
     */
    com.bht.pim.proto.date.Date getBirthday();

    /**
     * <code>.com.bht.pim.proto.date.Date birthday = 5;</code>
     */
    com.bht.pim.proto.date.DateOrBuilder getBirthdayOrBuilder();
}