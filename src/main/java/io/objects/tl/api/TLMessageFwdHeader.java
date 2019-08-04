package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.core.TLObject;
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
public class TLMessageFwdHeader extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x559ebe6d;

    protected int flags;

    protected Integer fromId;

    protected int date;

    protected Integer channelId;

    protected Integer channelPost;

    protected String postAuthor;

    protected TLAbsPeer savedFromPeer;

    protected Integer savedFromMsgId;

    private final String _constructor = "messageFwdHeader#559ebe6d";

    public TLMessageFwdHeader() {
    }

    public TLMessageFwdHeader(Integer fromId, int date, Integer channelId, Integer channelPost,
            String postAuthor, TLAbsPeer savedFromPeer, Integer savedFromMsgId) {
        this.fromId = fromId;
        this.date = date;
        this.channelId = channelId;
        this.channelPost = channelPost;
        this.postAuthor = postAuthor;
        this.savedFromPeer = savedFromPeer;
        this.savedFromMsgId = savedFromMsgId;
    }

    private void computeFlags() {
        flags = 0;
        flags = fromId != null ? (flags | 1) : (flags & ~1);
        flags = channelId != null ? (flags | 2) : (flags & ~2);
        flags = channelPost != null ? (flags | 4) : (flags & ~4);
        flags = postAuthor != null ? (flags | 8) : (flags & ~8);
        flags = savedFromPeer != null ? (flags | 16) : (flags & ~16);
        flags = savedFromMsgId != null ? (flags | 16) : (flags & ~16);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        if ((flags & 1) != 0) {
            if (fromId == null) throwNullFieldException("fromId", flags);
            writeInt(fromId, stream);
        }
        writeInt(date, stream);
        if ((flags & 2) != 0) {
            if (channelId == null) throwNullFieldException("channelId", flags);
            writeInt(channelId, stream);
        }
        if ((flags & 4) != 0) {
            if (channelPost == null) throwNullFieldException("channelPost", flags);
            writeInt(channelPost, stream);
        }
        if ((flags & 8) != 0) {
            if (postAuthor == null) throwNullFieldException("postAuthor", flags);
            writeString(postAuthor, stream);
        }
        if ((flags & 16) != 0) {
            if (savedFromPeer == null) throwNullFieldException("savedFromPeer", flags);
            writeTLObject(savedFromPeer, stream);
        }
        if ((flags & 16) != 0) {
            if (savedFromMsgId == null) throwNullFieldException("savedFromMsgId", flags);
            writeInt(savedFromMsgId, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        fromId = (flags & 1) != 0 ? readInt(stream) : null;
        date = readInt(stream);
        channelId = (flags & 2) != 0 ? readInt(stream) : null;
        channelPost = (flags & 4) != 0 ? readInt(stream) : null;
        postAuthor = (flags & 8) != 0 ? readTLString(stream) : null;
        savedFromPeer = (flags & 16) != 0 ? readTLObject(stream, context, TLAbsPeer.class, -1) : null;
        savedFromMsgId = (flags & 16) != 0 ? readInt(stream) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        if ((flags & 1) != 0) {
            if (fromId == null) throwNullFieldException("fromId", flags);
            size += SIZE_INT32;
        }
        size += SIZE_INT32;
        if ((flags & 2) != 0) {
            if (channelId == null) throwNullFieldException("channelId", flags);
            size += SIZE_INT32;
        }
        if ((flags & 4) != 0) {
            if (channelPost == null) throwNullFieldException("channelPost", flags);
            size += SIZE_INT32;
        }
        if ((flags & 8) != 0) {
            if (postAuthor == null) throwNullFieldException("postAuthor", flags);
            size += computeTLStringSerializedSize(postAuthor);
        }
        if ((flags & 16) != 0) {
            if (savedFromPeer == null) throwNullFieldException("savedFromPeer", flags);
            size += savedFromPeer.computeSerializedSize();
        }
        if ((flags & 16) != 0) {
            if (savedFromMsgId == null) throwNullFieldException("savedFromMsgId", flags);
            size += SIZE_INT32;
        }
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

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getChannelPost() {
        return channelPost;
    }

    public void setChannelPost(Integer channelPost) {
        this.channelPost = channelPost;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public TLAbsPeer getSavedFromPeer() {
        return savedFromPeer;
    }

    public void setSavedFromPeer(TLAbsPeer savedFromPeer) {
        this.savedFromPeer = savedFromPeer;
    }

    public Integer getSavedFromMsgId() {
        return savedFromMsgId;
    }

    public void setSavedFromMsgId(Integer savedFromMsgId) {
        this.savedFromMsgId = savedFromMsgId;
    }
}