package com.spring.boot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.Module;


@Repository
public interface ModuleRepository extends JpaRepository<Module, Long> {
	public List<Module> findByProjectId(Long projectId);
	public boolean existsByProjectId(Long id);
}
