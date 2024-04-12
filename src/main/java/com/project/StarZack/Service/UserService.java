package com.project.StarZack.Service;

import java.util.List;

import com.project.StarZack.Entity.User;

public interface UserService {
	
	public String CreateUserDetails(User  user);
	public String updateUserDetails(User user);
	public String deleteUserDetails(String UserId);
	public User getUserDetails(String UserId);
	public List<User> getAllUsers();

}
