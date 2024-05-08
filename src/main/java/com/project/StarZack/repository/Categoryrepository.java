package com.project.StarZack.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.StarZack.entity.Category;

public interface Categoryrepository  extends JpaRepository<Category,String>{

}
