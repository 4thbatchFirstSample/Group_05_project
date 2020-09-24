package com.spring.boot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.SubModule;

@Repository
public interface SubModuleRepository extends JpaRepository<SubModule, Long> {
	public List<SubModule> findByModuleId(Long moduleId);
	public List<SubModule> findByUsersId(Long userId);
	public boolean existsByModuleId(Long id);
//	public boolean existsByUserId(Long id);
}