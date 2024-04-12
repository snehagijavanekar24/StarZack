package com.project.StarZack.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.StarZack.Entity.Admin;
import com.project.StarZack.Service.AdminService;


@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	 AdminService adminService;
	 
		public AdminController(AdminService adminService) {
		
		this.adminService = adminService;
	}

		@GetMapping("{AdminId}")
	    public Admin getAdminDetails(@PathVariable("AdminId") String AdminId){
	        return adminService.getAdminDetails(AdminId);
	    }

	    @GetMapping()
	    public List <Admin> getAllAdminDetails(){
	        return adminService.getAllAdmins();
	    }

	    @PostMapping
	    public String createAdminDetails(@RequestBody Admin admin){
	        adminService.CreateAdminDetails(admin);
	        return "Admin Created Successfully";
	    }

	    @PutMapping
	    public String updateAdminDetails(@RequestBody Admin admin){
	        adminService.updateAdminDetails(admin);
	        return "Admin Updated Successully";
	    }

	    @DeleteMapping("{AdminId}")
	    public String deleteAdminDetails(@PathVariable("AdminId")String AdminId){
	        adminService.deleteAdminDetails(AdminId);
	        return "Admin Deleted Successfully";
	    }



}
