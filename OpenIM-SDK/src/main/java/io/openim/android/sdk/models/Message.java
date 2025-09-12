package io.openim.android.sdk.models;

import java.util.Map;
import java.util.Objects;

/**
 * Represents a chat message with optional media or custom payloads.
 */
public class Message {
    private String clientMsgID;
    private String serverMsgID;
    private long createTime;
    private long sendTime;
    private int sessionType;
    private String sendID;
    private String recvID;
    private int msgFrom;
    private int contentType;
    private int platformID;
    private String senderNickname;
    private String senderFaceUrl;
    private String groupID;
//    private String content;
    private int seq;
    private boolean isRead;
    private int status;

    private boolean isReact;

    private boolean isExternalExtensions;
    private OfflinePushInfo offlinePush;
    private String attachedInfo;
    private Object ext;
    private Object ex;
    private Object localEx;
    private PictureElem pictureElem;
    private SoundElem soundElem;
    private VideoElem videoElem;
    private FileElem fileElem;
    private AtTextElem atTextElem;
    private LocationElem locationElem;
    private CustomElem customElem;
    private QuoteElem quoteElem;
    private MergeElem mergeElem;
    private NotificationElem notificationElem;
    private FaceElem faceElem;
    private AttachedInfoElem attachedInfoElem;

    private TextElem textElem;

    /// 
    private CardElem cardElem;

    ///
    private AdvancedTextElem advancedTextElem;

    ///
    private TypingElem typingElem;

    public String getClientMsgID() {
        return clientMsgID;
    }

    public void setClientMsgID(String clientMsgID) {
        this.clientMsgID = clientMsgID;
    }

    public String getServerMsgID() {
        return serverMsgID;
    }

    public void setServerMsgID(String serverMsgID) {
        this.serverMsgID = serverMsgID;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getSendTime() {
        return sendTime;
    }

    public void setSendTime(long sendTime) {
        this.sendTime = sendTime;
    }

    public int getSessionType() {
        return sessionType;
    }

    public void setSessionType(int sessionType) {
        this.sessionType = sessionType;
    }

    public String getSendID() {
        return sendID;
    }

    public void setSendID(String sendID) {
        this.sendID = sendID;
    }

    public String getRecvID() {
        return recvID;
    }

    public void setRecvID(String recvID) {
        this.recvID = recvID;
    }

    public int getMsgFrom() {
        return msgFrom;
    }

    public void setMsgFrom(int msgFrom) {
        this.msgFrom = msgFrom;
    }

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    public int getPlatformID() {
        return platformID;
    }

    public void setPlatformID(int platformID) {
        this.platformID = platformID;
    }

    public String getSenderNickname() {
        return senderNickname;
    }

    public void setSenderNickname(String senderNickname) {
        this.senderNickname = senderNickname;
    }

    public String getSenderFaceUrl() {
        return senderFaceUrl;
    }

    public void setSenderFaceUrl(String senderFaceUrl) {
        this.senderFaceUrl = senderFaceUrl;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isReact() {
        return isReact;
    }

    public void setReact(boolean react) {
        isReact = react;
    }

    public boolean isExternalExtensions() {
        return isExternalExtensions;
    }

    public void setExternalExtensions(boolean externalExtensions) {
        isExternalExtensions = externalExtensions;
    }

    public OfflinePushInfo getOfflinePush() {
        return offlinePush;
    }

    public void setOfflinePush(OfflinePushInfo offlinePush) {
        this.offlinePush = offlinePush;
    }

    public String getAttachedInfo() {
        return attachedInfo;
    }

    public void setAttachedInfo(String attachedInfo) {
        this.attachedInfo = attachedInfo;
    }

    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }

    public Object getEx() {
        return ex;
    }

    public void setEx(Object ex) {
        this.ex = ex;
    }

    public Object getLocalEx() {
        return localEx;
    }

    public void setLocalEx(Object localEx) {
        this.localEx = localEx;
    }

    public PictureElem getPictureElem() {
        return pictureElem;
    }

    public void setPictureElem(PictureElem pictureElem) {
        this.pictureElem = pictureElem;
    }

    public SoundElem getSoundElem() {
        return soundElem;
    }

    public void setSoundElem(SoundElem soundElem) {
        this.soundElem = soundElem;
    }

    public VideoElem getVideoElem() {
        return videoElem;
    }

    public void setVideoElem(VideoElem videoElem) {
        this.videoElem = videoElem;
    }

    public FileElem getFileElem() {
        return fileElem;
    }

    public void setFileElem(FileElem fileElem) {
        this.fileElem = fileElem;
    }

    public AtTextElem getAtTextElem() {
        return atTextElem;
    }

    public void setAtTextElem(AtTextElem atTextElem) {
        this.atTextElem = atTextElem;
    }

    public LocationElem getLocationElem() {
        return locationElem;
    }

    public void setLocationElem(LocationElem locationElem) {
        this.locationElem = locationElem;
    }

    public CustomElem getCustomElem() {
        return customElem;
    }

    public void setCustomElem(CustomElem customElem) {
        this.customElem = customElem;
    }

    public QuoteElem getQuoteElem() {
        return quoteElem;
    }

    public void setQuoteElem(QuoteElem quoteElem) {
        this.quoteElem = quoteElem;
    }

    public MergeElem getMergeElem() {
        return mergeElem;
    }

    public void setMergeElem(MergeElem mergeElem) {
        this.mergeElem = mergeElem;
    }

    public NotificationElem getNotificationElem() {
        return notificationElem;
    }

    public void setNotificationElem(NotificationElem notificationElem) {
        this.notificationElem = notificationElem;
    }

    public FaceElem getFaceElem() {
        return faceElem;
    }

    public void setFaceElem(FaceElem faceElem) {
        this.faceElem = faceElem;
    }

    public AttachedInfoElem getAttachedInfoElem() {
        return attachedInfoElem;
    }

    public void setAttachedInfoElem(AttachedInfoElem attachedInfoElem) {
        this.attachedInfoElem = attachedInfoElem;
    }

    public TextElem getTextElem() {
        return textElem;
    }

    public void setTextElem(TextElem textElem) {
        this.textElem = textElem;
    }

    public CardElem getCardElem() {
        return cardElem;
    }

    public void setCardElem(CardElem cardElem) {
        this.cardElem = cardElem;
    }

    public AdvancedTextElem getAdvancedTextElem() {
        return advancedTextElem;
    }

    public void setAdvancedTextElem(AdvancedTextElem advancedTextElem) {
        this.advancedTextElem = advancedTextElem;
    }

    public TypingElem getTypingElem() {
        return typingElem;
    }

    public void setTypingElem(TypingElem typingElem) {
        this.typingElem = typingElem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return Objects.equals(clientMsgID, message.clientMsgID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMsgID);
    }
}

