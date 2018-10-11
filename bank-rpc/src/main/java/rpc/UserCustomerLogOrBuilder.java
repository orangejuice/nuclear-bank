// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer.proto

package rpc;

public interface UserCustomerLogOrBuilder extends
        // @@protoc_insertion_point(interface_extends:rpc.UserCustomerLog)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 log_id = 1;</code>
     */
    long getLogId();

    /**
     * <code>int32 operate_type = 2;</code>
     */
    int getOperateType();

    /**
     * <code>string operate_time = 3;</code>
     */
    String getOperateTime();

    /**
     * <code>string operate_time = 3;</code>
     */
    com.google.protobuf.ByteString
    getOperateTimeBytes();

    /**
     * <code>string description = 4;</code>
     */
    String getDescription();

    /**
     * <code>string description = 4;</code>
     */
    com.google.protobuf.ByteString
    getDescriptionBytes();

    /**
     * <code>int32 status = 5;</code>
     */
    int getStatus();

    /**
     * <code>.rpc.UserCustomerTran tran = 6;</code>
     */
    boolean hasTran();

    /**
     * <code>.rpc.UserCustomerTran tran = 6;</code>
     */
    UserCustomerTran getTran();

    /**
     * <code>.rpc.UserCustomerTran tran = 6;</code>
     */
    rpc.UserCustomerTranOrBuilder getTranOrBuilder();
}
