package com.project.StarZack.Service.Impl;

import java.util.List;

import com.project.StarZack.entity.CommunityForum;
import org.springframework.stereotype.Service;


import com.project.StarZack.repository.Communityrepository;
import com.project.StarZack.Service.CommunityService;

@Service
public class CommunityServiceimpl implements CommunityService {
	Communityrepository communityrepo;
	

	

	public CommunityServiceimpl(Communityrepository communityrepo) {
		
		this.communityrepo = communityrepo;
	}

	@Override
	public String CreateCommunityDetails(CommunityForum community) {
		communityrepo.save(community);
		return "Success";
	}

	@Override
	public String updateCommunityDetails(CommunityForum community) {
		communityrepo.save(community);
		return "Success";
	}

	@Override
	public String deleteCommunityDetails(String DiscussionId) {
		communityrepo.deleteById(DiscussionId);
		return "Success";
	}

	@Override
	public CommunityForum getCommunityDetails(String DiscussionId) {
		return communityrepo.findById(DiscussionId).get();
	}

	@Override
	public List<CommunityForum> getAllCommunityForumDetails() {
		return communityrepo.findAll();
	}

	

}
