package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
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
public class TLWallPaper extends TLAbsWallPaper {
    public static final int CONSTRUCTOR_ID = 0xccb03657;

    protected TLVector<TLAbsPhotoSize> sizes;

    private final String _constructor = "wallPaper#ccb03657";

    public TLWallPaper() {
    }

    public TLWallPaper(int id, String title, TLVector<TLAbsPhotoSize> sizes, int color) {
        this.id = id;
        this.title = title;
        this.sizes = sizes;
        this.color = color;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeInt(id, stream);
        writeString(title, stream);
        writeTLVector(sizes, stream);
        writeInt(color, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        id = readInt(stream);
        title = readTLString(stream);
        sizes = readTLVector(stream, context);
        color = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += computeTLStringSerializedSize(title);
        size += sizes.computeSerializedSize();
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TLVector<TLAbsPhotoSize> getSizes() {
        return sizes;
    }

    public void setSizes(TLVector<TLAbsPhotoSize> sizes) {
        this.sizes = sizes;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
