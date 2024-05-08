package com.project.StarZack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.StarZack.entity.UpdateNews;

public interface Newsrepository extends JpaRepository<UpdateNews,String> {

}
