package com.project.StarZack.repository;

import com.project.StarZack.entity.CommunityForum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Communityrepository extends JpaRepository<CommunityForum,String>{

}
