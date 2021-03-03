package com.rams.service;

import com.rams.data.HelloReply;
import com.rams.data.HelloRequest;
import com.rams.data.RamGrpc.RamImplBase;

import io.grpc.stub.StreamObserver;

public class RamsserviceGrpcImpl extends RamImplBase{
  @Override
  public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {

  String name = request.getName();
  HelloReply setP = HelloReply.newBuilder().setName(name).build();
  responseObserver.onNext(setP);
  responseObserver.onCompleted();
  }
}
