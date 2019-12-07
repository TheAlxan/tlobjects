package io.objects.tl.api;


import io.objects.tl.TLContext;
import io.objects.tl.api.auth.TLSentCode;
import io.objects.tl.api.request.TLCodeSettingsVtd;
import io.objects.tl.core.TLMethod;
import io.objects.tl.core.TLObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;


/**
 * This class is generated by Mono's TL class generator
 */
public class TLRequestAuthSendCodeVtd extends TLMethod<TLSentCode> {
    public static final int CONSTRUCTOR_ID = 0xa677244f;

    protected String phoneNumber;

    protected int apiId;

    protected String apiHash;

    protected TLCodeSettingsVtd codeSettings;

    private final String _constructor = "auth.sendCodeVtd#a677244f";

    public TLRequestAuthSendCodeVtd() {
    }

    public TLRequestAuthSendCodeVtd(String phoneNumber,
                                    int apiId, String apiHash, TLCodeSettingsVtd codeSettings) {
        this.phoneNumber = phoneNumber;
        this.apiId = apiId;
        this.apiHash = apiHash;
        this.codeSettings = codeSettings;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLSentCode deserializeResponse(InputStream stream, TLContext context) throws
            IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLSentCode)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLSentCode) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(phoneNumber, stream);
        writeInt(apiId, stream);
        writeString(apiHash, stream);
        writeTLObject(codeSettings, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        phoneNumber = readTLString(stream);
        apiId = readInt(stream);
        apiHash = readTLString(stream);
        codeSettings = (TLCodeSettingsVtd) readTLObject(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(phoneNumber);
        size += SIZE_INT32;
        size += computeTLStringSerializedSize(apiHash);
        size += codeSettings.computeSerializedSize();
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getApiId() {
        return apiId;
    }

    public void setApiId(int apiId) {
        this.apiId = apiId;
    }

    public String getApiHash() {
        return apiHash;
    }

    public void setApiHash(String apiHash) {
        this.apiHash = apiHash;
    }

    public TLCodeSettingsVtd getCodeSettings() {
        return codeSettings;
    }

    public void setCodeSettings(TLCodeSettingsVtd codeSettings) {
        this.codeSettings = codeSettings;
    }
}
