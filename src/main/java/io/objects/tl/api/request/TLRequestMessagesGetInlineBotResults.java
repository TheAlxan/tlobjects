package io.objects.tl.api.request;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.api.TLAbsInputGeoPoint;
import io.objects.tl.api.TLAbsInputPeer;
import io.objects.tl.api.TLAbsInputUser;
import io.objects.tl.api.messages.TLBotResults;
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
public class TLRequestMessagesGetInlineBotResults extends TLMethod<TLBotResults> {
    public static final int CONSTRUCTOR_ID = 0x514e999d;

    protected int flags;

    protected TLAbsInputUser bot;

    protected TLAbsInputPeer peer;

    protected TLAbsInputGeoPoint geoPoint;

    protected String query;

    protected String offset;

    private final String _constructor = "messages.getInlineBotResults#514e999d";

    public TLRequestMessagesGetInlineBotResults() {
    }

    public TLRequestMessagesGetInlineBotResults(TLAbsInputUser bot, TLAbsInputPeer peer,
            TLAbsInputGeoPoint geoPoint, String query, String offset) {
        this.bot = bot;
        this.peer = peer;
        this.geoPoint = geoPoint;
        this.query = query;
        this.offset = offset;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLBotResults deserializeResponse(InputStream stream, TLContext context) throws
            IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLBotResults)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLBotResults) response;
    }

    private void computeFlags() {
        flags = 0;
        flags = geoPoint != null ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(bot, stream);
        writeTLObject(peer, stream);
        if ((flags & 1) != 0) {
            if (geoPoint == null) throwNullFieldException("geoPoint", flags);
            writeTLObject(geoPoint, stream);
        }
        writeString(query, stream);
        writeString(offset, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        bot = readTLObject(stream, context, TLAbsInputUser.class, -1);
        peer = readTLObject(stream, context, TLAbsInputPeer.class, -1);
        geoPoint = (flags & 1) != 0 ? readTLObject(stream, context, TLAbsInputGeoPoint.class, -1) : null;
        query = readTLString(stream);
        offset = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += bot.computeSerializedSize();
        size += peer.computeSerializedSize();
        if ((flags & 1) != 0) {
            if (geoPoint == null) throwNullFieldException("geoPoint", flags);
            size += geoPoint.computeSerializedSize();
        }
        size += computeTLStringSerializedSize(query);
        size += computeTLStringSerializedSize(offset);
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

    public TLAbsInputUser getBot() {
        return bot;
    }

    public void setBot(TLAbsInputUser bot) {
        this.bot = bot;
    }

    public TLAbsInputPeer getPeer() {
        return peer;
    }

    public void setPeer(TLAbsInputPeer peer) {
        this.peer = peer;
    }

    public TLAbsInputGeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(TLAbsInputGeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }
}