package io.objects.tl.api.channels;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.api.TLAbsChat;
import io.objects.tl.api.TLAbsUser;
import io.objects.tl.api.TLChannelAdminLogEvent;
import io.objects.tl.core.TLObject;
import io.objects.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLAdminLogResults extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xed8af74d;

    protected TLVector<TLChannelAdminLogEvent> events;

    protected TLVector<TLAbsChat> chats;

    protected TLVector<TLAbsUser> users;

    private final String _constructor = "channels.adminLogResults#ed8af74d";

    public TLAdminLogResults() {
    }

    public TLAdminLogResults(TLVector<TLChannelAdminLogEvent> events, TLVector<TLAbsChat> chats,
            TLVector<TLAbsUser> users) {
        this.events = events;
        this.chats = chats;
        this.users = users;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(events, stream);
        writeTLVector(chats, stream);
        writeTLVector(users, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        events = readTLVector(stream, context);
        chats = readTLVector(stream, context);
        users = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += events.computeSerializedSize();
        size += chats.computeSerializedSize();
        size += users.computeSerializedSize();
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

    public TLVector<TLChannelAdminLogEvent> getEvents() {
        return events;
    }

    public void setEvents(TLVector<TLChannelAdminLogEvent> events) {
        this.events = events;
    }

    public TLVector<TLAbsChat> getChats() {
        return chats;
    }

    public void setChats(TLVector<TLAbsChat> chats) {
        this.chats = chats;
    }

    public TLVector<TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(TLVector<TLAbsUser> users) {
        this.users = users;
    }
}
