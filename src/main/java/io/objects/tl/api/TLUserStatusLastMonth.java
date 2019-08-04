package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLUserStatusLastMonth extends TLAbsUserStatus {
    public static final int CONSTRUCTOR_ID = 0x77ebc742;

    private final String _constructor = "userStatusLastMonth#77ebc742";

    public TLUserStatusLastMonth() {
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