package com.bht.pim.proto.project;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: ProjectInfo.proto")
public final class ProjectServiceGrpc {

  private ProjectServiceGrpc() {}

  public static final String SERVICE_NAME = "com.bht.pim.proto.project.ProjectService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ProjectId,
      ProjectInfo> getGetProjectByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProjectById",
      requestType = ProjectId.class,
      responseType = ProjectInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProjectId,
      ProjectInfo> getGetProjectByIdMethod() {
    io.grpc.MethodDescriptor<ProjectId, ProjectInfo> getGetProjectByIdMethod;
    if ((getGetProjectByIdMethod = ProjectServiceGrpc.getGetProjectByIdMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getGetProjectByIdMethod = ProjectServiceGrpc.getGetProjectByIdMethod) == null) {
          ProjectServiceGrpc.getGetProjectByIdMethod = getGetProjectByIdMethod =
              io.grpc.MethodDescriptor.<ProjectId, ProjectInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bht.pim.proto.project.ProjectService", "getProjectById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProjectId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProjectInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("getProjectById"))
                  .build();
          }
        }
     }
     return getGetProjectByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Project,
          Success> getAddNewProjectMethod;
    private static volatile io.grpc.MethodDescriptor<Project,
            Success> getEditProjectMethod;
    private static volatile io.grpc.MethodDescriptor<ProjectId,
            Success> getDeleteProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addNewProject",
      requestType = Project.class,
      responseType = Success.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Project,
          Success> getAddNewProjectMethod() {
    io.grpc.MethodDescriptor<Project, Success> getAddNewProjectMethod;
    if ((getAddNewProjectMethod = ProjectServiceGrpc.getAddNewProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getAddNewProjectMethod = ProjectServiceGrpc.getAddNewProjectMethod) == null) {
          ProjectServiceGrpc.getAddNewProjectMethod = getAddNewProjectMethod =
              io.grpc.MethodDescriptor.<Project, Success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bht.pim.proto.project.ProjectService", "addNewProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Project.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Success.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("addNewProject"))
                  .build();
          }
        }
     }
     return getAddNewProjectMethod;
  }

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "editProject",
      requestType = Project.class,
      responseType = Success.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Project,
          Success> getEditProjectMethod() {
    io.grpc.MethodDescriptor<Project, Success> getEditProjectMethod;
    if ((getEditProjectMethod = ProjectServiceGrpc.getEditProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getEditProjectMethod = ProjectServiceGrpc.getEditProjectMethod) == null) {
          ProjectServiceGrpc.getEditProjectMethod = getEditProjectMethod =
              io.grpc.MethodDescriptor.<Project, Success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bht.pim.proto.project.ProjectService", "editProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Project.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Success.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("editProject"))
                  .build();
          }
        }
     }
     return getEditProjectMethod;
  }

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteProject",
      requestType = ProjectId.class,
      responseType = Success.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ProjectId,
          Success> getDeleteProjectMethod() {
    io.grpc.MethodDescriptor<ProjectId, Success> getDeleteProjectMethod;
    if ((getDeleteProjectMethod = ProjectServiceGrpc.getDeleteProjectMethod) == null) {
      synchronized (ProjectServiceGrpc.class) {
        if ((getDeleteProjectMethod = ProjectServiceGrpc.getDeleteProjectMethod) == null) {
          ProjectServiceGrpc.getDeleteProjectMethod = getDeleteProjectMethod =
              io.grpc.MethodDescriptor.<ProjectId, Success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bht.pim.proto.project.ProjectService", "deleteProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ProjectId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Success.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectServiceMethodDescriptorSupplier("deleteProject"))
                  .build();
          }
        }
     }
     return getDeleteProjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectServiceStub newStub(io.grpc.Channel channel) {
    return new ProjectServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProjectServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProjectServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProjectServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProjectById(ProjectId request,
                               io.grpc.stub.StreamObserver<ProjectInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectByIdMethod(), responseObserver);
    }

    /**
     */
    public void addNewProject(Project request,
                              io.grpc.stub.StreamObserver<Success> responseObserver) {
      asyncUnimplementedUnaryCall(getAddNewProjectMethod(), responseObserver);
    }

    /**
     */
    public void editProject(Project request,
                            io.grpc.stub.StreamObserver<Success> responseObserver) {
      asyncUnimplementedUnaryCall(getEditProjectMethod(), responseObserver);
    }

    /**
     */
    public void deleteProject(ProjectId request,
                              io.grpc.stub.StreamObserver<Success> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProjectMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProjectByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      ProjectId,
                ProjectInfo>(
                  this, METHODID_GET_PROJECT_BY_ID)))
          .addMethod(
            getAddNewProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      Project,
                      Success>(
                  this, METHODID_ADD_NEW_PROJECT)))
          .addMethod(
            getEditProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      Project,
                      Success>(
                  this, METHODID_EDIT_PROJECT)))
          .addMethod(
            getDeleteProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      ProjectId,
                      Success>(
                  this, METHODID_DELETE_PROJECT)))
          .build();
    }
  }

  /**
   */
  public static final class ProjectServiceStub extends io.grpc.stub.AbstractStub<ProjectServiceStub> {
    private ProjectServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ProjectServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProjectById(ProjectId request,
                               io.grpc.stub.StreamObserver<ProjectInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProjectByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addNewProject(Project request,
                              io.grpc.stub.StreamObserver<Success> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddNewProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editProject(Project request,
                            io.grpc.stub.StreamObserver<Success> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProject(ProjectId request,
                              io.grpc.stub.StreamObserver<Success> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProjectServiceBlockingStub extends io.grpc.stub.AbstractStub<ProjectServiceBlockingStub> {
    private ProjectServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ProjectServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ProjectInfo getProjectById(ProjectId request) {
      return blockingUnaryCall(
          getChannel(), getGetProjectByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public Success addNewProject(Project request) {
      return blockingUnaryCall(
          getChannel(), getAddNewProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public Success editProject(Project request) {
      return blockingUnaryCall(
          getChannel(), getEditProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public Success deleteProject(ProjectId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProjectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProjectServiceFutureStub extends io.grpc.stub.AbstractStub<ProjectServiceFutureStub> {
    private ProjectServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ProjectServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ProjectInfo> getProjectById(
        ProjectId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProjectByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Success> addNewProject(
        Project request) {
      return futureUnaryCall(
          getChannel().newCall(getAddNewProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Success> editProject(
        Project request) {
      return futureUnaryCall(
          getChannel().newCall(getEditProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Success> deleteProject(
        ProjectId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROJECT_BY_ID = 0;
  private static final int METHODID_ADD_NEW_PROJECT = 1;
  private static final int METHODID_EDIT_PROJECT = 2;
  private static final int METHODID_DELETE_PROJECT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROJECT_BY_ID:
          serviceImpl.getProjectById((ProjectId) request,
              (io.grpc.stub.StreamObserver<ProjectInfo>) responseObserver);
          break;
        case METHODID_ADD_NEW_PROJECT:
          serviceImpl.addNewProject((Project) request,
              (io.grpc.stub.StreamObserver<Success>) responseObserver);
          break;
        case METHODID_EDIT_PROJECT:
          serviceImpl.editProject((Project) request,
              (io.grpc.stub.StreamObserver<Success>) responseObserver);
          break;
        case METHODID_DELETE_PROJECT:
          serviceImpl.deleteProject((ProjectId) request,
              (io.grpc.stub.StreamObserver<Success>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ProjectInfoOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProjectService");
    }
  }

  private static final class ProjectServiceFileDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier {
    ProjectServiceFileDescriptorSupplier() {}
  }

  private static final class ProjectServiceMethodDescriptorSupplier
      extends ProjectServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProjectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectServiceFileDescriptorSupplier())
              .addMethod(getGetProjectByIdMethod())
              .addMethod(getAddNewProjectMethod())
              .addMethod(getEditProjectMethod())
              .addMethod(getDeleteProjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}