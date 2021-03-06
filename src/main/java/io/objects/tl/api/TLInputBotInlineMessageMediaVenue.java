package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLInputBotInlineMessageMediaVenue extends TLAbsInputBotInlineMessage {
    public static final int CONSTRUCTOR_ID = 0x417bbf11;

    protected TLAbsInputGeoPoint geoPoint;

    protected String title;

    protected String address;

    protected String provider;

    protected String venueId;

    protected String venueType;

    private final String _constructor = "inputBotInlineMessageMediaVenue#417bbf11";

    public TLInputBotInlineMessageMediaVenue() {
    }

    public TLInputBotInlineMessageMediaVenue(TLAbsInputGeoPoint geoPoint, String title,
            String address, String provider, String venueId, String venueType,
            TLAbsReplyMarkup replyMarkup) {
        this.geoPoint = geoPoint;
        this.title = title;
        this.address = address;
        this.provider = provider;
        this.venueId = venueId;
        this.venueType = venueType;
        this.replyMarkup = replyMarkup;
    }

    private void computeFlags() {
        flags = 0;
        flags = replyMarkup != null ? (flags | 4) : (flags & ~4);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(geoPoint, stream);
        writeString(title, stream);
        writeString(address, stream);
        writeString(provider, stream);
        writeString(venueId, stream);
        writeString(venueType, stream);
        if ((flags & 4) != 0) {
            if (replyMarkup == null) throwNullFieldException("replyMarkup", flags);
            writeTLObject(replyMarkup, stream);
        }
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        geoPoint = readTLObject(stream, context, TLAbsInputGeoPoint.class, -1);
        title = readTLString(stream);
        address = readTLString(stream);
        provider = readTLString(stream);
        venueId = readTLString(stream);
        venueType = readTLString(stream);
        replyMarkup = (flags & 4) != 0 ? readTLObject(stream, context, TLAbsReplyMarkup.class, -1) : null;
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += geoPoint.computeSerializedSize();
        size += computeTLStringSerializedSize(title);
        size += computeTLStringSerializedSize(address);
        size += computeTLStringSerializedSize(provider);
        size += computeTLStringSerializedSize(venueId);
        size += computeTLStringSerializedSize(venueType);
        if ((flags & 4) != 0) {
            if (replyMarkup == null) throwNullFieldException("replyMarkup", flags);
            size += replyMarkup.computeSerializedSize();
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

    public TLAbsInputGeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(TLAbsInputGeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public String getVenueType() {
        return venueType;
    }

    public void setVenueType(String venueType) {
        this.venueType = venueType;
    }

    public TLAbsReplyMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public void setReplyMarkup(TLAbsReplyMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
    }
}
