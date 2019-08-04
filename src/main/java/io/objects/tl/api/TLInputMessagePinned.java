package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLInputMessagePinned extends TLAbsInputMessage {
    public static final int CONSTRUCTOR_ID = 0x86872538;

    private final String _constructor = "inputMessagePinned#86872538";

    public TLInputMessagePinned() {
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