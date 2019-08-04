package io.objects.tl.api.request;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.api.TLAbsInputPrivacyKey;
import io.objects.tl.api.account.TLPrivacyRules;
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
public class TLRequestAccountGetPrivacy extends TLMethod<TLPrivacyRules> {
    public static final int CONSTRUCTOR_ID = 0xdadbc950;

    protected TLAbsInputPrivacyKey key;

    private final String _constructor = "account.getPrivacy#dadbc950";

    public TLRequestAccountGetPrivacy() {
    }

    public TLRequestAccountGetPrivacy(TLAbsInputPrivacyKey key) {
        this.key = key;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLPrivacyRules deserializeResponse(InputStream stream, TLContext context) throws
            IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLPrivacyRules)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLPrivacyRules) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(key, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        key = readTLObject(stream, context, TLAbsInputPrivacyKey.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += key.computeSerializedSize();
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

    public TLAbsInputPrivacyKey getKey() {
        return key;
    }

    public void setKey(TLAbsInputPrivacyKey key) {
        this.key = key;
    }
}