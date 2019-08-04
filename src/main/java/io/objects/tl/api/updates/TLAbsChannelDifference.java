package io.objects.tl.api.updates;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.core.TLObject;
import java.lang.Integer;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLChannelDifference}: updates.channelDifference#2064674e</li>
 * <li>{@link TLChannelDifferenceEmpty}: updates.channelDifferenceEmpty#3e11affb</li>
 * <li>{@link TLChannelDifferenceTooLong}: updates.channelDifferenceTooLong#6a9d7b35</li>
 * </ul>
 *
 * This class is generated by Mono's TL class generator
 */
public abstract class TLAbsChannelDifference extends TLObject {
    protected int flags;

    protected boolean _final;

    protected int pts;

    protected Integer timeout;

    public TLAbsChannelDifference() {
    }

    public boolean getFinal() {
        return _final;
    }

    public void setFinal(boolean _final) {
        this._final = _final;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}