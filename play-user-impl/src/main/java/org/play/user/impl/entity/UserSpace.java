package org.play.user.impl.entity;

import java.util.Date;

import org.play.user.impl.base.BaseEntity;





public class UserSpace extends BaseEntity{

	
	private String id;
	
	private String videoId;
	
	private String userId;
	
	private Date createAt;

	private Integer spaceType;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVideoId() {
		return videoId;
	}
	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Integer getSpaceType() {
		return spaceType;
	}
	public void setSpaceType(Integer spaceType) {
		this.spaceType = spaceType;
	}

	
}
