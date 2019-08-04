package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLInputReportReasonViolence extends TLAbsReportReason {
    public static final int CONSTRUCTOR_ID = 0x1e22c78d;

    private final String _constructor = "inputReportReasonViolence#1e22c78d";

    public TLInputReportReasonViolence() {
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