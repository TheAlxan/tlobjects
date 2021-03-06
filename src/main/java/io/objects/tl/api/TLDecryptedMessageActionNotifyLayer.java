package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLDecryptedMessageActionNotifyLayer extends TLAbsDecryptedMessageAction {
    public static final int CONSTRUCTOR_ID = 0xf3048883;

    protected int layer;

    private final String _constructor = "decryptedMessageActionNotifyLayer#f3048883";

    public TLDecryptedMessageActionNotifyLayer() {
    }

    public TLDecryptedMessageActionNotifyLayer(int layer) {
        this.layer = layer;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(layer, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        layer = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
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

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }
}
