package io.objects.tl.api.contacts;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.api.TLAbsContactLink;
import io.objects.tl.api.TLAbsUser;
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
public class TLLink extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x3ace484c;

    protected TLAbsContactLink myLink;

    protected TLAbsContactLink foreignLink;

    protected TLAbsUser user;

    private final String _constructor = "contacts.link#3ace484c";

    public TLLink() {
    }

    public TLLink(TLAbsContactLink myLink, TLAbsContactLink foreignLink, TLAbsUser user) {
        this.myLink = myLink;
        this.foreignLink = foreignLink;
        this.user = user;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(myLink, stream);
        writeTLObject(foreignLink, stream);
        writeTLObject(user, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        myLink = readTLObject(stream, context, TLAbsContactLink.class, -1);
        foreignLink = readTLObject(stream, context, TLAbsContactLink.class, -1);
        user = readTLObject(stream, context, TLAbsUser.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += myLink.computeSerializedSize();
        size += foreignLink.computeSerializedSize();
        size += user.computeSerializedSize();
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

    public TLAbsContactLink getMyLink() {
        return myLink;
    }

    public void setMyLink(TLAbsContactLink myLink) {
        this.myLink = myLink;
    }

    public TLAbsContactLink getForeignLink() {
        return foreignLink;
    }

    public void setForeignLink(TLAbsContactLink foreignLink) {
        this.foreignLink = foreignLink;
    }

    public TLAbsUser getUser() {
        return user;
    }

    public void setUser(TLAbsUser user) {
        this.user = user;
    }
}