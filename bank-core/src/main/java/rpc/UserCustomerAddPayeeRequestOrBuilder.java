// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bank.proto

package rpc;

public interface UserCustomerAddPayeeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.UserCustomerAddPayeeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 user_id = 1;</code>
   */
  long getUserId();

  /**
   * <code>string first_name = 2;</code>
   */
  String getFirstName();
  /**
   * <code>string first_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 3;</code>
   */
  String getLastName();
  /**
   * <code>string last_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string iban = 4;</code>
   */
  String getIban();
  /**
   * <code>string iban = 4;</code>
   */
  com.google.protobuf.ByteString
      getIbanBytes();

  /**
   * <code>int32 pin = 5;</code>
   */
  int getPin();
}
