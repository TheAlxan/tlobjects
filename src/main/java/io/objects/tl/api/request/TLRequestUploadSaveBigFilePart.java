package io.objects.tl.api.request;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.core.TLBool;
import io.objects.tl.core.TLBytes;
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
public class TLRequestUploadSaveBigFilePart extends TLMethod<TLBool> {
    public static final int CONSTRUCTOR_ID = 0xde7b673d;

    protected long fileId;

    protected int filePart;

    protected int fileTotalParts;

    protected TLBytes bytes;

    private final String _constructor = "upload.saveBigFilePart#de7b673d";

    public TLRequestUploadSaveBigFilePart() {
    }

    public TLRequestUploadSaveBigFilePart(long fileId, int filePart, int fileTotalParts,
            TLBytes bytes) {
        this.fileId = fileId;
        this.filePart = filePart;
        this.fileTotalParts = fileTotalParts;
        this.bytes = bytes;
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

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(fileId, stream);
        writeInt(filePart, stream);
        writeInt(fileTotalParts, stream);
        writeTLBytes(bytes, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        fileId = readLong(stream);
        filePart = readInt(stream);
        fileTotalParts = readInt(stream);
        bytes = readTLBytes(stream, context);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += computeTLBytesSerializedSize(bytes);
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

    public long getFileId() {
        return fileId;
    }

    public void setFileId(long fileId) {
        this.fileId = fileId;
    }

    public int getFilePart() {
        return filePart;
    }

    public void setFilePart(int filePart) {
        this.filePart = filePart;
    }

    public int getFileTotalParts() {
        return fileTotalParts;
    }

    public void setFileTotalParts(int fileTotalParts) {
        this.fileTotalParts = fileTotalParts;
    }

    public TLBytes getBytes() {
        return bytes;
    }

    public void setBytes(TLBytes bytes) {
        this.bytes = bytes;
    }
}
