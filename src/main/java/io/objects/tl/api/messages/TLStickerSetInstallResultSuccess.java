package io.objects.tl.api.messages;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLStickerSetInstallResultSuccess extends TLAbsStickerSetInstallResult {
    public static final int CONSTRUCTOR_ID = 0x38641628;

    private final String _constructor = "messages.stickerSetInstallResultSuccess#38641628";

    public TLStickerSetInstallResultSuccess() {
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