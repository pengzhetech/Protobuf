package com.rayvision.rpc.dto.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.11.0)",
    comments = "Source: user.proto")
public final class UserSerivceGrpc {

  private UserSerivceGrpc() {}

  public static final String SERVICE_NAME = "userService.UserSerivce";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetUserInfoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.rayvision.rpc.dto.user.RequestUserInfo,
      com.rayvision.rpc.dto.user.ResponseUserInfo> METHOD_GET_USER_INFO = getGetUserInfoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.rayvision.rpc.dto.user.RequestUserInfo,
      com.rayvision.rpc.dto.user.ResponseUserInfo> getGetUserInfoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.rayvision.rpc.dto.user.RequestUserInfo,
      com.rayvision.rpc.dto.user.ResponseUserInfo> getGetUserInfoMethod() {
    return getGetUserInfoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.rayvision.rpc.dto.user.RequestUserInfo,
      com.rayvision.rpc.dto.user.ResponseUserInfo> getGetUserInfoMethodHelper() {
    io.grpc.MethodDescriptor<com.rayvision.rpc.dto.user.RequestUserInfo, com.rayvision.rpc.dto.user.ResponseUserInfo> getGetUserInfoMethod;
    if ((getGetUserInfoMethod = UserSerivceGrpc.getGetUserInfoMethod) == null) {
      synchronized (UserSerivceGrpc.class) {
        if ((getGetUserInfoMethod = UserSerivceGrpc.getGetUserInfoMethod) == null) {
          UserSerivceGrpc.getGetUserInfoMethod = getGetUserInfoMethod = 
              io.grpc.MethodDescriptor.<com.rayvision.rpc.dto.user.RequestUserInfo, com.rayvision.rpc.dto.user.ResponseUserInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService.UserSerivce", "GetUserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rayvision.rpc.dto.user.RequestUserInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rayvision.rpc.dto.user.ResponseUserInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new UserSerivceMethodDescriptorSupplier("GetUserInfo"))
                  .build();
          }
        }
     }
     return getGetUserInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserSerivceStub newStub(io.grpc.Channel channel) {
    return new UserSerivceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserSerivceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserSerivceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserSerivceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserSerivceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserSerivceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserInfo(com.rayvision.rpc.dto.user.RequestUserInfo request,
        io.grpc.stub.StreamObserver<com.rayvision.rpc.dto.user.ResponseUserInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserInfoMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserInfoMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rayvision.rpc.dto.user.RequestUserInfo,
                com.rayvision.rpc.dto.user.ResponseUserInfo>(
                  this, METHODID_GET_USER_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class UserSerivceStub extends io.grpc.stub.AbstractStub<UserSerivceStub> {
    private UserSerivceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserSerivceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSerivceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserSerivceStub(channel, callOptions);
    }

    /**
     */
    public void getUserInfo(com.rayvision.rpc.dto.user.RequestUserInfo request,
        io.grpc.stub.StreamObserver<com.rayvision.rpc.dto.user.ResponseUserInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserInfoMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserSerivceBlockingStub extends io.grpc.stub.AbstractStub<UserSerivceBlockingStub> {
    private UserSerivceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserSerivceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSerivceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserSerivceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rayvision.rpc.dto.user.ResponseUserInfo getUserInfo(com.rayvision.rpc.dto.user.RequestUserInfo request) {
      return blockingUnaryCall(
          getChannel(), getGetUserInfoMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserSerivceFutureStub extends io.grpc.stub.AbstractStub<UserSerivceFutureStub> {
    private UserSerivceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserSerivceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSerivceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserSerivceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rayvision.rpc.dto.user.ResponseUserInfo> getUserInfo(
        com.rayvision.rpc.dto.user.RequestUserInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserInfoMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserSerivceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserSerivceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_INFO:
          serviceImpl.getUserInfo((com.rayvision.rpc.dto.user.RequestUserInfo) request,
              (io.grpc.stub.StreamObserver<com.rayvision.rpc.dto.user.ResponseUserInfo>) responseObserver);
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

  private static abstract class UserSerivceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserSerivceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rayvision.rpc.dto.user.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserSerivce");
    }
  }

  private static final class UserSerivceFileDescriptorSupplier
      extends UserSerivceBaseDescriptorSupplier {
    UserSerivceFileDescriptorSupplier() {}
  }

  private static final class UserSerivceMethodDescriptorSupplier
      extends UserSerivceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserSerivceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserSerivceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserSerivceFileDescriptorSupplier())
              .addMethod(getGetUserInfoMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
