// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProjectList.proto

package com.bht.pim.proto.projects;

/**
 * Protobuf service {@code com.bht.pim.proto.projects.ProjectListService}
 */
public abstract class ProjectListService
        implements com.google.protobuf.Service {
    protected ProjectListService() {
    }

    public static com.google.protobuf.Service newReflectiveService(
            final Interface impl) {
        return new ProjectListService() {
            @Override
            public void getProjectList(
                    com.google.protobuf.RpcController controller,
                    NoParam request,
                    com.google.protobuf.RpcCallback<ProjectList> done) {
                impl.getProjectList(controller, request, done);
            }

            @Override
            public void getProjectNumbers(
                    com.google.protobuf.RpcController controller,
                    NoParam request,
                    com.google.protobuf.RpcCallback<ProjectNumbers> done) {
                impl.getProjectNumbers(controller, request, done);
            }

        };
    }

    public static com.google.protobuf.BlockingService
    newReflectiveBlockingService(final BlockingInterface impl) {
        return new com.google.protobuf.BlockingService() {
            public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }

            public final com.google.protobuf.Message callBlockingMethod(
                    com.google.protobuf.Descriptors.MethodDescriptor method,
                    com.google.protobuf.RpcController controller,
                    com.google.protobuf.Message request)
                    throws com.google.protobuf.ServiceException {
                if (method.getService() != getDescriptor()) {
                    throw new IllegalArgumentException(
                            "Service.callBlockingMethod() given method descriptor for " +
                                    "wrong service type.");
                }
                switch (method.getIndex()) {
                    case 0:
                        return impl.getProjectList(controller, (NoParam) request);
                    case 1:
                        return impl.getProjectNumbers(controller, (NoParam) request);
                    default:
                        throw new AssertionError("Can't get here.");
                }
            }

            public final com.google.protobuf.Message
            getRequestPrototype(
                    com.google.protobuf.Descriptors.MethodDescriptor method) {
                if (method.getService() != getDescriptor()) {
                    throw new IllegalArgumentException(
                            "Service.getRequestPrototype() given method " +
                                    "descriptor for wrong service type.");
                }
                switch (method.getIndex()) {
                    case 0:
                        return NoParam.getDefaultInstance();
                    case 1:
                        return NoParam.getDefaultInstance();
                    default:
                        throw new AssertionError("Can't get here.");
                }
            }

            public final com.google.protobuf.Message
            getResponsePrototype(
                    com.google.protobuf.Descriptors.MethodDescriptor method) {
                if (method.getService() != getDescriptor()) {
                    throw new IllegalArgumentException(
                            "Service.getResponsePrototype() given method " +
                                    "descriptor for wrong service type.");
                }
                switch (method.getIndex()) {
                    case 0:
                        return ProjectList.getDefaultInstance();
                    case 1:
                        return ProjectNumbers.getDefaultInstance();
                    default:
                        throw new AssertionError("Can't get here.");
                }
            }

        };
    }

    public static final com.google.protobuf.Descriptors.ServiceDescriptor
    getDescriptor() {
        return ProjectListOuterClass.getDescriptor().getServices().get(0);
    }

    public static Stub newStub(
            com.google.protobuf.RpcChannel channel) {
        return new Stub(channel);
    }

    public static BlockingInterface newBlockingStub(
            com.google.protobuf.BlockingRpcChannel channel) {
        return new BlockingStub(channel);
    }

    /**
     * <code>rpc getProjectList(.com.bht.pim.proto.projects.NoParam) returns (.com.bht.pim.proto.projects.ProjectList);</code>
     */
    public abstract void getProjectList(
            com.google.protobuf.RpcController controller,
            NoParam request,
            com.google.protobuf.RpcCallback<ProjectList> done);

    /**
     * <code>rpc getProjectNumbers(.com.bht.pim.proto.projects.NoParam) returns (.com.bht.pim.proto.projects.ProjectNumbers);</code>
     */
    public abstract void getProjectNumbers(
            com.google.protobuf.RpcController controller,
            NoParam request,
            com.google.protobuf.RpcCallback<ProjectNumbers> done);

    public final com.google.protobuf.Descriptors.ServiceDescriptor
    getDescriptorForType() {
        return getDescriptor();
    }

    public final void callMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request,
            com.google.protobuf.RpcCallback<
                    com.google.protobuf.Message> done) {
        if (method.getService() != getDescriptor()) {
            throw new IllegalArgumentException(
                    "Service.callMethod() given method descriptor for wrong " +
                            "service type.");
        }
        switch (method.getIndex()) {
            case 0:
                this.getProjectList(controller, (NoParam) request,
                        com.google.protobuf.RpcUtil.<ProjectList>specializeCallback(
                                done));
                return;
            case 1:
                this.getProjectNumbers(controller, (NoParam) request,
                        com.google.protobuf.RpcUtil.<ProjectNumbers>specializeCallback(
                                done));
                return;
            default:
                throw new AssertionError("Can't get here.");
        }
    }

    public final com.google.protobuf.Message
    getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
            throw new IllegalArgumentException(
                    "Service.getRequestPrototype() given method " +
                            "descriptor for wrong service type.");
        }
        switch (method.getIndex()) {
            case 0:
                return NoParam.getDefaultInstance();
            case 1:
                return NoParam.getDefaultInstance();
            default:
                throw new AssertionError("Can't get here.");
        }
    }

    public final com.google.protobuf.Message
    getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
            throw new IllegalArgumentException(
                    "Service.getResponsePrototype() given method " +
                            "descriptor for wrong service type.");
        }
        switch (method.getIndex()) {
            case 0:
                return ProjectList.getDefaultInstance();
            case 1:
                return ProjectNumbers.getDefaultInstance();
            default:
                throw new AssertionError("Can't get here.");
        }
    }

    public interface Interface {
        /**
         * <code>rpc getProjectList(.com.bht.pim.proto.projects.NoParam) returns (.com.bht.pim.proto.projects.ProjectList);</code>
         */
        public abstract void getProjectList(
                com.google.protobuf.RpcController controller,
                NoParam request,
                com.google.protobuf.RpcCallback<ProjectList> done);

        /**
         * <code>rpc getProjectNumbers(.com.bht.pim.proto.projects.NoParam) returns (.com.bht.pim.proto.projects.ProjectNumbers);</code>
         */
        public abstract void getProjectNumbers(
                com.google.protobuf.RpcController controller,
                NoParam request,
                com.google.protobuf.RpcCallback<ProjectNumbers> done);

    }

    public interface BlockingInterface {
        public ProjectList getProjectList(
                com.google.protobuf.RpcController controller,
                NoParam request)
                throws com.google.protobuf.ServiceException;

        public ProjectNumbers getProjectNumbers(
                com.google.protobuf.RpcController controller,
                NoParam request)
                throws com.google.protobuf.ServiceException;
    }

    public static final class Stub extends ProjectListService implements Interface {
        private final com.google.protobuf.RpcChannel channel;

        private Stub(com.google.protobuf.RpcChannel channel) {
            this.channel = channel;
        }

        public com.google.protobuf.RpcChannel getChannel() {
            return channel;
        }

        public void getProjectList(
                com.google.protobuf.RpcController controller,
                NoParam request,
                com.google.protobuf.RpcCallback<ProjectList> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(0),
                    controller,
                    request,
                    ProjectList.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            ProjectList.class,
                            ProjectList.getDefaultInstance()));
        }

        public void getProjectNumbers(
                com.google.protobuf.RpcController controller,
                NoParam request,
                com.google.protobuf.RpcCallback<ProjectNumbers> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(1),
                    controller,
                    request,
                    ProjectNumbers.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            ProjectNumbers.class,
                            ProjectNumbers.getDefaultInstance()));
        }
    }

    private static final class BlockingStub implements BlockingInterface {
        private final com.google.protobuf.BlockingRpcChannel channel;

        private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
            this.channel = channel;
        }

        public ProjectList getProjectList(
                com.google.protobuf.RpcController controller,
                NoParam request)
                throws com.google.protobuf.ServiceException {
            return (ProjectList) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(0),
                    controller,
                    request,
                    ProjectList.getDefaultInstance());
        }


        public ProjectNumbers getProjectNumbers(
                com.google.protobuf.RpcController controller,
                NoParam request)
                throws com.google.protobuf.ServiceException {
            return (ProjectNumbers) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(1),
                    controller,
                    request,
                    ProjectNumbers.getDefaultInstance());
        }

    }

    // @@protoc_insertion_point(class_scope:com.bht.pim.proto.projects.ProjectListService)
}
