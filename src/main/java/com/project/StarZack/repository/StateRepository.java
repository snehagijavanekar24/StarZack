package com.project.StarZack.repository;

import java.util.List;

import com.project.StarZack.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Long>{
	
	List<State> findByCountryCode(@Param("code") String code);
}
