// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bank.proto

package rpc;

public interface UserLoginReqRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.UserLoginReqRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 user_id = 1;</code>
   */
  long getUserId();

  /**
   * <code>int32 phone_last4 = 2;</code>
   */
  int getPhoneLast4();

  /**
   * <code>int32 birth_day = 3;</code>
   */
  int getBirthDay();

  /**
   * <code>int32 birth_mon = 4;</code>
   */
  int getBirthMon();

  /**
   * <code>int32 birth_year = 5;</code>
   */
  int getBirthYear();
}
