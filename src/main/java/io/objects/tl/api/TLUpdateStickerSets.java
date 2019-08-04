package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLUpdateStickerSets extends TLAbsUpdate {
    public static final int CONSTRUCTOR_ID = 0x43ae3dec;

    private final String _constructor = "updateStickerSets#43ae3dec";

    public TLUpdateStickerSets() {
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