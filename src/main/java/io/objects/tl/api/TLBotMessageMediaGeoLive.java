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
public class TLBotMessageMediaGeoLive extends TLAbsBotMessageMedia {
    public static final int CONSTRUCTOR_ID = 0x7e7d2f55;

    protected TLAbsGeoPoint geo;

    protected int period;

    private final String _constructor = "botMessageMediaGeoLive#7e7d2f55";

    public TLBotMessageMediaGeoLive() {
    }

    public TLBotMessageMediaGeoLive(TLAbsGeoPoint geo, int period, long requestId, int responseCode,
            String error) {
        this.geo = geo;
        this.period = period;
        this.requestId = requestId;
        this.responseCode = responseCode;
        this.error = error;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLObject(geo, stream);
        writeInt(period, stream);
        writeLong(requestId, stream);
        writeInt(responseCode, stream);
        writeString(error, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        geo = readTLObject(stream, context, TLAbsGeoPoint.class, -1);
        period = readInt(stream);
        requestId = readLong(stream);
        responseCode = readInt(stream);
        error = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += geo.computeSerializedSize();
        size += SIZE_INT32;
        size += SIZE_INT64;
        size += SIZE_INT32;
        size += computeTLStringSerializedSize(error);
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

    public TLAbsGeoPoint getGeo() {
        return geo;
    }

    public void setGeo(TLAbsGeoPoint geo) {
        this.geo = geo;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
