package com.k.sshm.grpc.server.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * 定义的接口的类，这里会生成一个SimpleGrpc.class，服务端需要来实现的
 * </pre>
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.31.0)",
        comments = "Source: helloworld.proto")
public final class SimpleGrpc {

    private SimpleGrpc() {
    }

    public static final String SERVICE_NAME = "Simple";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<com.k.sshm.grpc.server.proto.HelloRequest,
            com.k.sshm.grpc.server.proto.HelloReply> getSayHelloMethod;

    @io.grpc.stub.annotations.RpcMethod(
            fullMethodName = SERVICE_NAME + '/' + "SayHello",
            requestType = com.k.sshm.grpc.server.proto.HelloRequest.class,
            responseType = com.k.sshm.grpc.server.proto.HelloReply.class,
            methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<com.k.sshm.grpc.server.proto.HelloRequest,
            com.k.sshm.grpc.server.proto.HelloReply> getSayHelloMethod() {
        io.grpc.MethodDescriptor<com.k.sshm.grpc.server.proto.HelloRequest, com.k.sshm.grpc.server.proto.HelloReply> getSayHelloMethod;
        if ((getSayHelloMethod = SimpleGrpc.getSayHelloMethod) == null) {
            synchronized (SimpleGrpc.class) {
                if ((getSayHelloMethod = SimpleGrpc.getSayHelloMethod) == null) {
                    SimpleGrpc.getSayHelloMethod = getSayHelloMethod =
                            io.grpc.MethodDescriptor.<com.k.sshm.grpc.server.proto.HelloRequest, com.k.sshm.grpc.server.proto.HelloReply>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.k.sshm.grpc.server.proto.HelloRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            com.k.sshm.grpc.server.proto.HelloReply.getDefaultInstance()))
                                    .setSchemaDescriptor(new SimpleMethodDescriptorSupplier("SayHello"))
                                    .build();
                }
            }
        }
        return getSayHelloMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static SimpleStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<SimpleStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<SimpleStub>() {
                    @java.lang.Override
                    public SimpleStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new SimpleStub(channel, callOptions);
                    }
                };
        return SimpleStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static SimpleBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<SimpleBlockingStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<SimpleBlockingStub>() {
                    @java.lang.Override
                    public SimpleBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new SimpleBlockingStub(channel, callOptions);
                    }
                };
        return SimpleBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static SimpleFutureStub newFutureStub(
            io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<SimpleFutureStub> factory =
                new io.grpc.stub.AbstractStub.StubFactory<SimpleFutureStub>() {
                    @java.lang.Override
                    public SimpleFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                        return new SimpleFutureStub(channel, callOptions);
                    }
                };
        return SimpleFutureStub.newStub(factory, channel);
    }

    /**
     * <pre>
     * The greeting service definition.
     * 定义的接口的类，这里会生成一个SimpleGrpc.class，服务端需要来实现的
     * </pre>
     */
    public static abstract class SimpleImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         * 定义接口方法
         * </pre>
         */
        public void sayHello(com.k.sshm.grpc.server.proto.HelloRequest request,
                             io.grpc.stub.StreamObserver<com.k.sshm.grpc.server.proto.HelloReply> responseObserver) {
            asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
        }

        @java.lang.Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getSayHelloMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.k.sshm.grpc.server.proto.HelloRequest,
                                            com.k.sshm.grpc.server.proto.HelloReply>(
                                            this, METHODID_SAY_HELLO)))
                    .build();
        }
    }

    /**
     * <pre>
     * The greeting service definition.
     * 定义的接口的类，这里会生成一个SimpleGrpc.class，服务端需要来实现的
     * </pre>
     */
    public static final class SimpleStub extends io.grpc.stub.AbstractAsyncStub<SimpleStub> {
        private SimpleStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected SimpleStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SimpleStub(channel, callOptions);
        }

        /**
         * <pre>
         * 定义接口方法
         * </pre>
         */
        public void sayHello(com.k.sshm.grpc.server.proto.HelloRequest request,
                             io.grpc.stub.StreamObserver<com.k.sshm.grpc.server.proto.HelloReply> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * <pre>
     * The greeting service definition.
     * 定义的接口的类，这里会生成一个SimpleGrpc.class，服务端需要来实现的
     * </pre>
     */
    public static final class SimpleBlockingStub extends io.grpc.stub.AbstractBlockingStub<SimpleBlockingStub> {
        private SimpleBlockingStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected SimpleBlockingStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SimpleBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * 定义接口方法
         * </pre>
         */
        public com.k.sshm.grpc.server.proto.HelloReply sayHello(com.k.sshm.grpc.server.proto.HelloRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSayHelloMethod(), getCallOptions(), request);
        }
    }

    /**
     * <pre>
     * The greeting service definition.
     * 定义的接口的类，这里会生成一个SimpleGrpc.class，服务端需要来实现的
     * </pre>
     */
    public static final class SimpleFutureStub extends io.grpc.stub.AbstractFutureStub<SimpleFutureStub> {
        private SimpleFutureStub(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected SimpleFutureStub build(
                io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new SimpleFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * 定义接口方法
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<com.k.sshm.grpc.server.proto.HelloReply> sayHello(
                com.k.sshm.grpc.server.proto.HelloRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
        }
    }

    private static final int METHODID_SAY_HELLO = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final SimpleImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(SimpleImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_SAY_HELLO:
                    serviceImpl.sayHello((com.k.sshm.grpc.server.proto.HelloRequest) request,
                            (io.grpc.stub.StreamObserver<com.k.sshm.grpc.server.proto.HelloReply>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(
                io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    private static abstract class SimpleBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        SimpleBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return com.k.sshm.grpc.server.proto.HelloWorldProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("Simple");
        }
    }

    private static final class SimpleFileDescriptorSupplier
            extends SimpleBaseDescriptorSupplier {
        SimpleFileDescriptorSupplier() {
        }
    }

    private static final class SimpleMethodDescriptorSupplier
            extends SimpleBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        SimpleMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (SimpleGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new SimpleFileDescriptorSupplier())
                            .addMethod(getSayHelloMethod())
                            .build();
                }
            }
        }
        return result;
    }
}