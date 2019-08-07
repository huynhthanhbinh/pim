package com.bht.pim.proto.employees;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.16.1)",
        comments = "Source: EmployeeInfo.proto")
public final class EmployeeServiceGrpc {

    public static final String SERVICE_NAME = "com.bht.pim.proto.employees.EmployeeService";
    private static final int METHODID_GET_EMPLOYEE_BY_ID = 0;
    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
            EmployeeInfo> getGetEmployeeByIdMethod;
    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    private EmployeeServiceGrpc() {
    }

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "getEmployeeById",
            requestType = com.google.protobuf.Int64Value.class,
            responseType = EmployeeInfo.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
            EmployeeInfo> getGetEmployeeByIdMethod() {
        io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, EmployeeInfo> getGetEmployeeByIdMethod;
        if ((getGetEmployeeByIdMethod = EmployeeServiceGrpc.getGetEmployeeByIdMethod) == null) {
            synchronized (EmployeeServiceGrpc.class) {
                if ((getGetEmployeeByIdMethod = EmployeeServiceGrpc.getGetEmployeeByIdMethod) == null) {
                    EmployeeServiceGrpc.getGetEmployeeByIdMethod = getGetEmployeeByIdMethod =
                            io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, EmployeeInfo>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "com.bht.pim.proto.employees.EmployeeService", "getEmployeeById"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.google.protobuf.Int64Value.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            EmployeeInfo.getDefaultInstance()))
                                    .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getEmployeeById"))
                                    .build();
                }
            }
        }
        return getGetEmployeeByIdMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
        return new EmployeeServiceStub(channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static EmployeeServiceBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        return new EmployeeServiceBlockingStub(channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static EmployeeServiceFutureStub newFutureStub(
            io.grpc.Channel channel) {
        return new EmployeeServiceFutureStub(channel);
    }

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (EmployeeServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
                            .addMethod(getGetEmployeeByIdMethod())
                            .build();
                }
            }
        }
        return result;
    }

    /**
     *
     */
    public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

        /**
         *
         */
        public void getEmployeeById(com.google.protobuf.Int64Value request,
                                    io.grpc.stub.StreamObserver<EmployeeInfo> responseObserver) {
            asyncUnimplementedUnaryCall(getGetEmployeeByIdMethod(), responseObserver);
        }

        @Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getGetEmployeeByIdMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.google.protobuf.Int64Value,
                                            EmployeeInfo>(
                                            this, METHODID_GET_EMPLOYEE_BY_ID)))
                    .build();
        }
    }

    /**
     *
     */
    public static final class EmployeeServiceStub extends io.grpc.stub.AbstractStub<EmployeeServiceStub> {
        private EmployeeServiceStub(io.grpc.Channel channel) {
            super(channel);
        }

        private EmployeeServiceStub(io.grpc.Channel channel,
                                    io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected EmployeeServiceStub build(io.grpc.Channel channel,
                                            io.grpc.CallOptions callOptions) {
            return new EmployeeServiceStub(channel, callOptions);
        }

        /**
         *
         */
        public void getEmployeeById(com.google.protobuf.Int64Value request,
                                    io.grpc.stub.StreamObserver<EmployeeInfo> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getGetEmployeeByIdMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     *
     */
    public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractStub<EmployeeServiceBlockingStub> {
        private EmployeeServiceBlockingStub(io.grpc.Channel channel) {
            super(channel);
        }

        private EmployeeServiceBlockingStub(io.grpc.Channel channel,
                                            io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected EmployeeServiceBlockingStub build(io.grpc.Channel channel,
                                                    io.grpc.CallOptions callOptions) {
            return new EmployeeServiceBlockingStub(channel, callOptions);
        }

        /**
         *
         */
        public EmployeeInfo getEmployeeById(com.google.protobuf.Int64Value request) {
            return blockingUnaryCall(
                    getChannel(), getGetEmployeeByIdMethod(), getCallOptions(), request);
        }
    }

    /**
     *
     */
    public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractStub<EmployeeServiceFutureStub> {
        private EmployeeServiceFutureStub(io.grpc.Channel channel) {
            super(channel);
        }

        private EmployeeServiceFutureStub(io.grpc.Channel channel,
                                          io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected EmployeeServiceFutureStub build(io.grpc.Channel channel,
                                                  io.grpc.CallOptions callOptions) {
            return new EmployeeServiceFutureStub(channel, callOptions);
        }

        /**
         *
         */
        public com.google.common.util.concurrent.ListenableFuture<EmployeeInfo> getEmployeeById(
                com.google.protobuf.Int64Value request) {
            return futureUnaryCall(
                    getChannel().newCall(getGetEmployeeByIdMethod(), getCallOptions()), request);
        }
    }

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final EmployeeServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @Override
        @SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_GET_EMPLOYEE_BY_ID:
                    serviceImpl.getEmployeeById((com.google.protobuf.Int64Value) request,
                            (io.grpc.stub.StreamObserver<EmployeeInfo>) responseObserver);
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

    private static abstract class EmployeeServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        EmployeeServiceBaseDescriptorSupplier() {
        }

        @Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return EmployeeInfoOuterClass.getDescriptor();
        }

        @Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("EmployeeService");
        }
    }

    private static final class EmployeeServiceFileDescriptorSupplier
            extends EmployeeServiceBaseDescriptorSupplier {
        EmployeeServiceFileDescriptorSupplier() {
        }
    }

    private static final class EmployeeServiceMethodDescriptorSupplier
            extends EmployeeServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        EmployeeServiceMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }
}