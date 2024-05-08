package com.project.StarZack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="support_info")
public class Chatsupport {
	
	@Id
	private String queryId;
	private String querytype;
	private String UserId;
	private String UserName;
	
	public Chatsupport() {
		
	}

	public Chatsupport(String queryId, String querytype, String userId, String userName) {
		this.queryId = queryId;
		this.querytype = querytype;
		UserId = userId;
		UserName = userName;
	}

	public String getQueryId() {
		return queryId;
	}

	public String getQuerytype() {
		return querytype;
	}

	public String getUserId() {
		return UserId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	public void setQuerytype(String querytype) {
		this.querytype = querytype;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	
	
	
	
}
