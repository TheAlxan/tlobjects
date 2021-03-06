package io.objects.tl.api.request;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.core.TLBool;
import io.objects.tl.core.TLMethod;
import io.objects.tl.core.TLObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLRequestHelpSetBotUpdatesStatus extends TLMethod<TLBool> {
    public static final int CONSTRUCTOR_ID = 0xec22cfcd;

    protected int pendingUpdatesCount;

    protected String message;

    private final String _constructor = "help.setBotUpdatesStatus#ec22cfcd";

    public TLRequestHelpSetBotUpdatesStatus() {
    }

    public TLRequestHelpSetBotUpdatesStatus(int pendingUpdatesCount, String message) {
        this.pendingUpdatesCount = pendingUpdatesCount;
        this.message = message;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLBool)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLBool) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(pendingUpdatesCount, stream);
        writeString(message, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        pendingUpdatesCount = readInt(stream);
        message = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += computeTLStringSerializedSize(message);
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

    public int getPendingUpdatesCount() {
        return pendingUpdatesCount;
    }

    public void setPendingUpdatesCount(int pendingUpdatesCount) {
        this.pendingUpdatesCount = pendingUpdatesCount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
