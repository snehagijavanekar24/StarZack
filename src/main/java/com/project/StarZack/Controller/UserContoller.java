package com.project.StarZack.Controller;

import java.util.List;


import com.project.StarZack.entity.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.StarZack.Service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/User")
public class UserContoller {
	 UserService userService;
	 
	   public UserContoller(UserService userService) {
		
		this.userService = userService;
	}

		

		@GetMapping("{UserId}")
	    public User getUserDetails(@PathVariable("UserId") String userId){
	        return userService.getUserDetails(userId);
	    }

	    @GetMapping()
	    public List <User> getAllUserDetails(){
	        return userService.getAllUsers();
	    }

	    @PostMapping
	    public String createUserDetails(@Valid @RequestBody User user){
	        userService.CreateUserDetails(user);
	        return "User Created Successfully";
	    }

	    @PutMapping
	    public String updateUserDetails(@Valid @RequestBody User user){
	        userService.updateUserDetails(user);
	        return "User Updated Successully";
	    }

	    @DeleteMapping("{UserId}")
	    public String deleteUserDetails(@PathVariable("UserId") String UserId){
	        userService.deleteUserDetails(UserId);
	        return "User Deleted Successfully";
	    }



}
