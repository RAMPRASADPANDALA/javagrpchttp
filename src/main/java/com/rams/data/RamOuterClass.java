// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/rams/proto/Ram.proto

package com.rams.data;

public final class RamOuterClass {
  private RamOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rams_proto_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rams_proto_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rams_proto_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rams_proto_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030com/rams/proto/Ram.proto\022\016com.rams.pro" +
      "to\"\034\n\014HelloRequest\022\014\n\004name\030\001 \001(\t\"\032\n\nHell" +
      "oReply\022\014\n\004name\030\001 \001(\t2M\n\003Ram\022F\n\010SayHello\022" +
      "\034.com.rams.proto.HelloRequest\032\032.com.rams" +
      ".proto.HelloReply\"\000B\021\n\rcom.rams.dataP\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_rams_proto_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_rams_proto_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rams_proto_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_rams_proto_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_rams_proto_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rams_proto_HelloReply_descriptor,
        new java.lang.String[] { "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}