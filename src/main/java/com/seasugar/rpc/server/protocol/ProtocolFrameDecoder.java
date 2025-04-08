package com.seasugar.rpc.server.protocol;

import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

public class ProtocolFrameDecoder extends LengthFieldBasedFrameDecoder {
    private ProtocolFrameDecoder(int maxFrameLength, int lengthFieldOffset, int lengthFieldLength) {
        super(maxFrameLength, lengthFieldOffset, lengthFieldLength);
    }

    public ProtocolFrameDecoder() {
        super(1024 * 1024 * 1024, 0, 4);
    }
}
