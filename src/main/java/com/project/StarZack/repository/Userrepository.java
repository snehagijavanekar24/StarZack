package com.project.StarZack.repository;

import com.project.StarZack.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User,String>{

}
