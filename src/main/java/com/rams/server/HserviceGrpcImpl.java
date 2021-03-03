package com.rams.server;

import com.rams.proto.data.HServiceGrpc.HServiceImplBase;
import com.rams.proto.data.HelloReply;
import com.rams.proto.data.HelloRequest;

import io.grpc.stub.StreamObserver;

public class HserviceGrpcImpl extends HServiceImplBase {
  @Override
  public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {

    String name = request.getName();
    HelloReply setP = HelloReply.newBuilder().setName(name).build();
    responseObserver.onNext(setP);
    responseObserver.onCompleted();
  }
}
