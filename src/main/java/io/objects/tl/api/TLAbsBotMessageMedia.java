package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLBotMessageMediaContact}: botMessageMediaContact#c4ff5718</li>
 * <li>{@link TLBotMessageMediaDocument}: botMessageMediaDocument#9f3f70be</li>
 * <li>{@link TLBotMessageMediaEmpty}: botMessageMediaEmpty#3e2ea0d6</li>
 * <li>{@link TLBotMessageMediaGame}: botMessageMediaGame#fcc32029</li>
 * <li>{@link TLBotMessageMediaGeo}: botMessageMediaGeo#436e77eb</li>
 * <li>{@link TLBotMessageMediaGeoLive}: botMessageMediaGeoLive#7e7d2f55</li>
 * <li>{@link TLBotMessageMediaInvoice}: botMessageMediaInvoice#835f425e</li>
 * <li>{@link TLBotMessageMediaPhoto}: botMessageMediaPhoto#6553f100</li>
 * <li>{@link TLBotMessageMediaUnsupported}: botMessageMediaUnsupported#9f84f49e</li>
 * <li>{@link TLBotMessageMediaVenue}: botMessageMediaVenue#29b92700</li>
 * <li>{@link TLBotMessageMediaWebPage}: botMessageMediaWebPage#90044fa9</li>
 * </ul>
 *
 * This class is generated by Mono's TL class generator
 */
public abstract class TLAbsBotMessageMedia extends TLObject {
    protected long requestId;

    protected int botId;

    public TLAbsBotMessageMedia() {
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
    }
}
