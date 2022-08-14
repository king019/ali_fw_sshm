package com.k.sshm.grpc.server.server;

import com.k.dep.common.util.NetworkUtils;
import com.k.sshm.grpc.server.proto.HelloReply;
import com.k.sshm.grpc.server.proto.HelloRequest;
import com.k.sshm.grpc.server.proto.SimpleGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GrpcServerService extends SimpleGrpc.SimpleImplBase {
    @Override
    public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage(NetworkUtils.getHostIP() + "_" + req.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
