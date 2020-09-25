package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.User;
import com.spring.boot.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}
	@Override
	public List<User> getUser() {
		return userRepository.findAll();
	}
	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}
	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get();
	}
	@Override
	public boolean existsUserId(Long id) {
		return userRepository.existsById(id);
	}
	@Override
	public boolean existsEmail(String email) {
		return userRepository.existsByEmail(email);	
	}
}
