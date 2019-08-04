package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
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
public class TLChannelForbidden extends TLAbsChat {
    public static final int CONSTRUCTOR_ID = 0x289da732;

    protected int flags;

    protected boolean broadcast;

    protected boolean megagroup;

    protected long accessHash;

    protected String title;

    protected Integer untilDate;

    private final String _constructor = "channelForbidden#289da732";

    public TLChannelForbidden() {
    }

    public TLChannelForbidden(boolean broadcast, boolean megagroup, int id, long accessHash,
            String title, Integer untilDate) {
        this.broadcast = broadcast;
        this.megagroup = megagroup;
        this.id = id;
        this.accessHash = accessHash;
        this.title = title;
        this.untilDate = untilDate;
    }

    private void computeFlags() {
        flags = 0;
        flags = broadcast ? (flags | 32) : (flags & ~32);
        flags = megagroup ? (flags | 256) : (flags & ~256);
        flags = untilDate != null ? (flags | 65536) : (flags & ~65536);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeInt(id, stream);
        writeLong(accessHash, stream);
        writeString(title, stream);
        if ((flags & 65536) != 0) {
            if (untilDate == null) throwNullFieldException("untilDate", flags);
            writeInt(untilDate, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        broadcast = (flags & 32) != 0;
        megagroup = (flags & 256) != 0;
        id = readInt(stream);
        accessHash = readLong(stream);
        title = readTLString(stream);
        untilDate = (flags & 65536) != 0 ? readInt(stream) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += SIZE_INT64;
        size += computeTLStringSerializedSize(title);
        if ((flags & 65536) != 0) {
            if (untilDate == null) throwNullFieldException("untilDate", flags);
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

    public boolean getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(boolean broadcast) {
        this.broadcast = broadcast;
    }

    public boolean getMegagroup() {
        return megagroup;
    }

    public void setMegagroup(boolean megagroup) {
        this.megagroup = megagroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAccessHash() {
        return accessHash;
    }

    public void setAccessHash(long accessHash) {
        this.accessHash = accessHash;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUntilDate() {
        return untilDate;
    }

    public void setUntilDate(Integer untilDate) {
        this.untilDate = untilDate;
    }
}