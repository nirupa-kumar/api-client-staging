// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/app_yaml.proto

package com.google.appengine.v1;

/**
 * <pre>
 * Executes a script to handle the request that matches the URL pattern.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.ScriptHandler}
 */
public  final class ScriptHandler extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.ScriptHandler)
    ScriptHandlerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScriptHandler.newBuilder() to construct.
  private ScriptHandler(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScriptHandler() {
    scriptPath_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ScriptHandler(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            scriptPath_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.appengine.v1.AppYamlProto.internal_static_google_appengine_v1_ScriptHandler_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AppYamlProto.internal_static_google_appengine_v1_ScriptHandler_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.ScriptHandler.class, com.google.appengine.v1.ScriptHandler.Builder.class);
  }

  public static final int SCRIPT_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object scriptPath_;
  /**
   * <pre>
   * Path to the script from the application root directory.
   * </pre>
   *
   * <code>string script_path = 1;</code>
   */
  public java.lang.String getScriptPath() {
    java.lang.Object ref = scriptPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scriptPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path to the script from the application root directory.
   * </pre>
   *
   * <code>string script_path = 1;</code>
   */
  public com.google.protobuf.ByteString
      getScriptPathBytes() {
    java.lang.Object ref = scriptPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scriptPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getScriptPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, scriptPath_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getScriptPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, scriptPath_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.appengine.v1.ScriptHandler)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.ScriptHandler other = (com.google.appengine.v1.ScriptHandler) obj;

    boolean result = true;
    result = result && getScriptPath()
        .equals(other.getScriptPath());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SCRIPT_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getScriptPath().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.ScriptHandler parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.ScriptHandler parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.ScriptHandler parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.ScriptHandler parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.ScriptHandler parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.appengine.v1.ScriptHandler parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.appengine.v1.ScriptHandler parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.ScriptHandler parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.ScriptHandler parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.ScriptHandler parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.appengine.v1.ScriptHandler parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.appengine.v1.ScriptHandler parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.appengine.v1.ScriptHandler prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Executes a script to handle the request that matches the URL pattern.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.ScriptHandler}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.ScriptHandler)
      com.google.appengine.v1.ScriptHandlerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.appengine.v1.AppYamlProto.internal_static_google_appengine_v1_ScriptHandler_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AppYamlProto.internal_static_google_appengine_v1_ScriptHandler_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.ScriptHandler.class, com.google.appengine.v1.ScriptHandler.Builder.class);
    }

    // Construct using com.google.appengine.v1.ScriptHandler.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      scriptPath_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.appengine.v1.AppYamlProto.internal_static_google_appengine_v1_ScriptHandler_descriptor;
    }

    public com.google.appengine.v1.ScriptHandler getDefaultInstanceForType() {
      return com.google.appengine.v1.ScriptHandler.getDefaultInstance();
    }

    public com.google.appengine.v1.ScriptHandler build() {
      com.google.appengine.v1.ScriptHandler result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.appengine.v1.ScriptHandler buildPartial() {
      com.google.appengine.v1.ScriptHandler result = new com.google.appengine.v1.ScriptHandler(this);
      result.scriptPath_ = scriptPath_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.appengine.v1.ScriptHandler) {
        return mergeFrom((com.google.appengine.v1.ScriptHandler)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.ScriptHandler other) {
      if (other == com.google.appengine.v1.ScriptHandler.getDefaultInstance()) return this;
      if (!other.getScriptPath().isEmpty()) {
        scriptPath_ = other.scriptPath_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.appengine.v1.ScriptHandler parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.ScriptHandler) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object scriptPath_ = "";
    /**
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script_path = 1;</code>
     */
    public java.lang.String getScriptPath() {
      java.lang.Object ref = scriptPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scriptPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script_path = 1;</code>
     */
    public com.google.protobuf.ByteString
        getScriptPathBytes() {
      java.lang.Object ref = scriptPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scriptPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script_path = 1;</code>
     */
    public Builder setScriptPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scriptPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script_path = 1;</code>
     */
    public Builder clearScriptPath() {
      
      scriptPath_ = getDefaultInstance().getScriptPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path to the script from the application root directory.
     * </pre>
     *
     * <code>string script_path = 1;</code>
     */
    public Builder setScriptPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      scriptPath_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.appengine.v1.ScriptHandler)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.ScriptHandler)
  private static final com.google.appengine.v1.ScriptHandler DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.ScriptHandler();
  }

  public static com.google.appengine.v1.ScriptHandler getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScriptHandler>
      PARSER = new com.google.protobuf.AbstractParser<ScriptHandler>() {
    public ScriptHandler parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScriptHandler(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScriptHandler> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScriptHandler> getParserForType() {
    return PARSER;
  }

  public com.google.appengine.v1.ScriptHandler getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

