# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: chat.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\nchat.proto\"\x1b\n\x07\x63onnect\x12\x10\n\x08userName\x18\x01 \x01(\t\";\n\x0emessageRequest\x12\x0c\n\x04\x66rom\x18\x01 \x01(\t\x12\n\n\x02to\x18\x02 \x01(\t\x12\x0f\n\x07message\x18\x03 \x01(\t\"0\n\x0fmessageResponse\x12\x0c\n\x04\x66rom\x18\x01 \x01(\t\x12\x0f\n\x07message\x18\x02 \x01(\t2a\n\x0b\x63hatService\x12%\n\x05login\x12\x08.connect\x1a\x10.messageResponse0\x01\x12+\n\x06sendTo\x12\x0f.messageRequest\x1a\x10.messageResponseB\x10\n\x0ema.enset.stubsb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'chat_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\016ma.enset.stubs'
  _CONNECT._serialized_start=14
  _CONNECT._serialized_end=41
  _MESSAGEREQUEST._serialized_start=43
  _MESSAGEREQUEST._serialized_end=102
  _MESSAGERESPONSE._serialized_start=104
  _MESSAGERESPONSE._serialized_end=152
  _CHATSERVICE._serialized_start=154
  _CHATSERVICE._serialized_end=251
# @@protoc_insertion_point(module_scope)
