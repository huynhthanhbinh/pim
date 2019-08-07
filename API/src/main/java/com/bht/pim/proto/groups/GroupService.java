// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupInfo.proto

package com.bht.pim.proto.groups;

/**
 * Protobuf service {@code com.bht.pim.proto.groups.GroupService}
 */
public abstract class GroupService
        implements com.google.protobuf.Service {
    protected GroupService() {
    }

    public static com.google.protobuf.Service newReflectiveService(
            final Interface impl) {
        return new GroupService() {
            @Override
            public void getGroupById(
                    com.google.protobuf.RpcController controller,
                    com.google.protobuf.Int64Value request,
                    com.google.protobuf.RpcCallback<GroupInfo> done) {
                impl.getGroupById(controller, request, done);
            }

            @Override
            public void addNewGroup(
                    com.google.protobuf.RpcController controller,
                    Group request,
                    com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done) {
                impl.addNewGroup(controller, request, done);
            }

        };
    }

    public static com.google.protobuf.BlockingService
    newReflectiveBlockingService(final BlockingInterface impl) {
        return new com.google.protobuf.BlockingService() {
            @Override
            public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }

            @Override
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
                        return impl.getGroupById(controller, (com.google.protobuf.Int64Value) request);
                    case 1:
                        return impl.addNewGroup(controller, (Group) request);
                    default:
                        throw new AssertionError("Can't get here.");
                }
            }

            @Override
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
                        return com.google.protobuf.Int64Value.getDefaultInstance();
                    case 1:
                        return Group.getDefaultInstance();
                    default:
                        throw new AssertionError("Can't get here.");
                }
            }

            @Override
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
                        return GroupInfo.getDefaultInstance();
                    case 1:
                        return com.google.protobuf.BoolValue.getDefaultInstance();
                    default:
                        throw new AssertionError("Can't get here.");
                }
            }

        };
    }

    public static final com.google.protobuf.Descriptors.ServiceDescriptor
    getDescriptor() {
        return GroupInfoOuterClass.getDescriptor().getServices().get(0);
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
     * <code>rpc getGroupById(.google.protobuf.Int64Value) returns (.com.bht.pim.proto.groups.GroupInfo);</code>
     */
    public abstract void getGroupById(
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Int64Value request,
            com.google.protobuf.RpcCallback<GroupInfo> done);

    /**
     * <code>rpc addNewGroup(.com.bht.pim.proto.groups.Group) returns (.google.protobuf.BoolValue);</code>
     */
    public abstract void addNewGroup(
            com.google.protobuf.RpcController controller,
            Group request,
            com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done);

    @Override
    public final com.google.protobuf.Descriptors.ServiceDescriptor
    getDescriptorForType() {
        return getDescriptor();
    }

    @Override
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
                getGroupById(controller, (com.google.protobuf.Int64Value) request,
                        com.google.protobuf.RpcUtil.<GroupInfo>specializeCallback(
                                done));
                return;
            case 1:
                addNewGroup(controller, (Group) request,
                        com.google.protobuf.RpcUtil.<com.google.protobuf.BoolValue>specializeCallback(
                                done));
                return;
            default:
                throw new AssertionError("Can't get here.");
        }
    }

    @Override
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
                return com.google.protobuf.Int64Value.getDefaultInstance();
            case 1:
                return Group.getDefaultInstance();
            default:
                throw new AssertionError("Can't get here.");
        }
    }

    @Override
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
                return GroupInfo.getDefaultInstance();
            case 1:
                return com.google.protobuf.BoolValue.getDefaultInstance();
            default:
                throw new AssertionError("Can't get here.");
        }
    }

    public interface Interface {
        /**
         * <code>rpc getGroupById(.google.protobuf.Int64Value) returns (.com.bht.pim.proto.groups.GroupInfo);</code>
         */
        public abstract void getGroupById(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request,
                com.google.protobuf.RpcCallback<GroupInfo> done);

        /**
         * <code>rpc addNewGroup(.com.bht.pim.proto.groups.Group) returns (.google.protobuf.BoolValue);</code>
         */
        public abstract void addNewGroup(
                com.google.protobuf.RpcController controller,
                Group request,
                com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done);

    }

    public interface BlockingInterface {
        public GroupInfo getGroupById(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request)
                throws com.google.protobuf.ServiceException;

        public com.google.protobuf.BoolValue addNewGroup(
                com.google.protobuf.RpcController controller,
                Group request)
                throws com.google.protobuf.ServiceException;
    }

    public static final class Stub extends GroupService implements Interface {
        private final com.google.protobuf.RpcChannel channel;

        private Stub(com.google.protobuf.RpcChannel channel) {
            this.channel = channel;
        }

        public com.google.protobuf.RpcChannel getChannel() {
            return channel;
        }

        @Override
        public void getGroupById(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request,
                com.google.protobuf.RpcCallback<GroupInfo> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(0),
                    controller,
                    request,
                    GroupInfo.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            GroupInfo.class,
                            GroupInfo.getDefaultInstance()));
        }

        @Override
        public void addNewGroup(
                com.google.protobuf.RpcController controller,
                Group request,
                com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(1),
                    controller,
                    request,
                    com.google.protobuf.BoolValue.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            com.google.protobuf.BoolValue.class,
                            com.google.protobuf.BoolValue.getDefaultInstance()));
        }
    }

    private static final class BlockingStub implements BlockingInterface {
        private final com.google.protobuf.BlockingRpcChannel channel;

        private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
            this.channel = channel;
        }

        @Override
        public GroupInfo getGroupById(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request)
                throws com.google.protobuf.ServiceException {
            return (GroupInfo) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(0),
                    controller,
                    request,
                    GroupInfo.getDefaultInstance());
        }


        @Override
        public com.google.protobuf.BoolValue addNewGroup(
                com.google.protobuf.RpcController controller,
                Group request)
                throws com.google.protobuf.ServiceException {
            return (com.google.protobuf.BoolValue) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(1),
                    controller,
                    request,
                    com.google.protobuf.BoolValue.getDefaultInstance());
        }

    }

    // @@protoc_insertion_point(class_scope:com.bht.pim.proto.groups.GroupService)
}
