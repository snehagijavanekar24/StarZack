package com.project.StarZack.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.StarZack.Entity.User;
import com.project.StarZack.Repository.Userrepository;
import com.project.StarZack.Service.UserService;

@Service
public class UserServiceimpl implements UserService{
	
	Userrepository userrepo;
	
	

	public UserServiceimpl(Userrepository userrepo) {
		
		this.userrepo = userrepo;
	}

	@Override
	public String CreateUserDetails(User user) {
		userrepo.save(user);
		return "Success";
	}

	@Override
	public String updateUserDetails(User user) {
		userrepo.save(user);
		return "Success";
	}

	@Override
	public String deleteUserDetails(String UserId) {
		userrepo.deleteById(UserId);
		return "Success";
	}

	@Override
	public User getUserDetails(String UserId) {
		return userrepo.findById(UserId).get();
	}

	@Override
	public List<User> getAllUsers() {
		return userrepo.findAll();
	}
}


