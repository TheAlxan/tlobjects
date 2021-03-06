package io.objects.tl.api.help;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLProxyDataEmpty}: help.proxyDataEmpty#e09e1fb8</li>
 * <li>{@link TLProxyDataPromo}: help.proxyDataPromo#2bf7ee23</li>
 * </ul>
 *
 * This class is generated by Mono's TL class generator
 */
public abstract class TLAbsProxyData extends TLObject {
    protected int expires;

    public TLAbsProxyData() {
    }

    public int getExpires() {
        return expires;
    }

    public void setExpires(int expires) {
        this.expires = expires;
    }

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();

    public TLProxyDataPromo getAsProxyDataPromo() {
        return null;
    }
}
