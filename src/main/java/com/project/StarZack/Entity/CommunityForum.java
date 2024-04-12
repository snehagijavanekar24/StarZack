package com.project.StarZack.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="community_info")
public class CommunityForum {
	
	@Id
	private String DiscussionId;
	private String TopicName;
	private String GroupNo;
	private String NumOfpeople;
	private String time;
	
	public CommunityForum() {
		
	}

	public CommunityForum(String discussionId, String topicName, String groupNo, String numOfpeople, String time) {
		
		DiscussionId = discussionId;
		TopicName = topicName;
		GroupNo = groupNo;
		NumOfpeople = numOfpeople;
		this.time = time;
	}

	public String getDiscussionId() {
		return DiscussionId;
	}

	public void setDiscussionId(String discussionId) {
		DiscussionId = discussionId;
	}

	public String getTopicName() {
		return TopicName;
	}

	public void setTopicName(String topicName) {
		TopicName = topicName;
	}

	public String getGroupNo() {
		return GroupNo;
	}

	public void setGroupNo(String groupNo) {
		GroupNo = groupNo;
	}

	public String getNumOfpeople() {
		return NumOfpeople;
	}

	public void setNumOfpeople(String numOfpeople) {
		NumOfpeople = numOfpeople;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	
}
