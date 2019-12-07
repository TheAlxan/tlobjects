package io.objects.tl.api;

import io.objects.tl.TLContext;
import io.objects.tl.core.TLBytes;
import io.objects.tl.core.TLVector;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLPhotoVtd extends TLPhoto {
    public static final int CONSTRUCTOR_ID = 0xd07504a5;

    protected int flags;

    protected boolean hasStickers;

    protected long accessHash;

    protected TLBytes fileReference;

    protected int date;

    protected TLVector<TLAbsPhotoSize> sizes;

    private final String _constructor = "photoVtd#d07504a5";

    public TLPhotoVtd() {
    }

    public TLPhotoVtd(boolean hasStickers, long id, long accessHash, TLBytes fileReference, int date,
                      TLVector<TLAbsPhotoSize> sizes) {
        this.hasStickers = hasStickers;
        this.id = id;
        this.accessHash = accessHash;
        this.fileReference = fileReference;
        this.date = date;
        this.sizes = sizes;
    }

    private void computeFlags() {
        flags = 0;
        flags = hasStickers ? (flags | 1) : (flags & ~1);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeLong(id, stream);
        writeLong(accessHash, stream);
        writeTLBytes(fileReference, stream);
        writeInt(date, stream);
        writeTLVector(sizes, stream);
        writeInt(2, stream); // FIXME:: its dc_id
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        hasStickers = (flags & 1) != 0;
        id = readLong(stream);
        accessHash = readLong(stream);
        fileReference = readTLBytes(stream, context);
        date = readInt(stream);
        sizes = readTLVector(stream, context);
        readInt(stream); // FIXME:: its dc_id
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += SIZE_INT64;
        size += SIZE_INT64;
        size += computeTLBytesSerializedSize(fileReference);
        size += SIZE_INT32;
        size += sizes.computeSerializedSize();
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

    public boolean getHasStickers() {
        return hasStickers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isHasStickers() {
        return hasStickers;
    }

    public void setHasStickers(boolean hasStickers) {
        this.hasStickers = hasStickers;
    }

    public long getAccessHash() {
        return accessHash;
    }

    public void setAccessHash(long accessHash) {
        this.accessHash = accessHash;
    }

    public TLBytes getFileReference() {
        return fileReference;
    }

    public void setFileReference(TLBytes fileReference) {
        this.fileReference = fileReference;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public TLVector<TLAbsPhotoSize> getSizes() {
        return sizes;
    }

    public void setSizes(TLVector<TLAbsPhotoSize> sizes) {
        this.sizes = sizes;
    }

}
