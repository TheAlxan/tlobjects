package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputWebFileGeoPointLocation}: inputWebFileGeoPointLocation#9f2221c9</li>
 * <li>{@link TLInputWebFileLocation}: inputWebFileLocation#c239d686</li>
 * </ul>
 *
 * This class is generated by Mono's TL class generator
 */
public abstract class TLAbsInputWebFileLocation extends TLObject {
    protected long accessHash;

    public TLAbsInputWebFileLocation() {
    }

    public long getAccessHash() {
        return accessHash;
    }

    public void setAccessHash(long accessHash) {
        this.accessHash = accessHash;
    }
}