package io.objects.tl.api.request;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.api.account.TLAuthorizationForm;
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
public class TLRequestAccountGetAuthorizationForm extends TLMethod<TLAuthorizationForm> {
    public static final int CONSTRUCTOR_ID = 0xb86ba8e1;

    protected int botId;

    protected String scope;

    protected String publicKey;

    private final String _constructor = "account.getAuthorizationForm#b86ba8e1";

    public TLRequestAccountGetAuthorizationForm() {
    }

    public TLRequestAccountGetAuthorizationForm(int botId, String scope, String publicKey) {
        this.botId = botId;
        this.scope = scope;
        this.publicKey = publicKey;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLAuthorizationForm deserializeResponse(InputStream stream, TLContext context) throws
            IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLAuthorizationForm)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLAuthorizationForm) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(botId, stream);
        writeString(scope, stream);
        writeString(publicKey, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        botId = readInt(stream);
        scope = readTLString(stream);
        publicKey = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += computeTLStringSerializedSize(scope);
        size += computeTLStringSerializedSize(publicKey);
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

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
