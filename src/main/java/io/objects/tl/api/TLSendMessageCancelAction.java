package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLSendMessageCancelAction extends TLAbsSendMessageAction {
    public static final int CONSTRUCTOR_ID = 0xfd5ec8f5;

    private final String _constructor = "sendMessageCancelAction#fd5ec8f5";

    public TLSendMessageCancelAction() {
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