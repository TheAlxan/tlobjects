package io.objects.tl.api.payments;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.api.TLAbsUpdates;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLPaymentResult extends TLAbsPaymentResult {
    public static final int CONSTRUCTOR_ID = 0x4e5f810d;

    protected TLAbsUpdates updates;

    private final String _constructor = "payments.paymentResult#4e5f810d";

    public TLPaymentResult() {
    }

    public TLPaymentResult(TLAbsUpdates updates) {
        this.updates = updates;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(updates, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        updates = readTLObject(stream, context, TLAbsUpdates.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += updates.computeSerializedSize();
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

    public TLAbsUpdates getUpdates() {
        return updates;
    }

    public void setUpdates(TLAbsUpdates updates) {
        this.updates = updates;
    }
}