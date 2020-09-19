package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
