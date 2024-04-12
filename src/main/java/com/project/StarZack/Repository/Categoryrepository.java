package com.project.StarZack.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.StarZack.Entity.Category;

public interface Categoryrepository  extends JpaRepository<Category,String>{

}
