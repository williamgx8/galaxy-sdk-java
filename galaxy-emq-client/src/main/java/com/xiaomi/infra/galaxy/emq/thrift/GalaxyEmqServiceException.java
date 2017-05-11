/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Copyright 2015, Xiaomi.
 * All rights reserved.
 * Author: shenyuannan@xiaomi.com
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-5-11")
public class GalaxyEmqServiceException extends TException implements libthrift091.TBase<GalaxyEmqServiceException, GalaxyEmqServiceException._Fields>, java.io.Serializable, Cloneable, Comparable<GalaxyEmqServiceException> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GalaxyEmqServiceException");

  private static final libthrift091.protocol.TField ERROR_CODE_FIELD_DESC = new libthrift091.protocol.TField("errorCode", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField ERR_MSG_FIELD_DESC = new libthrift091.protocol.TField("errMsg", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField DETAILS_FIELD_DESC = new libthrift091.protocol.TField("details", libthrift091.protocol.TType.STRING, (short)3);
  private static final libthrift091.protocol.TField REQUEST_ID_FIELD_DESC = new libthrift091.protocol.TField("requestId", libthrift091.protocol.TType.STRING, (short)4);
  private static final libthrift091.protocol.TField QUEUE_NAME_FIELD_DESC = new libthrift091.protocol.TField("queueName", libthrift091.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GalaxyEmqServiceExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GalaxyEmqServiceExceptionTupleSchemeFactory());
  }

  public int errorCode; // optional
  public String errMsg; // optional
  public String details; // optional
  public String requestId; // optional
  public String queueName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    ERROR_CODE((short)1, "errorCode"),
    ERR_MSG((short)2, "errMsg"),
    DETAILS((short)3, "details"),
    REQUEST_ID((short)4, "requestId"),
    QUEUE_NAME((short)5, "queueName");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERROR_CODE
          return ERROR_CODE;
        case 2: // ERR_MSG
          return ERR_MSG;
        case 3: // DETAILS
          return DETAILS;
        case 4: // REQUEST_ID
          return REQUEST_ID;
        case 5: // QUEUE_NAME
          return QUEUE_NAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ERRORCODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ERROR_CODE,_Fields.ERR_MSG,_Fields.DETAILS,_Fields.REQUEST_ID,_Fields.QUEUE_NAME};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_CODE, new libthrift091.meta_data.FieldMetaData("errorCode", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.ERR_MSG, new libthrift091.meta_data.FieldMetaData("errMsg", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.DETAILS, new libthrift091.meta_data.FieldMetaData("details", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUEST_ID, new libthrift091.meta_data.FieldMetaData("requestId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUEUE_NAME, new libthrift091.meta_data.FieldMetaData("queueName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GalaxyEmqServiceException.class, metaDataMap);
  }

  public GalaxyEmqServiceException() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GalaxyEmqServiceException(GalaxyEmqServiceException other) {
    __isset_bitfield = other.__isset_bitfield;
    this.errorCode = other.errorCode;
    if (other.isSetErrMsg()) {
      this.errMsg = other.errMsg;
    }
    if (other.isSetDetails()) {
      this.details = other.details;
    }
    if (other.isSetRequestId()) {
      this.requestId = other.requestId;
    }
    if (other.isSetQueueName()) {
      this.queueName = other.queueName;
    }
  }

  public GalaxyEmqServiceException deepCopy() {
    return new GalaxyEmqServiceException(this);
  }

  @Override
  public void clear() {
    setErrorCodeIsSet(false);
    this.errorCode = 0;
    this.errMsg = null;
    this.details = null;
    this.requestId = null;
    this.queueName = null;
  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public GalaxyEmqServiceException setErrorCode(int errorCode) {
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);
    return this;
  }

  public void unsetErrorCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return EncodingUtils.testBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  public void setErrorCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ERRORCODE_ISSET_ID, value);
  }

  public String getErrMsg() {
    return this.errMsg;
  }

  public GalaxyEmqServiceException setErrMsg(String errMsg) {
    this.errMsg = errMsg;
    return this;
  }

  public void unsetErrMsg() {
    this.errMsg = null;
  }

  /** Returns true if field errMsg is set (has been assigned a value) and false otherwise */
  public boolean isSetErrMsg() {
    return this.errMsg != null;
  }

  public void setErrMsgIsSet(boolean value) {
    if (!value) {
      this.errMsg = null;
    }
  }

  public String getDetails() {
    return this.details;
  }

  public GalaxyEmqServiceException setDetails(String details) {
    this.details = details;
    return this;
  }

  public void unsetDetails() {
    this.details = null;
  }

  /** Returns true if field details is set (has been assigned a value) and false otherwise */
  public boolean isSetDetails() {
    return this.details != null;
  }

  public void setDetailsIsSet(boolean value) {
    if (!value) {
      this.details = null;
    }
  }

  public String getRequestId() {
    return this.requestId;
  }

  public GalaxyEmqServiceException setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public void unsetRequestId() {
    this.requestId = null;
  }

  /** Returns true if field requestId is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestId() {
    return this.requestId != null;
  }

  public void setRequestIdIsSet(boolean value) {
    if (!value) {
      this.requestId = null;
    }
  }

  public String getQueueName() {
    return this.queueName;
  }

  public GalaxyEmqServiceException setQueueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

  public void unsetQueueName() {
    this.queueName = null;
  }

  /** Returns true if field queueName is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueName() {
    return this.queueName != null;
  }

  public void setQueueNameIsSet(boolean value) {
    if (!value) {
      this.queueName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((Integer)value);
      }
      break;

    case ERR_MSG:
      if (value == null) {
        unsetErrMsg();
      } else {
        setErrMsg((String)value);
      }
      break;

    case DETAILS:
      if (value == null) {
        unsetDetails();
      } else {
        setDetails((String)value);
      }
      break;

    case REQUEST_ID:
      if (value == null) {
        unsetRequestId();
      } else {
        setRequestId((String)value);
      }
      break;

    case QUEUE_NAME:
      if (value == null) {
        unsetQueueName();
      } else {
        setQueueName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_CODE:
      return Integer.valueOf(getErrorCode());

    case ERR_MSG:
      return getErrMsg();

    case DETAILS:
      return getDetails();

    case REQUEST_ID:
      return getRequestId();

    case QUEUE_NAME:
      return getQueueName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERROR_CODE:
      return isSetErrorCode();
    case ERR_MSG:
      return isSetErrMsg();
    case DETAILS:
      return isSetDetails();
    case REQUEST_ID:
      return isSetRequestId();
    case QUEUE_NAME:
      return isSetQueueName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GalaxyEmqServiceException)
      return this.equals((GalaxyEmqServiceException)that);
    return false;
  }

  public boolean equals(GalaxyEmqServiceException that) {
    if (that == null)
      return false;

    boolean this_present_errorCode = true && this.isSetErrorCode();
    boolean that_present_errorCode = true && that.isSetErrorCode();
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (this.errorCode != that.errorCode)
        return false;
    }

    boolean this_present_errMsg = true && this.isSetErrMsg();
    boolean that_present_errMsg = true && that.isSetErrMsg();
    if (this_present_errMsg || that_present_errMsg) {
      if (!(this_present_errMsg && that_present_errMsg))
        return false;
      if (!this.errMsg.equals(that.errMsg))
        return false;
    }

    boolean this_present_details = true && this.isSetDetails();
    boolean that_present_details = true && that.isSetDetails();
    if (this_present_details || that_present_details) {
      if (!(this_present_details && that_present_details))
        return false;
      if (!this.details.equals(that.details))
        return false;
    }

    boolean this_present_requestId = true && this.isSetRequestId();
    boolean that_present_requestId = true && that.isSetRequestId();
    if (this_present_requestId || that_present_requestId) {
      if (!(this_present_requestId && that_present_requestId))
        return false;
      if (!this.requestId.equals(that.requestId))
        return false;
    }

    boolean this_present_queueName = true && this.isSetQueueName();
    boolean that_present_queueName = true && that.isSetQueueName();
    if (this_present_queueName || that_present_queueName) {
      if (!(this_present_queueName && that_present_queueName))
        return false;
      if (!this.queueName.equals(that.queueName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_errorCode = true && (isSetErrorCode());
    list.add(present_errorCode);
    if (present_errorCode)
      list.add(errorCode);

    boolean present_errMsg = true && (isSetErrMsg());
    list.add(present_errMsg);
    if (present_errMsg)
      list.add(errMsg);

    boolean present_details = true && (isSetDetails());
    list.add(present_details);
    if (present_details)
      list.add(details);

    boolean present_requestId = true && (isSetRequestId());
    list.add(present_requestId);
    if (present_requestId)
      list.add(requestId);

    boolean present_queueName = true && (isSetQueueName());
    list.add(present_queueName);
    if (present_queueName)
      list.add(queueName);

    return list.hashCode();
  }

  @Override
  public int compareTo(GalaxyEmqServiceException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetErrorCode()).compareTo(other.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.errorCode, other.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrMsg()).compareTo(other.isSetErrMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrMsg()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.errMsg, other.errMsg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDetails()).compareTo(other.isSetDetails());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDetails()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.details, other.details);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestId()).compareTo(other.isSetRequestId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.requestId, other.requestId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueueName()).compareTo(other.isSetQueueName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueName, other.queueName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GalaxyEmqServiceException(");
    boolean first = true;

    if (isSetErrorCode()) {
      sb.append("errorCode:");
      sb.append(this.errorCode);
      first = false;
    }
    if (isSetErrMsg()) {
      if (!first) sb.append(", ");
      sb.append("errMsg:");
      if (this.errMsg == null) {
        sb.append("null");
      } else {
        sb.append(this.errMsg);
      }
      first = false;
    }
    if (isSetDetails()) {
      if (!first) sb.append(", ");
      sb.append("details:");
      if (this.details == null) {
        sb.append("null");
      } else {
        sb.append(this.details);
      }
      first = false;
    }
    if (isSetRequestId()) {
      if (!first) sb.append(", ");
      sb.append("requestId:");
      if (this.requestId == null) {
        sb.append("null");
      } else {
        sb.append(this.requestId);
      }
      first = false;
    }
    if (isSetQueueName()) {
      if (!first) sb.append(", ");
      sb.append("queueName:");
      if (this.queueName == null) {
        sb.append("null");
      } else {
        sb.append(this.queueName);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GalaxyEmqServiceExceptionStandardSchemeFactory implements SchemeFactory {
    public GalaxyEmqServiceExceptionStandardScheme getScheme() {
      return new GalaxyEmqServiceExceptionStandardScheme();
    }
  }

  private static class GalaxyEmqServiceExceptionStandardScheme extends StandardScheme<GalaxyEmqServiceException> {

    public void read(libthrift091.protocol.TProtocol iprot, GalaxyEmqServiceException struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_CODE
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.errorCode = iprot.readI32();
              struct.setErrorCodeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERR_MSG
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.errMsg = iprot.readString();
              struct.setErrMsgIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DETAILS
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.details = iprot.readString();
              struct.setDetailsIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REQUEST_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.requestId = iprot.readString();
              struct.setRequestIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // QUEUE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.queueName = iprot.readString();
              struct.setQueueNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, GalaxyEmqServiceException struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetErrorCode()) {
        oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
        oprot.writeI32(struct.errorCode);
        oprot.writeFieldEnd();
      }
      if (struct.errMsg != null) {
        if (struct.isSetErrMsg()) {
          oprot.writeFieldBegin(ERR_MSG_FIELD_DESC);
          oprot.writeString(struct.errMsg);
          oprot.writeFieldEnd();
        }
      }
      if (struct.details != null) {
        if (struct.isSetDetails()) {
          oprot.writeFieldBegin(DETAILS_FIELD_DESC);
          oprot.writeString(struct.details);
          oprot.writeFieldEnd();
        }
      }
      if (struct.requestId != null) {
        if (struct.isSetRequestId()) {
          oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
          oprot.writeString(struct.requestId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.queueName != null) {
        if (struct.isSetQueueName()) {
          oprot.writeFieldBegin(QUEUE_NAME_FIELD_DESC);
          oprot.writeString(struct.queueName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GalaxyEmqServiceExceptionTupleSchemeFactory implements SchemeFactory {
    public GalaxyEmqServiceExceptionTupleScheme getScheme() {
      return new GalaxyEmqServiceExceptionTupleScheme();
    }
  }

  private static class GalaxyEmqServiceExceptionTupleScheme extends TupleScheme<GalaxyEmqServiceException> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GalaxyEmqServiceException struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetErrorCode()) {
        optionals.set(0);
      }
      if (struct.isSetErrMsg()) {
        optionals.set(1);
      }
      if (struct.isSetDetails()) {
        optionals.set(2);
      }
      if (struct.isSetRequestId()) {
        optionals.set(3);
      }
      if (struct.isSetQueueName()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetErrorCode()) {
        oprot.writeI32(struct.errorCode);
      }
      if (struct.isSetErrMsg()) {
        oprot.writeString(struct.errMsg);
      }
      if (struct.isSetDetails()) {
        oprot.writeString(struct.details);
      }
      if (struct.isSetRequestId()) {
        oprot.writeString(struct.requestId);
      }
      if (struct.isSetQueueName()) {
        oprot.writeString(struct.queueName);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GalaxyEmqServiceException struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.errorCode = iprot.readI32();
        struct.setErrorCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.errMsg = iprot.readString();
        struct.setErrMsgIsSet(true);
      }
      if (incoming.get(2)) {
        struct.details = iprot.readString();
        struct.setDetailsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.requestId = iprot.readString();
        struct.setRequestIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.queueName = iprot.readString();
        struct.setQueueNameIsSet(true);
      }
    }
  }

}

