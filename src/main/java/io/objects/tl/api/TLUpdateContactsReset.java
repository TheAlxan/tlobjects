package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLUpdateContactsReset extends TLAbsUpdate {
    public static final int CONSTRUCTOR_ID = 0x7084a7be;

    private final String _constructor = "updateContactsReset#7084a7be";

    public TLUpdateContactsReset() {
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
