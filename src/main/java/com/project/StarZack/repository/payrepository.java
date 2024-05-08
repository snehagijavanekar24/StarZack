package com.project.StarZack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.StarZack.entity.Payment;

public interface payrepository extends JpaRepository<Payment,String>{

}
