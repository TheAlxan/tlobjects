package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLPhoneCallDiscardReasonDisconnect extends TLAbsPhoneCallDiscardReason {
    public static final int CONSTRUCTOR_ID = 0xe095c1a0;

    private final String _constructor = "phoneCallDiscardReasonDisconnect#e095c1a0";

    public TLPhoneCallDiscardReasonDisconnect() {
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