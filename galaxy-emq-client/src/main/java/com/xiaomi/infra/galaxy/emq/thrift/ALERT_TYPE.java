/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

public enum ALERT_TYPE implements libthrift091.TEnum {
  SEND_REQUEST(0),
  RECEIVE_REQUEST(1),
  CHANGE_REQUEST(2),
  DELETE_REQUEST(3),
  SINGLE_SEND_REQUEST(4),
  BATCH_SEND_REQUEST(5),
  SHORT_RECEIVE_REQUEST(6),
  LONG_RECEIVE_REQUEST(7),
  QUEUE_MESSAGE_NUMBER(8);

  private final int value;

  private ALERT_TYPE(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ALERT_TYPE findByValue(int value) { 
    switch (value) {
      case 0:
        return SEND_REQUEST;
      case 1:
        return RECEIVE_REQUEST;
      case 2:
        return CHANGE_REQUEST;
      case 3:
        return DELETE_REQUEST;
      case 4:
        return SINGLE_SEND_REQUEST;
      case 5:
        return BATCH_SEND_REQUEST;
      case 6:
        return SHORT_RECEIVE_REQUEST;
      case 7:
        return LONG_RECEIVE_REQUEST;
      case 8:
        return QUEUE_MESSAGE_NUMBER;
      default:
        return null;
    }
  }
}
