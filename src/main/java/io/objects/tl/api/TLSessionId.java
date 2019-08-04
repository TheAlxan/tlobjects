package io.objects.tl.api;

import io.objects.tl.TLContext;
import io.objects.tl.core.TLBytes;
import io.objects.tl.core.TLObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static io.objects.tl.StreamUtils.readTLBytes;
import static io.objects.tl.StreamUtils.writeTLBytes;
import static io.objects.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID;
import static io.objects.tl.TLObjectUtils.computeTLBytesSerializedSize;

/**
 * This class is generated by Abolfazl Rezvan.
 */
public class TLSessionId extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x8417dec8;
    private final String _constructor = "sessionId#8417dec8";
    protected TLBytes bytes;

    public TLSessionId() {
    }

    public TLSessionId(TLBytes bytes) {
        this.bytes = bytes;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLBytes(bytes, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        bytes = readTLBytes(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLBytesSerializedSize(bytes);

        return size;
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }

    public TLBytes getBytes() {
        return bytes;
    }

    public void setBytes(TLBytes bytes) {
        this.bytes = bytes;
    }
}
