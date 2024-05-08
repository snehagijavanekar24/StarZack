package com.project.StarZack.Service;

import java.util.List;

import com.project.StarZack.entity.CommunityForum;


public interface CommunityService {
	public String CreateCommunityDetails(CommunityForum community);
	public String updateCommunityDetails(CommunityForum community);
	public String deleteCommunityDetails(String DiscussioId);
	public CommunityForum  getCommunityDetails(String DiscussionId);
	public List<CommunityForum> getAllCommunityForumDetails();
	
	
	
	

}
