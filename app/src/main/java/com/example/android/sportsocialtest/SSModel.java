package com.example.android.sportsocialtest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Your name on 01-12-2018.
 */
public class SSModel {

    @SerializedName("feedid")
    @Expose
    private Integer feedid;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("eventid")
    @Expose
    private Integer eventid;
    @SerializedName("activity_id")
    @Expose
    private Integer activityId;
    @SerializedName("Activity_name")
    @Expose
    private String activityName;
    @SerializedName("IsPublic")
    @Expose
    private Integer isPublic;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("gameid")
    @Expose
    private Integer gameid;
    @SerializedName("gamename")
    @Expose
    private String gamename;
    @SerializedName("JoiningDate")
    @Expose
    private Object joiningDate;
    @SerializedName("InsertedDate")
    @Expose
    private Integer insertedDate;
    @SerializedName("EventText")
    @Expose
    private String eventText;
    @SerializedName("IsPromoting")
    @Expose
    private Integer isPromoting;
    @SerializedName("IsCommenting")
    @Expose
    private Integer isCommenting;
    @SerializedName("IsPlaying")
    @Expose
    private Integer isPlaying;
    @SerializedName("IsWatching")
    @Expose
    private Integer isWatching;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;
    @SerializedName("event_image")
    @Expose
    private String eventImage;
    @SerializedName("startdatetime")
    @Expose
    private Integer startdatetime;
    @SerializedName("gameinterest")
    @Expose
    private Integer gameinterest;
    @SerializedName("playmates")
    @Expose
    private Integer playmates;
    @SerializedName("CoverPic")
    @Expose
    private String coverPic;
    @SerializedName("Uniquename")
    @Expose
    private String uniquename;
    @SerializedName("dob")
    @Expose
    private Integer dob;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("UserStatus")
    @Expose
    private String userStatus;
    @SerializedName("PlaymateCount")
    @Expose
    private Integer playmateCount;
    @SerializedName("FanCount")
    @Expose
    private Integer fanCount;
    @SerializedName("CommentCount")
    @Expose
    private Integer commentCount;
    @SerializedName("PromoteCount")
    @Expose
    private Integer promoteCount;
    @SerializedName("JoineeCount")
    @Expose
    private Integer joineeCount;
    @SerializedName("WatchCount")
    @Expose
    private Integer watchCount;
    @SerializedName("feedtype")
    @Expose
    private Integer feedtype;
    @SerializedName("activityUserid")
    @Expose
    private Object activityUserid;
    @SerializedName("activityUserName")
    @Expose
    private Object activityUserName;
    @SerializedName("Activityid")
    @Expose
    private Object activityid;

    public Integer getFeedid() {
        return feedid;
    }

    public void setFeedid(Integer feedid) {
        this.feedid = feedid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getEventid() {
        return eventid;
    }

    public void setEventid(Integer eventid) {
        this.eventid = eventid;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGameid() {
        return gameid;
    }

    public void setGameid(Integer gameid) {
        this.gameid = gameid;
    }

    public String getGamename() {
        return gamename;
    }

    public void setGamename(String gamename) {
        this.gamename = gamename;
    }

    public Object getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Object joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Integer getInsertedDate() {
        return insertedDate;
    }

    public void setInsertedDate(Integer insertedDate) {
        this.insertedDate = insertedDate;
    }

    public String getEventText() {
        return eventText;
    }

    public void setEventText(String eventText) {
        this.eventText = eventText;
    }

    public Integer getIsPromoting() {
        return isPromoting;
    }

    public void setIsPromoting(Integer isPromoting) {
        this.isPromoting = isPromoting;
    }

    public Integer getIsCommenting() {
        return isCommenting;
    }

    public void setIsCommenting(Integer isCommenting) {
        this.isCommenting = isCommenting;
    }

    public Integer getIsPlaying() {
        return isPlaying;
    }

    public void setIsPlaying(Integer isPlaying) {
        this.isPlaying = isPlaying;
    }

    public Integer getIsWatching() {
        return isWatching;
    }

    public void setIsWatching(Integer isWatching) {
        this.isWatching = isWatching;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getEventImage() {
        return eventImage;
    }

    public void setEventImage(String eventImage) {
        this.eventImage = eventImage;
    }

    public Integer getStartdatetime() {
        return startdatetime;
    }

    public void setStartdatetime(Integer startdatetime) {
        this.startdatetime = startdatetime;
    }

    public Integer getGameinterest() {
        return gameinterest;
    }

    public void setGameinterest(Integer gameinterest) {
        this.gameinterest = gameinterest;
    }

    public Integer getPlaymates() {
        return playmates;
    }

    public void setPlaymates(Integer playmates) {
        this.playmates = playmates;
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    public String getUniquename() {
        return uniquename;
    }

    public void setUniquename(String uniquename) {
        this.uniquename = uniquename;
    }

    public Integer getDob() {
        return dob;
    }

    public void setDob(Integer dob) {
        this.dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getPlaymateCount() {
        return playmateCount;
    }

    public void setPlaymateCount(Integer playmateCount) {
        this.playmateCount = playmateCount;
    }

    public Integer getFanCount() {
        return fanCount;
    }

    public void setFanCount(Integer fanCount) {
        this.fanCount = fanCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getPromoteCount() {
        return promoteCount;
    }

    public void setPromoteCount(Integer promoteCount) {
        this.promoteCount = promoteCount;
    }

    public Integer getJoineeCount() {
        return joineeCount;
    }

    public void setJoineeCount(Integer joineeCount) {
        this.joineeCount = joineeCount;
    }

    public Integer getWatchCount() {
        return watchCount;
    }

    public void setWatchCount(Integer watchCount) {
        this.watchCount = watchCount;
    }

    public Integer getFeedtype() {
        return feedtype;
    }

    public void setFeedtype(Integer feedtype) {
        this.feedtype = feedtype;
    }

    public Object getActivityUserid() {
        return activityUserid;
    }

    public void setActivityUserid(Object activityUserid) {
        this.activityUserid = activityUserid;
    }

    public Object getActivityUserName() {
        return activityUserName;
    }

    public void setActivityUserName(Object activityUserName) {
        this.activityUserName = activityUserName;
    }

    public Object getActivityid() {
        return activityid;
    }

    public void setActivityid(Object activityid) {
        this.activityid = activityid;
    }


}
