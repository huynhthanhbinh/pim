// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Project.proto

package com.bht.pim.proto.projects;

/**
 * Protobuf service {@code com.bht.pim.proto.projects.ProjectService}
 */
public abstract class ProjectService
        implements com.google.protobuf.Service {
    protected ProjectService() {
    }

    public interface Interface {
        /**
         * <code>rpc getProjectById(.google.protobuf.Int64Value) returns (.com.bht.pim.proto.projects.Project);</code>
         */
        public abstract void getProjectById(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request,
                com.google.protobuf.RpcCallback<Project> done);

        /**
         * <code>rpc getProjectByNumber(.google.protobuf.Int64Value) returns (.com.bht.pim.proto.projects.Project);</code>
         */
        public abstract void getProjectByNumber(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request,
                com.google.protobuf.RpcCallback<Project> done);

        /**
         * <code>rpc addNewProject(.com.bht.pim.proto.projects.Project) returns (.google.protobuf.BoolValue);</code>
         */
        public abstract void addNewProject(
                com.google.protobuf.RpcController controller,
                Project request,
                com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done);

        /**
         * <code>rpc editProject(.com.bht.pim.proto.projects.Project) returns (.google.protobuf.BoolValue);</code>
         */
        public abstract void editProject(
                com.google.protobuf.RpcController controller,
                Project request,
                com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done);

        /**
         * <code>rpc deleteProject(.google.protobuf.Int64Value) returns (.google.protobuf.BoolValue);</code>
         */
        public abstract void deleteProject(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request,
                com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done);

        /**
         * <code>rpc getProjectList(.com.bht.pim.proto.projects.ProjectPagination) returns (.com.bht.pim.proto.projects.ProjectList);</code>
         */
        public abstract void getProjectList(
                com.google.protobuf.RpcController controller,
                ProjectPagination request,
                com.google.protobuf.RpcCallback<ProjectList> done);

        /**
         * <code>rpc getProjectNumbers(.google.protobuf.Empty) returns (.com.bht.pim.proto.projects.ProjectNumbers);</code>
         */
        public abstract void getProjectNumbers(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Empty request,
                com.google.protobuf.RpcCallback<ProjectNumbers> done);

        /**
         * <code>rpc getNumberOfProjects(.google.protobuf.Empty) returns (.google.protobuf.Int64Value);</code>
         */
        public abstract void getNumberOfProjects(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Empty request,
                com.google.protobuf.RpcCallback<com.google.protobuf.Int64Value> done);

        /**
         * <code>rpc getNumberOfProjectsByStatus(.google.protobuf.StringValue) returns (.google.protobuf.Int64Value);</code>
         */
        public abstract void getNumberOfProjectsByStatus(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.StringValue request,
                com.google.protobuf.RpcCallback<com.google.protobuf.Int64Value> done);

        /**
         * <code>rpc getNumberOfProjectsByKeyword(.google.protobuf.StringValue) returns (.google.protobuf.Int64Value);</code>
         */
        public abstract void getNumberOfProjectsByKeyword(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.StringValue request,
                com.google.protobuf.RpcCallback<com.google.protobuf.Int64Value> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
            final Interface impl) {
        return new ProjectService() {
            @Override
            public void getProjectById(
                    com.google.protobuf.RpcController controller,
                    com.google.protobuf.Int64Value request,
                    com.google.protobuf.RpcCallback<Project> done) {
                impl.getProjectById(controller, request, done);
            }

            @Override
            public void getProjectByNumber(
                    com.google.protobuf.RpcController controller,
                    com.google.protobuf.Int64Value request,
                    com.google.protobuf.RpcCallback<Project> done) {
                impl.getProjectByNumber(controller, request, done);
            }

            @Override
            public void addNewProject(
                    com.google.protobuf.RpcController controller,
                    Project request,
                    com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done) {
                impl.addNewProject(controller, request, done);
            }

            @Override
            public void editProject(
                    com.google.protobuf.RpcController controller,
                    Project request,
                    com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done) {
                impl.editProject(controller, request, done);
            }

            @Override
            public void deleteProject(
                    com.google.protobuf.RpcController controller,
                    com.google.protobuf.Int64Value request,
                    com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done) {
                impl.deleteProject(controller, request, done);
            }

            @Override
            public void getProjectList(
                    com.google.protobuf.RpcController controller,
                    ProjectPagination request,
                    com.google.protobuf.RpcCallback<ProjectList> done) {
                impl.getProjectList(controller, request, done);
            }

            @Override
            public void getProjectNumbers(
                    com.google.protobuf.RpcController controller,
                    com.google.protobuf.Empty request,
                    com.google.protobuf.RpcCallback<ProjectNumbers> done) {
                impl.getProjectNumbers(controller, request, done);
            }

            @Override
            public void getNumberOfProjects(
                    com.google.protobuf.RpcController controller,
                    com.google.protobuf.Empty request,
                    com.google.protobuf.RpcCallback<com.google.protobuf.Int64Value> done) {
                impl.getNumberOfProjects(controller, request, done);
            }

            @Override
            public void getNumberOfProjectsByStatus(
                    com.google.protobuf.RpcController controller,
                    com.google.protobuf.StringValue request,
                    com.google.protobuf.RpcCallback<com.google.protobuf.Int64Value> done) {
                impl.getNumberOfProjectsByStatus(controller, request, done);
            }

            @Override
            public void getNumberOfProjectsByKeyword(
                    com.google.protobuf.RpcController controller,
                    com.google.protobuf.StringValue request,
                    com.google.protobuf.RpcCallback<com.google.protobuf.Int64Value> done) {
                impl.getNumberOfProjectsByKeyword(controller, request, done);
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
                        return impl.getProjectById(controller, (com.google.protobuf.Int64Value) request);
                    case 1:
                        return impl.getProjectByNumber(controller, (com.google.protobuf.Int64Value) request);
                    case 2:
                        return impl.addNewProject(controller, (Project) request);
                    case 3:
                        return impl.editProject(controller, (Project) request);
                    case 4:
                        return impl.deleteProject(controller, (com.google.protobuf.Int64Value) request);
                    case 5:
                        return impl.getProjectList(controller, (ProjectPagination) request);
                    case 6:
                        return impl.getProjectNumbers(controller, (com.google.protobuf.Empty) request);
                    case 7:
                        return impl.getNumberOfProjects(controller, (com.google.protobuf.Empty) request);
                    case 8:
                        return impl.getNumberOfProjectsByStatus(controller, (com.google.protobuf.StringValue) request);
                    case 9:
                        return impl.getNumberOfProjectsByKeyword(controller, (com.google.protobuf.StringValue) request);
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
                        return com.google.protobuf.Int64Value.getDefaultInstance();
                    case 2:
                        return Project.getDefaultInstance();
                    case 3:
                        return Project.getDefaultInstance();
                    case 4:
                        return com.google.protobuf.Int64Value.getDefaultInstance();
                    case 5:
                        return ProjectPagination.getDefaultInstance();
                    case 6:
                        return com.google.protobuf.Empty.getDefaultInstance();
                    case 7:
                        return com.google.protobuf.Empty.getDefaultInstance();
                    case 8:
                        return com.google.protobuf.StringValue.getDefaultInstance();
                    case 9:
                        return com.google.protobuf.StringValue.getDefaultInstance();
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
                        return Project.getDefaultInstance();
                    case 1:
                        return Project.getDefaultInstance();
                    case 2:
                        return com.google.protobuf.BoolValue.getDefaultInstance();
                    case 3:
                        return com.google.protobuf.BoolValue.getDefaultInstance();
                    case 4:
                        return com.google.protobuf.BoolValue.getDefaultInstance();
                    case 5:
                        return ProjectList.getDefaultInstance();
                    case 6:
                        return ProjectNumbers.getDefaultInstance();
                    case 7:
                        return com.google.protobuf.Int64Value.getDefaultInstance();
                    case 8:
                        return com.google.protobuf.Int64Value.getDefaultInstance();
                    case 9:
                        return com.google.protobuf.Int64Value.getDefaultInstance();
                    default:
                        throw new AssertionError("Can't get here.");
                }
            }

        };
    }

    /**
     * <code>rpc getProjectById(.google.protobuf.Int64Value) returns (.com.bht.pim.proto.projects.Project);</code>
     */
    public abstract void getProjectById(
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Int64Value request,
            com.google.protobuf.RpcCallback<Project> done);

    /**
     * <code>rpc getProjectByNumber(.google.protobuf.Int64Value) returns (.com.bht.pim.proto.projects.Project);</code>
     */
    public abstract void getProjectByNumber(
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Int64Value request,
            com.google.protobuf.RpcCallback<Project> done);

    /**
     * <code>rpc addNewProject(.com.bht.pim.proto.projects.Project) returns (.google.protobuf.BoolValue);</code>
     */
    public abstract void addNewProject(
            com.google.protobuf.RpcController controller,
            Project request,
            com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done);

    /**
     * <code>rpc editProject(.com.bht.pim.proto.projects.Project) returns (.google.protobuf.BoolValue);</code>
     */
    public abstract void editProject(
            com.google.protobuf.RpcController controller,
            Project request,
            com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done);

    /**
     * <code>rpc deleteProject(.google.protobuf.Int64Value) returns (.google.protobuf.BoolValue);</code>
     */
    public abstract void deleteProject(
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Int64Value request,
            com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done);

    /**
     * <code>rpc getProjectList(.com.bht.pim.proto.projects.ProjectPagination) returns (.com.bht.pim.proto.projects.ProjectList);</code>
     */
    public abstract void getProjectList(
            com.google.protobuf.RpcController controller,
            ProjectPagination request,
            com.google.protobuf.RpcCallback<ProjectList> done);

    /**
     * <code>rpc getProjectNumbers(.google.protobuf.Empty) returns (.com.bht.pim.proto.projects.ProjectNumbers);</code>
     */
    public abstract void getProjectNumbers(
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Empty request,
            com.google.protobuf.RpcCallback<ProjectNumbers> done);

    /**
     * <code>rpc getNumberOfProjects(.google.protobuf.Empty) returns (.google.protobuf.Int64Value);</code>
     */
    public abstract void getNumberOfProjects(
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Empty request,
            com.google.protobuf.RpcCallback<com.google.protobuf.Int64Value> done);

    /**
     * <code>rpc getNumberOfProjectsByStatus(.google.protobuf.StringValue) returns (.google.protobuf.Int64Value);</code>
     */
    public abstract void getNumberOfProjectsByStatus(
            com.google.protobuf.RpcController controller,
            com.google.protobuf.StringValue request,
            com.google.protobuf.RpcCallback<com.google.protobuf.Int64Value> done);

    /**
     * <code>rpc getNumberOfProjectsByKeyword(.google.protobuf.StringValue) returns (.google.protobuf.Int64Value);</code>
     */
    public abstract void getNumberOfProjectsByKeyword(
            com.google.protobuf.RpcController controller,
            com.google.protobuf.StringValue request,
            com.google.protobuf.RpcCallback<com.google.protobuf.Int64Value> done);

    public static final com.google.protobuf.Descriptors.ServiceDescriptor
    getDescriptor() {
        return ProjectOuterClass.getDescriptor().getServices().get(0);
    }

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
                getProjectById(controller, (com.google.protobuf.Int64Value) request,
                        com.google.protobuf.RpcUtil.<Project>specializeCallback(
                                done));
                return;
            case 1:
                getProjectByNumber(controller, (com.google.protobuf.Int64Value) request,
                        com.google.protobuf.RpcUtil.<Project>specializeCallback(
                                done));
                return;
            case 2:
                addNewProject(controller, (Project) request,
                        com.google.protobuf.RpcUtil.<com.google.protobuf.BoolValue>specializeCallback(
                                done));
                return;
            case 3:
                editProject(controller, (Project) request,
                        com.google.protobuf.RpcUtil.<com.google.protobuf.BoolValue>specializeCallback(
                                done));
                return;
            case 4:
                deleteProject(controller, (com.google.protobuf.Int64Value) request,
                        com.google.protobuf.RpcUtil.<com.google.protobuf.BoolValue>specializeCallback(
                                done));
                return;
            case 5:
                getProjectList(controller, (ProjectPagination) request,
                        com.google.protobuf.RpcUtil.<ProjectList>specializeCallback(
                                done));
                return;
            case 6:
                getProjectNumbers(controller, (com.google.protobuf.Empty) request,
                        com.google.protobuf.RpcUtil.<ProjectNumbers>specializeCallback(
                                done));
                return;
            case 7:
                getNumberOfProjects(controller, (com.google.protobuf.Empty) request,
                        com.google.protobuf.RpcUtil.<com.google.protobuf.Int64Value>specializeCallback(
                                done));
                return;
            case 8:
                getNumberOfProjectsByStatus(controller, (com.google.protobuf.StringValue) request,
                        com.google.protobuf.RpcUtil.<com.google.protobuf.Int64Value>specializeCallback(
                                done));
                return;
            case 9:
                getNumberOfProjectsByKeyword(controller, (com.google.protobuf.StringValue) request,
                        com.google.protobuf.RpcUtil.<com.google.protobuf.Int64Value>specializeCallback(
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
                return com.google.protobuf.Int64Value.getDefaultInstance();
            case 2:
                return Project.getDefaultInstance();
            case 3:
                return Project.getDefaultInstance();
            case 4:
                return com.google.protobuf.Int64Value.getDefaultInstance();
            case 5:
                return ProjectPagination.getDefaultInstance();
            case 6:
                return com.google.protobuf.Empty.getDefaultInstance();
            case 7:
                return com.google.protobuf.Empty.getDefaultInstance();
            case 8:
                return com.google.protobuf.StringValue.getDefaultInstance();
            case 9:
                return com.google.protobuf.StringValue.getDefaultInstance();
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
                return Project.getDefaultInstance();
            case 1:
                return Project.getDefaultInstance();
            case 2:
                return com.google.protobuf.BoolValue.getDefaultInstance();
            case 3:
                return com.google.protobuf.BoolValue.getDefaultInstance();
            case 4:
                return com.google.protobuf.BoolValue.getDefaultInstance();
            case 5:
                return ProjectList.getDefaultInstance();
            case 6:
                return ProjectNumbers.getDefaultInstance();
            case 7:
                return com.google.protobuf.Int64Value.getDefaultInstance();
            case 8:
                return com.google.protobuf.Int64Value.getDefaultInstance();
            case 9:
                return com.google.protobuf.Int64Value.getDefaultInstance();
            default:
                throw new AssertionError("Can't get here.");
        }
    }

    public static Stub newStub(
            com.google.protobuf.RpcChannel channel) {
        return new Stub(channel);
    }

    public static final class Stub extends ProjectService implements Interface {
        private Stub(com.google.protobuf.RpcChannel channel) {
            this.channel = channel;
        }

        private final com.google.protobuf.RpcChannel channel;

        public com.google.protobuf.RpcChannel getChannel() {
            return channel;
        }

        @Override
        public void getProjectById(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request,
                com.google.protobuf.RpcCallback<Project> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(0),
                    controller,
                    request,
                    Project.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            Project.class,
                            Project.getDefaultInstance()));
        }

        @Override
        public void getProjectByNumber(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request,
                com.google.protobuf.RpcCallback<Project> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(1),
                    controller,
                    request,
                    Project.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            Project.class,
                            Project.getDefaultInstance()));
        }

        @Override
        public void addNewProject(
                com.google.protobuf.RpcController controller,
                Project request,
                com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(2),
                    controller,
                    request,
                    com.google.protobuf.BoolValue.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            com.google.protobuf.BoolValue.class,
                            com.google.protobuf.BoolValue.getDefaultInstance()));
        }

        @Override
        public void editProject(
                com.google.protobuf.RpcController controller,
                Project request,
                com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(3),
                    controller,
                    request,
                    com.google.protobuf.BoolValue.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            com.google.protobuf.BoolValue.class,
                            com.google.protobuf.BoolValue.getDefaultInstance()));
        }

        @Override
        public void deleteProject(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request,
                com.google.protobuf.RpcCallback<com.google.protobuf.BoolValue> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(4),
                    controller,
                    request,
                    com.google.protobuf.BoolValue.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            com.google.protobuf.BoolValue.class,
                            com.google.protobuf.BoolValue.getDefaultInstance()));
        }

        @Override
        public void getProjectList(
                com.google.protobuf.RpcController controller,
                ProjectPagination request,
                com.google.protobuf.RpcCallback<ProjectList> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(5),
                    controller,
                    request,
                    ProjectList.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            ProjectList.class,
                            ProjectList.getDefaultInstance()));
        }

        @Override
        public void getProjectNumbers(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Empty request,
                com.google.protobuf.RpcCallback<ProjectNumbers> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(6),
                    controller,
                    request,
                    ProjectNumbers.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            ProjectNumbers.class,
                            ProjectNumbers.getDefaultInstance()));
        }

        @Override
        public void getNumberOfProjects(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Empty request,
                com.google.protobuf.RpcCallback<com.google.protobuf.Int64Value> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(7),
                    controller,
                    request,
                    com.google.protobuf.Int64Value.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            com.google.protobuf.Int64Value.class,
                            com.google.protobuf.Int64Value.getDefaultInstance()));
        }

        @Override
        public void getNumberOfProjectsByStatus(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.StringValue request,
                com.google.protobuf.RpcCallback<com.google.protobuf.Int64Value> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(8),
                    controller,
                    request,
                    com.google.protobuf.Int64Value.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            com.google.protobuf.Int64Value.class,
                            com.google.protobuf.Int64Value.getDefaultInstance()));
        }

        @Override
        public void getNumberOfProjectsByKeyword(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.StringValue request,
                com.google.protobuf.RpcCallback<com.google.protobuf.Int64Value> done) {
            channel.callMethod(
                    getDescriptor().getMethods().get(9),
                    controller,
                    request,
                    com.google.protobuf.Int64Value.getDefaultInstance(),
                    com.google.protobuf.RpcUtil.generalizeCallback(
                            done,
                            com.google.protobuf.Int64Value.class,
                            com.google.protobuf.Int64Value.getDefaultInstance()));
        }
    }

    public static BlockingInterface newBlockingStub(
            com.google.protobuf.BlockingRpcChannel channel) {
        return new BlockingStub(channel);
    }

    public interface BlockingInterface {
        public Project getProjectById(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request)
                throws com.google.protobuf.ServiceException;

        public Project getProjectByNumber(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request)
                throws com.google.protobuf.ServiceException;

        public com.google.protobuf.BoolValue addNewProject(
                com.google.protobuf.RpcController controller,
                Project request)
                throws com.google.protobuf.ServiceException;

        public com.google.protobuf.BoolValue editProject(
                com.google.protobuf.RpcController controller,
                Project request)
                throws com.google.protobuf.ServiceException;

        public com.google.protobuf.BoolValue deleteProject(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request)
                throws com.google.protobuf.ServiceException;

        public ProjectList getProjectList(
                com.google.protobuf.RpcController controller,
                ProjectPagination request)
                throws com.google.protobuf.ServiceException;

        public ProjectNumbers getProjectNumbers(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Empty request)
                throws com.google.protobuf.ServiceException;

        public com.google.protobuf.Int64Value getNumberOfProjects(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Empty request)
                throws com.google.protobuf.ServiceException;

        public com.google.protobuf.Int64Value getNumberOfProjectsByStatus(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.StringValue request)
                throws com.google.protobuf.ServiceException;

        public com.google.protobuf.Int64Value getNumberOfProjectsByKeyword(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.StringValue request)
                throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
        private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
            this.channel = channel;
        }

        private final com.google.protobuf.BlockingRpcChannel channel;

        @Override
        public Project getProjectById(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request)
                throws com.google.protobuf.ServiceException {
            return (Project) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(0),
                    controller,
                    request,
                    Project.getDefaultInstance());
        }


        @Override
        public Project getProjectByNumber(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request)
                throws com.google.protobuf.ServiceException {
            return (Project) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(1),
                    controller,
                    request,
                    Project.getDefaultInstance());
        }


        @Override
        public com.google.protobuf.BoolValue addNewProject(
                com.google.protobuf.RpcController controller,
                Project request)
                throws com.google.protobuf.ServiceException {
            return (com.google.protobuf.BoolValue) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(2),
                    controller,
                    request,
                    com.google.protobuf.BoolValue.getDefaultInstance());
        }


        @Override
        public com.google.protobuf.BoolValue editProject(
                com.google.protobuf.RpcController controller,
                Project request)
                throws com.google.protobuf.ServiceException {
            return (com.google.protobuf.BoolValue) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(3),
                    controller,
                    request,
                    com.google.protobuf.BoolValue.getDefaultInstance());
        }


        @Override
        public com.google.protobuf.BoolValue deleteProject(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Int64Value request)
                throws com.google.protobuf.ServiceException {
            return (com.google.protobuf.BoolValue) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(4),
                    controller,
                    request,
                    com.google.protobuf.BoolValue.getDefaultInstance());
        }


        @Override
        public ProjectList getProjectList(
                com.google.protobuf.RpcController controller,
                ProjectPagination request)
                throws com.google.protobuf.ServiceException {
            return (ProjectList) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(5),
                    controller,
                    request,
                    ProjectList.getDefaultInstance());
        }


        @Override
        public ProjectNumbers getProjectNumbers(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Empty request)
                throws com.google.protobuf.ServiceException {
            return (ProjectNumbers) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(6),
                    controller,
                    request,
                    ProjectNumbers.getDefaultInstance());
        }


        @Override
        public com.google.protobuf.Int64Value getNumberOfProjects(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.Empty request)
                throws com.google.protobuf.ServiceException {
            return (com.google.protobuf.Int64Value) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(7),
                    controller,
                    request,
                    com.google.protobuf.Int64Value.getDefaultInstance());
        }


        @Override
        public com.google.protobuf.Int64Value getNumberOfProjectsByStatus(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.StringValue request)
                throws com.google.protobuf.ServiceException {
            return (com.google.protobuf.Int64Value) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(8),
                    controller,
                    request,
                    com.google.protobuf.Int64Value.getDefaultInstance());
        }


        @Override
        public com.google.protobuf.Int64Value getNumberOfProjectsByKeyword(
                com.google.protobuf.RpcController controller,
                com.google.protobuf.StringValue request)
                throws com.google.protobuf.ServiceException {
            return (com.google.protobuf.Int64Value) channel.callBlockingMethod(
                    getDescriptor().getMethods().get(9),
                    controller,
                    request,
                    com.google.protobuf.Int64Value.getDefaultInstance());
        }

    }

    // @@protoc_insertion_point(class_scope:com.bht.pim.proto.projects.ProjectService)
}
