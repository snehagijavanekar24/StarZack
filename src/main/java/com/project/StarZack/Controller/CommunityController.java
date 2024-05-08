package com.project.StarZack.Controller;

import java.util.List;

import com.project.StarZack.entity.CommunityForum;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.StarZack.Service.CommunityService;


@RestController
@RequestMapping("/CommunityForum")
public class CommunityController {
	
	CommunityService communityService;
	 
	public CommunityController(CommunityService communityService) {
		
		this.communityService = communityService;
	}

	@GetMapping("{DiscussionId}")
    public CommunityForum getCommunityDetails(@PathVariable("DiscussionId") String DiscussionId){
        return communityService.getCommunityDetails(DiscussionId);
    }

    @GetMapping()
    public List <CommunityForum> getAllCommunityDetails(){
        return communityService.getAllCommunityForumDetails();
    }

    @PostMapping
    public String createCommunityDetails(@RequestBody CommunityForum community){
        communityService.CreateCommunityDetails(community);
        return "Discussions Created Successfully";
    }

    @PutMapping
    public String updateCommunityDetails(@RequestBody CommunityForum community){
        communityService.updateCommunityDetails(community);
        return "Discussions Updated Successully";
    }

    @DeleteMapping("{DiscussionId}")
    public String deleteCommunityDetails(@PathVariable("DiscussionId")String DiscussionId){
        communityService.deleteCommunityDetails(DiscussionId);
        return "Group Deleted Successfully";
    }

}
