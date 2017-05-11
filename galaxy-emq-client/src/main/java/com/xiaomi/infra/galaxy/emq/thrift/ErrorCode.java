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

/**
 * List of ErrorCode.
 */
public enum ErrorCode implements libthrift091.TEnum {
  /**
   * Invalid action.
   */
  INVALID_ACTION(1),
  /**
   * Invalid attributes.
   */
  INVALID_ATTRIBUTE(2),
  /**
   * Queue has been deleted recently.
   */
  QUEUE_DELETED_RECENTLY(3),
  /**
   * Queue already exists.
   */
  QUEUE_EXIST(4),
  /**
   * Queue name is missing.
   */
  QUEUE_NAME_MISSING(5),
  /**
   * Queue does not exist.
   */
  QUEUE_NOT_EXIST(6),
  /**
   * Queue is used by others.
   */
  QUEUE_INUSE(7),
  /**
   * Queue uri is conflict.
   */
  QUEUE_URI_CONFLICT(8),
  /**
   * Invalid receipt handle.
   */
  INVALID_INDEX_ID(9),
  /**
   * Message body is missing.
   */
  MESSAGE_BODY_MISSING(10),
  /**
   * Receipt handle not exit.
   */
  INVALID_RECEIPT_HANDLE(11),
  /**
   * Index not unique.
   */
  INDEX_NOT_UNIQUE(12),
  /**
   * Permission denied.
   */
  PERMISSION_DENIED(13),
  /**
   * Permission denied.
   */
  REQUEST_LENGTH_EXCEEDED(34),
  /**
   * Bad request.
   */
  BAD_REQUEST(35),
  /**
   * System internal error.
   */
  INTERNAL_ERROR(14),
  /**
   * Partition does not exist.
   */
  PARTITION_NOT_EXIST(15),
  /**
   * Partition is not running.
   */
  PARTITION_NOT_RUNNING(16),
  /**
   * Queue does not exit in cache.
   */
  QUEUE_NOT_CACHED(17),
  /**
   * Partition is not serving.
   */
  PARTITION_NOT_SERVING(18),
  /**
   * TTransport error, connect server error.
   */
  TTRANSPORT_ERROR(19),
  /**
   * Quota exceeded exception.
   */
  QUOTA_EXCEEDED(20),
  /**
   * Quota not exist exception.
   */
  QUOTA_NOT_EXIST(21),
  /**
   * Quota lock failed exception.
   */
  QUOTA_LOCK_FAILED(22),
  /**
   * Unknown exception.
   */
  UNKNOWN(30);

  private final int value;

  private ErrorCode(int value) {
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
  public static ErrorCode findByValue(int value) { 
    switch (value) {
      case 1:
        return INVALID_ACTION;
      case 2:
        return INVALID_ATTRIBUTE;
      case 3:
        return QUEUE_DELETED_RECENTLY;
      case 4:
        return QUEUE_EXIST;
      case 5:
        return QUEUE_NAME_MISSING;
      case 6:
        return QUEUE_NOT_EXIST;
      case 7:
        return QUEUE_INUSE;
      case 8:
        return QUEUE_URI_CONFLICT;
      case 9:
        return INVALID_INDEX_ID;
      case 10:
        return MESSAGE_BODY_MISSING;
      case 11:
        return INVALID_RECEIPT_HANDLE;
      case 12:
        return INDEX_NOT_UNIQUE;
      case 13:
        return PERMISSION_DENIED;
      case 34:
        return REQUEST_LENGTH_EXCEEDED;
      case 35:
        return BAD_REQUEST;
      case 14:
        return INTERNAL_ERROR;
      case 15:
        return PARTITION_NOT_EXIST;
      case 16:
        return PARTITION_NOT_RUNNING;
      case 17:
        return QUEUE_NOT_CACHED;
      case 18:
        return PARTITION_NOT_SERVING;
      case 19:
        return TTRANSPORT_ERROR;
      case 20:
        return QUOTA_EXCEEDED;
      case 21:
        return QUOTA_NOT_EXIST;
      case 22:
        return QUOTA_LOCK_FAILED;
      case 30:
        return UNKNOWN;
      default:
        return null;
    }
  }
}
