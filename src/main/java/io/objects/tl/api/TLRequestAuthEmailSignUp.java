package io.objects.tl.api;

import io.objects.tl.TLContext;
import io.objects.tl.api.auth.TLAuthorization;
import io.objects.tl.core.TLMethod;
import io.objects.tl.core.TLObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID;
import static io.objects.tl.TLObjectUtils.computeTLStringSerializedSize;

/**
 * @author liaghat
 */
public class TLRequestAuthEmailSignUp extends TLMethod<TLAuthorization> {
    public static final int CONSTRUCTOR_ID = 0x1b061624;
    private final String _constructor = "auth.emailSignUp#1b061624";
    protected String email;
    protected String emailCode;
    protected String firstName;
    protected String lastName;

    public TLRequestAuthEmailSignUp() {
    }

    public TLRequestAuthEmailSignUp(String email, String emailCode, String firstName, String lastName) {
        this.email = email;
        this.emailCode = emailCode;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public io.objects.tl.api.auth.TLAuthorization deserializeResponse(InputStream stream, TLContext context) throws
            IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof io.objects.tl.api.auth.TLAuthorization)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLAuthorization) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(email, stream);
        writeString(emailCode, stream);
        writeString(firstName, stream);
        writeString(lastName, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        email = readTLString(stream);
        emailCode = readTLString(stream);
        firstName = readTLString(stream);
        lastName = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(email);
        size += computeTLStringSerializedSize(emailCode);
        size += computeTLStringSerializedSize(firstName);
        size += computeTLStringSerializedSize(lastName);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
