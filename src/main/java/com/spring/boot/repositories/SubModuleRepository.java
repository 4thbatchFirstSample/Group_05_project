package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.SubModule;

@Repository
public interface SubModuleRepository extends JpaRepository<SubModule, Long>  {

}
