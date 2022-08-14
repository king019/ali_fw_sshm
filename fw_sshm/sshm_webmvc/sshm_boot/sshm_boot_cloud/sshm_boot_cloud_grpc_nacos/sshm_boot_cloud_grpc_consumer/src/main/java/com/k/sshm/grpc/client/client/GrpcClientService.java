package com.k.sshm.grpc.client.client;

import com.k.sshm.grpc.server.proto.HelloReply;
import com.k.sshm.grpc.server.proto.HelloRequest;
import com.k.sshm.grpc.server.proto.SimpleGrpc;
import io.grpc.Channel;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class GrpcClientService {
    @GrpcClient("grpc-provider")
    private Channel serverChannel;

    public String sendMessage(String name) {
        SimpleGrpc.SimpleBlockingStub stub = SimpleGrpc.newBlockingStub(serverChannel);
        HelloReply response = stub.sayHello(HelloRequest.newBuilder().setName(serverChannel.toString()).build());
        return response.getMessage();
    }

}
