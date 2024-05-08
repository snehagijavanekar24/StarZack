package com.project.StarZack.Service;

import java.util.List;

import com.project.StarZack.entity.Admin;


public interface AdminService {
	

	public String CreateAdminDetails(Admin admin);
	public String updateAdminDetails(Admin admin);
	public String deleteAdminDetails(String AdminId);
	public Admin getAdminDetails(String AdminId);
	public List<Admin> getAllAdmins();


}
