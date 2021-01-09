package com.k.sshm.grpc.client.client;

import com.k.sshm.grpc.server.proto.HelloReply;
import com.k.sshm.grpc.server.proto.HelloRequest;
import com.k.sshm.grpc.server.proto.SimpleGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service("simpleGrpcService")
public class SimpleGrpcService {
    @GrpcClient("grpc-provider")
    private SimpleGrpc.SimpleBlockingStub stub;

    public String sendMessage(String name) {
        HelloReply response = stub.sayHello(HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }
}
