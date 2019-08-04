package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
import io.objects.tl.core.TLBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLEncryptedMessage extends TLAbsEncryptedMessage {
    public static final int CONSTRUCTOR_ID = 0xed18c118;

    protected TLAbsEncryptedFile file;

    private final String _constructor = "encryptedMessage#ed18c118";

    public TLEncryptedMessage() {
    }

    public TLEncryptedMessage(long randomId, int chatId, int date, TLBytes bytes,
            TLAbsEncryptedFile file) {
        this.randomId = randomId;
        this.chatId = chatId;
        this.date = date;
        this.bytes = bytes;
        this.file = file;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeLong(randomId, stream);
        writeInt(chatId, stream);
        writeInt(date, stream);
        writeTLBytes(bytes, stream);
        writeTLObject(file, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        randomId = readLong(stream);
        chatId = readInt(stream);
        date = readInt(stream);
        bytes = readTLBytes(stream, context);
        file = readTLObject(stream, context, TLAbsEncryptedFile.class, -1);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT64;
        size += SIZE_INT32;
        size += SIZE_INT32;
        size += computeTLBytesSerializedSize(bytes);
        size += file.computeSerializedSize();
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

    public long getRandomId() {
        return randomId;
    }

    public void setRandomId(long randomId) {
        this.randomId = randomId;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public TLBytes getBytes() {
        return bytes;
    }

    public void setBytes(TLBytes bytes) {
        this.bytes = bytes;
    }

    public TLAbsEncryptedFile getFile() {
        return file;
    }

    public void setFile(TLAbsEncryptedFile file) {
        this.file = file;
    }
}