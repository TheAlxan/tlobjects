package io.objects.tl.api.request;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.api.TLAbsInputGeoPoint;
import io.objects.tl.api.TLAbsInputMedia;
import io.objects.tl.api.TLAbsMessageEntity;
import io.objects.tl.api.TLAbsReplyMarkup;
import io.objects.tl.api.TLInputBotInlineMessageID;
import io.objects.tl.core.TLBool;
import io.objects.tl.core.TLMethod;
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
public class TLRequestMessagesEditInlineBotMessage extends TLMethod<TLBool> {
    public static final int CONSTRUCTOR_ID = 0xadc3e828;

    protected int flags;

    protected boolean noWebpage;

    protected boolean stopGeoLive;

    protected TLInputBotInlineMessageID id;

    protected String message;

    protected TLAbsInputMedia media;

    protected TLAbsReplyMarkup replyMarkup;

    protected TLVector<TLAbsMessageEntity> entities;

    protected TLAbsInputGeoPoint geoPoint;

    private final String _constructor = "messages.editInlineBotMessage#adc3e828";

    public TLRequestMessagesEditInlineBotMessage() {
    }

    public TLRequestMessagesEditInlineBotMessage(boolean noWebpage, boolean stopGeoLive,
            TLInputBotInlineMessageID id, String message, TLAbsInputMedia media,
            TLAbsReplyMarkup replyMarkup, TLVector<TLAbsMessageEntity> entities,
            TLAbsInputGeoPoint geoPoint) {
        this.noWebpage = noWebpage;
        this.stopGeoLive = stopGeoLive;
        this.id = id;
        this.message = message;
        this.media = media;
        this.replyMarkup = replyMarkup;
        this.entities = entities;
        this.geoPoint = geoPoint;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLBool deserializeResponse(InputStream stream, TLContext context) throws IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLBool)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLBool) response;
    }

    private void computeFlags() {
        flags = 0;
        flags = noWebpage ? (flags | 2) : (flags & ~2);
        flags = stopGeoLive ? (flags | 4096) : (flags & ~4096);
        flags = message != null ? (flags | 2048) : (flags & ~2048);
        flags = media != null ? (flags | 16384) : (flags & ~16384);
        flags = replyMarkup != null ? (flags | 4) : (flags & ~4);
        flags = entities != null ? (flags | 8) : (flags & ~8);
        flags = geoPoint != null ? (flags | 8192) : (flags & ~8192);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(id, stream);
        if ((flags & 2048) != 0) {
            if (message == null) throwNullFieldException("message", flags);
            writeString(message, stream);
        }
        if ((flags & 16384) != 0) {
            if (media == null) throwNullFieldException("media", flags);
            writeTLObject(media, stream);
        }
        if ((flags & 4) != 0) {
            if (replyMarkup == null) throwNullFieldException("replyMarkup", flags);
            writeTLObject(replyMarkup, stream);
        }
        if ((flags & 8) != 0) {
            if (entities == null) throwNullFieldException("entities", flags);
            writeTLVector(entities, stream);
        }
        if ((flags & 8192) != 0) {
            if (geoPoint == null) throwNullFieldException("geoPoint", flags);
            writeTLObject(geoPoint, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        noWebpage = (flags & 2) != 0;
        stopGeoLive = (flags & 4096) != 0;
        id = readTLObject(stream, context, TLInputBotInlineMessageID.class, TLInputBotInlineMessageID.CONSTRUCTOR_ID);
        message = (flags & 2048) != 0 ? readTLString(stream) : null;
        media = (flags & 16384) != 0 ? readTLObject(stream, context, TLAbsInputMedia.class, -1) : null;
        replyMarkup = (flags & 4) != 0 ? readTLObject(stream, context, TLAbsReplyMarkup.class, -1) : null;
        entities = (flags & 8) != 0 ? readTLVector(stream, context) : null;
        geoPoint = (flags & 8192) != 0 ? readTLObject(stream, context, TLAbsInputGeoPoint.class, -1) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += id.computeSerializedSize();
        if ((flags & 2048) != 0) {
            if (message == null) throwNullFieldException("message", flags);
            size += computeTLStringSerializedSize(message);
        }
        if ((flags & 16384) != 0) {
            if (media == null) throwNullFieldException("media", flags);
            size += media.computeSerializedSize();
        }
        if ((flags & 4) != 0) {
            if (replyMarkup == null) throwNullFieldException("replyMarkup", flags);
            size += replyMarkup.computeSerializedSize();
        }
        if ((flags & 8) != 0) {
            if (entities == null) throwNullFieldException("entities", flags);
            size += entities.computeSerializedSize();
        }
        if ((flags & 8192) != 0) {
            if (geoPoint == null) throwNullFieldException("geoPoint", flags);
            size += geoPoint.computeSerializedSize();
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

    public boolean getNoWebpage() {
        return noWebpage;
    }

    public void setNoWebpage(boolean noWebpage) {
        this.noWebpage = noWebpage;
    }

    public boolean getStopGeoLive() {
        return stopGeoLive;
    }

    public void setStopGeoLive(boolean stopGeoLive) {
        this.stopGeoLive = stopGeoLive;
    }

    public TLInputBotInlineMessageID getId() {
        return id;
    }

    public void setId(TLInputBotInlineMessageID id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TLAbsInputMedia getMedia() {
        return media;
    }

    public void setMedia(TLAbsInputMedia media) {
        this.media = media;
    }

    public TLAbsReplyMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(TLAbsReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }

    public TLVector<TLAbsMessageEntity> getEntities() {
        return entities;
    }

    public void setEntities(TLVector<TLAbsMessageEntity> entities) {
        this.entities = entities;
    }

    public TLAbsInputGeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(TLAbsInputGeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }
}