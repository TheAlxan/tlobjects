package io.objects.tl.mtproto;

import io.objects.tl.TLContext;
import io.objects.tl.core.TLMethod;
import io.objects.tl.core.TLObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static io.objects.tl.TLObjectUtils.*;

/**
 * This class is generated by Alxan and Xanjar: V85a
 */
public class MTDestroySession extends TLMethod<TLObject> {
    public static final int CONSTRUCTOR_ID = 0xe7512126;

    public MTDestroySession() {
    }

    public void serializeBody(OutputStream stream) throws IOException {
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        return size;
    }


    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }

    @Override
    public TLObject deserializeResponse(InputStream stream, TLContext context) throws IOException {
        return null;
    }
}