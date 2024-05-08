package com.project.StarZack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin_info")
public class Admin {
	
	@Id
	private String AdminId;
	private String AdminName;
	private String AdminEmail;
	private String Adminpassword;
	
	public Admin() {
		
	}

	public Admin(String adminId, String adminName, String adminEmail, String adminpassword) {
		
		AdminId = adminId;
		AdminName = adminName;
		AdminEmail = adminEmail;
		Adminpassword = adminpassword;
	}
	public String getAdminId() {
		return AdminId;
	}

	public void setAdminId(String adminId) {
		AdminId = adminId;
	}

	public String getAdminName() {
		return AdminName;
	}

	public void setAdminName(String adminName) {
		AdminName = adminName;
	}

	public String getAdminEmail() {
		return AdminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		AdminEmail = adminEmail;
	}

	public String getAdminpassword() {
		return Adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		Adminpassword = adminpassword;
	}

	

	
	
	
	

}
