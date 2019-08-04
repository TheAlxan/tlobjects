package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLMessageActionHistoryClear extends TLAbsMessageAction {
    public static final int CONSTRUCTOR_ID = 0x9fbab604;

    private final String _constructor = "messageActionHistoryClear#9fbab604";

    public TLMessageActionHistoryClear() {
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }
}