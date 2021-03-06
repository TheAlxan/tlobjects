package io.objects.tl.api.monobot;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import io.objects.tl.api.TLAbsPhoto;
import io.objects.tl.api.TLAbsUser;
import io.objects.tl.core.TLObject;
import io.objects.tl.core.TLVector;
import java.lang.String;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLBotPhotos}: monobot.botPhotos#8e16c233</li>
 * <li>{@link TLBotPhotosSlice}: monobot.botPhotosSlice#15043fc6</li>
 * </ul>
 *
 * This class is generated by Mono's TL class generator
 */
public abstract class TLAbsBotPhotos extends TLObject {
    protected TLVector<TLAbsPhoto> photos;

    protected TLVector<TLAbsUser> users;

    protected long requestId;

    protected int responseCode;

    protected String error;

    public TLAbsBotPhotos() {
    }

    public TLVector<TLAbsPhoto> getPhotos() {
        return photos;
    }

    public void setPhotos(TLVector<TLAbsPhoto> photos) {
        this.photos = photos;
    }

    public TLVector<TLAbsUser> getUsers() {
        return users;
    }

    public void setUsers(TLVector<TLAbsUser> users) {
        this.users = users;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
