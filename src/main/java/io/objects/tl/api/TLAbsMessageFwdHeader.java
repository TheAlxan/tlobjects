package io.objects.tl.api;

import io.objects.tl.core.TLObject;

/**
 * This class is generated by Mono's TL class generator
 */
public abstract class TLAbsMessageFwdHeader extends TLObject {

    abstract public Integer getFromId();

    abstract public void setFromId(Integer fromId);

    abstract public int getDate();

    abstract public void setDate(int date);

    abstract public Integer getChannelId();

    abstract public void setChannelId(Integer channelId);

    abstract public Integer getChannelPost();

    abstract public void setChannelPost(Integer channelPost);

    abstract public String getPostAuthor();

    abstract public void setPostAuthor(String postAuthor);

    abstract public TLAbsPeer getSavedFromPeer();

    abstract public void setSavedFromPeer(TLAbsPeer savedFromPeer);

    abstract public Integer getSavedFromMsgId();

    abstract public void setSavedFromMsgId(Integer savedFromMsgId);
}