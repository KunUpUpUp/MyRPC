package com.seasugar.rpc.server.message;

public abstract class Message {
    private Long id;
    private Long senderId;
    private Long receiverId;
    private String content;

    public abstract byte getType();
}
