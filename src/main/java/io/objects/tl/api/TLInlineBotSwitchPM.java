package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.TLContext;
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
public class TLInlineBotSwitchPM extends TLObject {
    public static final int CONSTRUCTOR_ID = 0x3c20629f;

    protected String text;

    protected String startParam;

    private final String _constructor = "inlineBotSwitchPM#3c20629f";

    public TLInlineBotSwitchPM() {
    }

    public TLInlineBotSwitchPM(String text, String startParam) {
        this.text = text;
        this.startParam = startParam;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeString(text, stream);
        writeString(startParam, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        text = readTLString(stream);
        startParam = readTLString(stream);
    }

    @Override
    public int computeSerializedSize() {
        int size = SIZE_CONSTRUCTOR_ID;
        size += computeTLStringSerializedSize(text);
        size += computeTLStringSerializedSize(startParam);
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStartParam() {
        return startParam;
    }

    public void setStartParam(String startParam) {
        this.startParam = startParam;
    }
}
