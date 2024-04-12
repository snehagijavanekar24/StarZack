package com.project.StarZack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.StarZack.Entity.CommunityForum;

public interface Communityrepository extends JpaRepository<CommunityForum,String>{

}
