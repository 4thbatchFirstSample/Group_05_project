package com.spring.boot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.Defects;

@Repository
public interface DefectsRepository extends JpaRepository<Defects, Long>{
	public List<Defects> findBySubModuleId(Long id);
	public List<Defects> findByUserId(Long id);
	public boolean existsBySubModuleId(Long id);
	public boolean existsByUserId(Long id);

}
