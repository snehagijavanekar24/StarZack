package com.project.StarZack.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.StarZack.entity.Admin;
import com.project.StarZack.repository.Adminrepository;
import com.project.StarZack.Service.AdminService;

@Service
public class AdminServiceimpl implements AdminService{
	Adminrepository adminrepo;
	

	public AdminServiceimpl(Adminrepository adminrepo) {
		
		this.adminrepo = adminrepo;
	}

	@Override
	public String CreateAdminDetails(Admin admin) {
		adminrepo.save(admin);
		return "Success";
	}

	@Override
	public String updateAdminDetails(Admin admin) {
		adminrepo.save(admin);
		return "Success";
	}

	@Override
	public String deleteAdminDetails(String AdminId) {
		adminrepo.deleteById(AdminId);
		return "Success";
	}

	@Override
	public Admin getAdminDetails(String AdminId) {
		return adminrepo.findById(AdminId).get();
	}

	@Override
	public List<Admin> getAllAdmins() {
		return adminrepo.findAll();
	}

}
