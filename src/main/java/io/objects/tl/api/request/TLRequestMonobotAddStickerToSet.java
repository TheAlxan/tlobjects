package io.objects.tl.api.request;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.api.TLAbsInputStickerSet;
import io.objects.tl.api.TLInputStickerSetItem;
import io.objects.tl.api.monobot.TLBotStickerSet;
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
public class TLRequestMonobotAddStickerToSet extends TLMethod<TLBotStickerSet> {
    public static final int CONSTRUCTOR_ID = 0x816e9eeb;

    protected TLAbsInputStickerSet stickerset;

    protected TLInputStickerSetItem sticker;

    protected long requestId;

    protected int botId;

    private final String _constructor = "monobot.addStickerToSet#816e9eeb";

    public TLRequestMonobotAddStickerToSet() {
    }

    public TLRequestMonobotAddStickerToSet(TLAbsInputStickerSet stickerset,
            TLInputStickerSetItem sticker, long requestId, int botId) {
        this.stickerset = stickerset;
        this.sticker = sticker;
        this.requestId = requestId;
        this.botId = botId;
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public TLBotStickerSet deserializeResponse(InputStream stream, TLContext context) throws
            IOException {
        final TLObject response = readTLObject(stream, context);
        if (response == null) {
            throw new IOException("Unable to parse response");
        }
        if (!(response instanceof TLBotStickerSet)) {
            throw new IOException("Incorrect response type, expected " + getClass().getCanonicalName() + ", found " + response.getClass().getCanonicalName());
        }
        return (TLBotStickerSet) response;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(stickerset, stream);
        writeTLObject(sticker, stream);
        writeLong(requestId, stream);
        writeInt(botId, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        stickerset = readTLObject(stream, context, TLAbsInputStickerSet.class, -1);
        sticker = readTLObject(stream, context, TLInputStickerSetItem.class, TLInputStickerSetItem.CONSTRUCTOR_ID);
        requestId = readLong(stream);
        botId = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += stickerset.computeSerializedSize();
        size += sticker.computeSerializedSize();
        size += SIZE_INT64;
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

    public TLAbsInputStickerSet getStickerset() {
        return stickerset;
    }

    public void setStickerset(TLAbsInputStickerSet stickerset) {
        this.stickerset = stickerset;
    }

    public TLInputStickerSetItem getSticker() {
        return sticker;
    }

    public void setSticker(TLInputStickerSetItem sticker) {
        this.sticker = sticker;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }
}
