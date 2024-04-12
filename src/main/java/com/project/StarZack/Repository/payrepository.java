package com.project.StarZack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.StarZack.Entity.Payment;

public interface payrepository extends JpaRepository<Payment,String>{

}
