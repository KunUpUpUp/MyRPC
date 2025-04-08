package com.seasugar.rpc.server.protocol;

import com.seasugar.rpc.server.message.Message;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;
import io.netty.util.concurrent.EventExecutorGroup;

import java.util.List;

// MessageToMessageCodec<INBOUND_IN, OUTBOUND_IN> 即ByteBuf为入站（网络层）的类型，Message是出站的类型（应用层）
public class MessageDuplexCodec extends MessageToMessageCodec<ByteBuf, Message> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Message message, List<Object> list) throws Exception {

    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {

    }
}
