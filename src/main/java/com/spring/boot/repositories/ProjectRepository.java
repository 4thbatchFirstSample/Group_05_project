package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
