package io.objects.tl.api.request;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.api.TLInputSecureValue;
import io.objects.tl.api.TLSecureValue;
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
public class TLRequestAccountSaveSecureValue extends TLMethod<TLSecureValue> {
    public static final int CONSTRUCTOR_ID = 0x899fe31d;

    protected TLInputSecureValue value;

    protected long secureSecretId;

    private final String _constructor = "account.saveSecureValue#899fe31d";

    public TLRequestAccountSaveSecureValue() {
    }

    public TLRequestAccountSaveSecureValue(TLInputSecureValue value, long secureSecretId) {
        this.value = value;
        this.secureSecretId = secureSecretId;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLSecureValue deserializeResponse(InputStream stream, TLContext context) throws
            IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLSecureValue)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLSecureValue) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(value, stream);
        writeLong(secureSecretId, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        value = readTLObject(stream, context, TLInputSecureValue.class, TLInputSecureValue.CONSTRUCTOR_ID);
        secureSecretId = readLong(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += value.computeSerializedSize();
        size += SIZE_INT64;
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

    public TLInputSecureValue getValue() {
        return value;
    }

    public void setValue(TLInputSecureValue value) {
        this.value = value;
    }

    public long getSecureSecretId() {
        return secureSecretId;
    }

    public void setSecureSecretId(long secureSecretId) {
        this.secureSecretId = secureSecretId;
    }
}