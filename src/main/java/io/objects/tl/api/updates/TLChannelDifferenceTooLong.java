package io.objects.tl.api.updates;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.api.TLAbsChat;
import io.objects.tl.api.TLAbsMessage;
import io.objects.tl.api.TLAbsUser;
import io.objects.tl.core.TLVector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLChannelDifferenceTooLong extends TLAbsChannelDifference {
    public static final int CONSTRUCTOR_ID = 0x6a9d7b35;

    protected int topMessage;

    protected int readInboxMaxId;

    protected int readOutboxMaxId;

    protected int unreadCount;

    protected int unreadMentionsCount;

    protected TLVector<TLAbsMessage> messages;

    protected TLVector<TLAbsChat> chats;

    protected TLVector<TLAbsUser> users;

    private final String _constructor = "updates.channelDifferenceTooLong#6a9d7b35";

    public TLChannelDifferenceTooLong() {
    }

    public TLChannelDifferenceTooLong(boolean _final, int pts, Integer timeout, int topMessage,
            int readInboxMaxId, int readOutboxMaxId, int unreadCount, int unreadMentionsCount,
            TLVector<TLAbsMessage> messages, TLVector<TLAbsChat> chats, TLVector<TLAbsUser> users) {
        this._final = _final;
        this.pts = pts;
        this.timeout = timeout;
        this.topMessage = topMessage;
        this.readInboxMaxId = readInboxMaxId;
        this.readOutboxMaxId = readOutboxMaxId;
        this.unreadCount = unreadCount;
        this.unreadMentionsCount = unreadMentionsCount;
        this.messages = messages;
        this.chats = chats;
        this.users = users;
    }

    private void computeFlags() {
        flags = 0;
        flags = _final ? (flags | 1) : (flags & ~1);
        flags = timeout != null ? (flags | 2) : (flags & ~2);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeInt(pts, stream);
        if ((flags & 2) != 0) {
            if (timeout == null) throwNullFieldException("timeout", flags);
            writeInt(timeout, stream);
        }
        writeInt(topMessage, stream);
        writeInt(readInboxMaxId, stream);
        writeInt(readOutboxMaxId, stream);
        writeInt(unreadCount, stream);
        writeInt(unreadMentionsCount, stream);
        writeTLVector(messages, stream);
        writeTLVector(chats, stream);
        writeTLVector(users, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        _final = (flags & 1) != 0;
        pts = readInt(stream);
        timeout = (flags & 2) != 0 ? readInt(stream) : null;
        topMessage = readInt(stream);
        readInboxMaxId = readInt(stream);
        readOutboxMaxId = readInt(stream);
        unreadCount = readInt(stream);
        unreadMentionsCount = readInt(stream);
        messages = readTLVector(stream, context);
        chats = readTLVector(stream, context);
        users = readTLVector(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT32;
        if ((flags & 2) != 0) {
            if (timeout == null) throwNullFieldException("timeout", flags);
            size += SIZE_INT32;
        }
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += messages.computeSerializedSize();
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

    public boolean getFinal() {
        return _final;
    }

    public void setFinal(boolean _final) {
        this._final = _final;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public int getTopMessage() {
        return topMessage;
    }

    public void setTopMessage(int topMessage) {
        this.topMessage = topMessage;
    }

    public int getReadInboxMaxId() {
        return readInboxMaxId;
    }

    public void setReadInboxMaxId(int readInboxMaxId) {
        this.readInboxMaxId = readInboxMaxId;
    }

    public int getReadOutboxMaxId() {
        return readOutboxMaxId;
    }

    public void setReadOutboxMaxId(int readOutboxMaxId) {
        this.readOutboxMaxId = readOutboxMaxId;
    }

    public int getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(int unreadCount) {
        this.unreadCount = unreadCount;
    }

    public int getUnreadMentionsCount() {
        return unreadMentionsCount;
    }

    public void setUnreadMentionsCount(int unreadMentionsCount) {
        this.unreadMentionsCount = unreadMentionsCount;
    }

    public TLVector<TLAbsMessage> getMessages() {
        return messages;
    }

    public void setMessages(TLVector<TLAbsMessage> messages) {
        this.messages = messages;
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