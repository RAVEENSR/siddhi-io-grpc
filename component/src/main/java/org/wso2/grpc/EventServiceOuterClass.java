// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EventService.proto

package org.wso2.grpc;

public final class EventServiceOuterClass {
  private EventServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_eventservice_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_eventservice_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_eventservice_Event_HeadersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_eventservice_Event_HeadersEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\022EventService.proto\022\014eventservice\032\033goog" +
      "le/protobuf/empty.proto\"{\n\005Event\022\017\n\007payl" +
      "oad\030\001 \001(\t\0221\n\007headers\030\002 \003(\0132 .eventservic" +
      "e.Event.HeadersEntry\032.\n\014HeadersEntry\022\013\n\003" +
      "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\0012\201\001\n\014EventSe" +
      "rvice\0225\n\007process\022\023.eventservice.Event\032\023." +
      "eventservice.Event\"\000\022:\n\007consume\022\023.events" +
      "ervice.Event\032\026.google.protobuf.Empty\"\000(\001" +
      "B\021\n\rorg.wso2.grpcP\001b\006proto3"
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
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_eventservice_Event_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_eventservice_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_eventservice_Event_descriptor,
        new String[] { "Payload", "Headers", });
    internal_static_eventservice_Event_HeadersEntry_descriptor =
      internal_static_eventservice_Event_descriptor.getNestedTypes().get(0);
    internal_static_eventservice_Event_HeadersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_eventservice_Event_HeadersEntry_descriptor,
        new String[] { "Key", "Value", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}