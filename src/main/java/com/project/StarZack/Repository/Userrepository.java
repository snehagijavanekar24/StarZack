package com.project.StarZack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.StarZack.Entity.User;

public interface Userrepository extends JpaRepository<User,String>{

}
