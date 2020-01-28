package io.objects.tl.api;

import io.objects.tl.TLContext;
import io.objects.tl.api.contacts.TLLink;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLUserFullVtd extends TLUserFull {
    public static final int CONSTRUCTOR_ID = 0x8ea4a881;

    protected int flags;

    protected boolean blocked;

    protected boolean phoneCallsAvailable;

    protected boolean phoneCallsPrivate;

    protected boolean canPinMessages;

    protected TLAbsUser user;

    protected String about;

    protected TLLink link;

    protected TLAbsPhoto profilePhoto;

    protected TLPeerNotifySettings notifySettings;

    protected TLBotInfo botInfo;

    protected int pinnedMessageId;

    protected int commonChatsCount;

    private final String _constructor = "userFull#8ea4a881";

    public TLUserFullVtd() {
    }

    public TLUserFullVtd(boolean blocked, boolean phoneCallsAvailable, boolean phoneCallsPrivate,
                         boolean canPinMessages, TLAbsUser user, String about, TLLink link, TLAbsPhoto profilePhoto,
                         TLPeerNotifySettings notifySettings, TLBotInfo botInfo, int pinnedMessageId, int commonChatsCount) {
        this.blocked = blocked;
        this.phoneCallsAvailable = phoneCallsAvailable;
        this.phoneCallsPrivate = phoneCallsPrivate;
        this.canPinMessages = canPinMessages;
        this.user = user;
        this.about = about;
        this.link = link;
        this.profilePhoto = profilePhoto;
        this.notifySettings = notifySettings;
        this.botInfo = botInfo;
        this.pinnedMessageId = pinnedMessageId;
        this.commonChatsCount = commonChatsCount;
    }

    private void computeFlags() {
        flags = 0;
        flags = blocked ? (flags | 1) : (flags & ~1);
        flags = phoneCallsAvailable ? (flags | 16) : (flags & ~16);
        flags = phoneCallsPrivate ? (flags | 32) : (flags & ~32);
        flags = canPinMessages ? (flags | 64) : (flags & ~64);
        flags = canPinMessages ? (flags | 128) : (flags & ~128);
        flags = about != null ? (flags | 2) : (flags & ~2);
        flags = profilePhoto != null ? (flags | 4) : (flags & ~4);
        flags = botInfo != null ? (flags | 8) : (flags & ~8);
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        computeFlags();

        writeInt(flags, stream);
        writeTLObject(user, stream);
        if ((flags & 2) != 0) {
            if (about == null) throwNullFieldException("about", flags);
            writeString(about, stream);
        }
        writeTLObject(link, stream);
        if ((flags & 4) != 0) {
            if (profilePhoto == null) throwNullFieldException("profilePhoto", flags);
            writeTLObject(profilePhoto, stream);
        }
        writeTLObject(notifySettings, stream);
        if ((flags & 8) != 0) {
            if (botInfo == null) throwNullFieldException("botInfo", flags);
            writeTLObject(botInfo, stream);
        }
        if ((flags & 64) != 0) {
            writeInt(pinnedMessageId, stream);
        }
        writeInt(commonChatsCount, stream);
    }

    @Override
    @SuppressWarnings({"unchecked", "SimplifiableConditionalExpression"})
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        flags = readInt(stream);
        blocked = (flags & 1) != 0;
        phoneCallsAvailable = (flags & 16) != 0;
        phoneCallsPrivate = (flags & 32) != 0;
        canPinMessages = (flags & 128) != 0;
        user = readTLObject(stream, context, TLAbsUser.class, -1);
        about = (flags & 2) != 0 ? readTLString(stream) : null;
        link = readTLObject(stream, context, TLLink.class, TLLink.CONSTRUCTOR_ID);
        profilePhoto = (flags & 4) != 0 ? readTLObject(stream, context, TLAbsPhoto.class, -1) : null;
        notifySettings = readTLObject(stream, context, TLPeerNotifySettings.class, TLPeerNotifySettings.CONSTRUCTOR_ID);
        botInfo = (flags & 8) != 0 ? readTLObject(stream, context, TLBotInfo.class, TLBotInfo.CONSTRUCTOR_ID) : null;
        pinnedMessageId = (flags & 64) != 0 ? readInt(stream) : 0;
        commonChatsCount = readInt(stream);
    }

    @Override
    public int computeSerializedSize() {
        computeFlags();

        int size = SIZE_CONSTRUCTOR_ID;
        size += SIZE_INT32;
        size += user.computeSerializedSize();
        if ((flags & 2) != 0) {
            if (about == null) throwNullFieldException("about", flags);
            size += computeTLStringSerializedSize(about);
        }
        size += link.computeSerializedSize();
        if ((flags & 4) != 0) {
            if (profilePhoto == null) throwNullFieldException("profilePhoto", flags);
            size += profilePhoto.computeSerializedSize();
        }
        size += notifySettings.computeSerializedSize();
        if ((flags & 8) != 0) {
            if (botInfo == null) throwNullFieldException("botInfo", flags);
            size += botInfo.computeSerializedSize();
        }
        if ((flags & 64) != 0) {
            size += SIZE_INT32;
        }
        size += SIZE_INT32;
        return size;
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }

    public boolean getBlocked() {
        return blocked;
    }

    public boolean getPhoneCallsAvailable() {
        return phoneCallsAvailable;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isPhoneCallsAvailable() {
        return phoneCallsAvailable;
    }

    public void setPhoneCallsAvailable(boolean phoneCallsAvailable) {
        this.phoneCallsAvailable = phoneCallsAvailable;
    }

    public boolean isPhoneCallsPrivate() {
        return phoneCallsPrivate;
    }

    public boolean isCanPinMessages() {
        return canPinMessages;
    }

    public void setCanPinMessages(boolean canPinMessages) {
        this.canPinMessages = canPinMessages;
    }

    public int getPinnedMessageId() {
        return pinnedMessageId;
    }

    public void setPinnedMessageId(int pinnedMessageId) {
        this.pinnedMessageId = pinnedMessageId;
    }

    public boolean getPhoneCallsPrivate() {
        return phoneCallsPrivate;
    }

    public void setPhoneCallsPrivate(boolean phoneCallsPrivate) {
        this.phoneCallsPrivate = phoneCallsPrivate;
    }

    public TLAbsUser getUser() {
        return user;
    }

    public void setUser(TLAbsUser user) {
        this.user = user;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public TLLink getLink() {
        return link;
    }

    public void setLink(TLLink link) {
        this.link = link;
    }

    public TLAbsPhoto getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(TLAbsPhoto profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public TLPeerNotifySettings getNotifySettings() {
        return notifySettings;
    }

    public void setNotifySettings(TLPeerNotifySettings notifySettings) {
        this.notifySettings = notifySettings;
    }

    public TLBotInfo getBotInfo() {
        return botInfo;
    }

    public void setBotInfo(TLBotInfo botInfo) {
        this.botInfo = botInfo;
    }

    public int getCommonChatsCount() {
        return commonChatsCount;
    }

    public void setCommonChatsCount(int commonChatsCount) {
        this.commonChatsCount = commonChatsCount;
    }
}