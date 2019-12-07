package io.objects.tl.api.request;

import io.objects.tl.TLContext;
import io.objects.tl.api.TLAbsInputPeer;
import io.objects.tl.api.TLAbsInputUser;
import io.objects.tl.api.TLAbsMessagesFilter;
import io.objects.tl.api.messages.TLAbsMessages;
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
public class TLRequestMessagesSearchVios extends TLMethod<TLAbsMessages> {
    public static final int CONSTRUCTOR_ID = 0xf288a275;

    protected int flags;

    protected TLAbsInputPeer peer;

    protected String q;

    protected TLAbsInputUser fromId;

    protected TLAbsMessagesFilter filter;

    protected int minDate;

    protected int maxDate;

    protected int offsetId;

    protected int maxId;

    protected int limit;

    private final String _constructor = "messages.searchVios#f288a275";

    public TLRequestMessagesSearchVios() {
    }

    public TLRequestMessagesSearchVios(TLAbsInputPeer peer, String q, TLAbsInputUser fromId,
                                       TLAbsMessagesFilter filter, int minDate, int maxDate,
                                       int offsetId, int limit, int maxId) {
        this.peer = peer;
        this.q = q;
        this.fromId = fromId;
        this.filter = filter;
        this.minDate = minDate;
        this.maxDate = maxDate;
        this.offsetId = offsetId;
        this.limit = limit;
        this.maxId = maxId;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLAbsMessages deserializeResponse(InputStream stream, TLContext context) throws
            IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLAbsMessages)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLAbsMessages) response;
    }

    private void computeFlags() {
        flags = 0;
        flags = fromId != null ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(peer, stream);
        writeString(q, stream);
        if ((flags & 1) != 0) {
            if (fromId == null) throwNullFieldException("fromId", flags);
            writeTLObject(fromId, stream);
        }
        writeTLObject(filter, stream);
        writeInt(minDate, stream);
        writeInt(maxDate, stream);
        writeInt(offsetId, stream);
        writeInt(limit, stream);
        writeInt(maxId, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        peer = readTLObject(stream, context, TLAbsInputPeer.class, -1);
        q = readTLString(stream);
        fromId = (flags & 1) != 0 ? readTLObject(stream, context, TLAbsInputUser.class, -1) : null;
        filter = readTLObject(stream, context, TLAbsMessagesFilter.class, -1);
        minDate = readInt(stream);
        maxDate = readInt(stream);
        offsetId = readInt(stream);
        limit = readInt(stream);
        maxId = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += peer.computeSerializedSize();
        size += computeTLStringSerializedSize(q);
        if ((flags & 1) != 0) {
            if (fromId == null) throwNullFieldException("fromId", flags);
            size += fromId.computeSerializedSize();
        }
        size += filter.computeSerializedSize();
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += SIZE_INT32;
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

    public TLAbsInputPeer getPeer() {
        return peer;
    }

    public void setPeer(TLAbsInputPeer peer) {
        this.peer = peer;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public TLAbsInputUser getFromId() {
        return fromId;
    }

    public void setFromId(TLAbsInputUser fromId) {
        this.fromId = fromId;
    }

    public TLAbsMessagesFilter getFilter() {
        return filter;
    }

    public void setFilter(TLAbsMessagesFilter filter) {
        this.filter = filter;
    }

    public int getMinDate() {
        return minDate;
    }

    public void setMinDate(int minDate) {
        this.minDate = minDate;
    }

    public int getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(int maxDate) {
        this.maxDate = maxDate;
    }

    public int getOffsetId() {
        return offsetId;
    }

    public void setOffsetId(int offsetId) {
        this.offsetId = offsetId;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getMaxId() {
        return maxId;
    }

    public void setMaxId(int maxId) {
        this.maxId = maxId;
    }

}
