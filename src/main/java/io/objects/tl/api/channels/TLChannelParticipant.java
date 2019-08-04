package io.objects.tl.api.channels;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.api.TLAbsChannelParticipant;
import io.objects.tl.api.TLAbsUser;
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
public class TLChannelParticipant extends TLObject {
    public static final int CONSTRUCTOR_ID = 0xd0d9b163;

    protected TLAbsChannelParticipant participant;

    protected TLVector<TLAbsUser> users;

    private final String _constructor = "channels.channelParticipant#d0d9b163";

    public TLChannelParticipant() {
    }

    public TLChannelParticipant(TLAbsChannelParticipant participant, TLVector<TLAbsUser> users) {
        this.participant = participant;
        this.users = users;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(participant, stream);
        writeTLVector(users, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        participant = readTLObject(stream, context, TLAbsChannelParticipant.class, -1);
        users = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += participant.computeSerializedSize();
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

    public TLAbsChannelParticipant getParticipant() {
        return participant;
    }

    public void setParticipant(TLAbsChannelParticipant participant) {
        this.participant = participant;
    }

    public TLVector<TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(TLVector<TLAbsUser> users) {
        this.users = users;
    }
}