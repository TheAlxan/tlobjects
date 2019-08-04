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
public class TLUserProfilePhoto extends TLAbsUserProfilePhoto {
    public static final int CONSTRUCTOR_ID = 0xd559d8c8;

    protected long photoId;

    protected TLAbsFileLocation photoSmall;

    protected TLAbsFileLocation photoBig;

    private final String _constructor = "userProfilePhoto#d559d8c8";

    public TLUserProfilePhoto() {
    }

    public TLUserProfilePhoto(long photoId, TLAbsFileLocation photoSmall,
            TLAbsFileLocation photoBig) {
        this.photoId = photoId;
        this.photoSmall = photoSmall;
        this.photoBig = photoBig;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(photoId, stream);
        writeTLObject(photoSmall, stream);
        writeTLObject(photoBig, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        photoId = readLong(stream);
        photoSmall = readTLObject(stream, context, TLAbsFileLocation.class, -1);
        photoBig = readTLObject(stream, context, TLAbsFileLocation.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += photoSmall.computeSerializedSize();
        size += photoBig.computeSerializedSize();
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

    public long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(long photoId) {
        this.photoId = photoId;
    }

    public TLAbsFileLocation getPhotoSmall() {
        return photoSmall;
    }

    public void setPhotoSmall(TLAbsFileLocation photoSmall) {
        this.photoSmall = photoSmall;
    }

    public TLAbsFileLocation getPhotoBig() {
        return photoBig;
    }

    public void setPhotoBig(TLAbsFileLocation photoBig) {
        this.photoBig = photoBig;
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final boolean isNotEmpty() {
        return true;
    }

    @Override
    public final TLUserProfilePhoto getAsUserProfilePhoto() {
        return this;
    }
}