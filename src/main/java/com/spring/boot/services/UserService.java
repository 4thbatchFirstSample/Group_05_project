package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.User;

public interface UserService {
	public void addUser(User user);
	public List<User> getUser();
	public void deleteUser(Long id);
	public void updateUser(User user);
	public User getUserById(Long id);
	public boolean existsUserId(Long id);
	public boolean existsEmail(String email);
}
