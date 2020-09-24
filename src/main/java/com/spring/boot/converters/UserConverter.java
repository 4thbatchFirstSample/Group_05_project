package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.UserDto;
import com.spring.boot.entities.User;

@Service
public class UserConverter {
	public static User userDtoToUser(UserDto userDto) {
		User user = new User();
		if(userDto != null) {
			user.setId(userDto.getId());
			user.setName(userDto.getName());
			user.setEmail(userDto.getEmail());
			user.setPassword(userDto.getPassword());
			user.setRole(userDto.getRole());
			
			return user;
		}
		return null;
		
	}
	public static UserDto userToUserDto(User user) {
		UserDto userDto = new UserDto();
		if(user != null) {
			userDto.setId(user.getId());
			userDto.setName(user.getName());
			userDto.setEmail(user.getEmail());
			userDto.setPassword(user.getPassword());
			userDto.setRole(user.getRole());
			
			return userDto;
		}
		return null;
		
	}
	public static List<UserDto> userToUserDto(List<User> userList){
		List<UserDto> ListUserDto = new ArrayList<>();
		if(userList != null) {
			for(User user : userList) {
				UserDto userDto = new UserDto();
				userDto.setId(user.getId());
				userDto.setName(user.getName());
				userDto.setEmail(user.getEmail());
				userDto.setPassword(user.getPassword());
				userDto.setRole(user.getRole());
				ListUserDto.add(userDto);
			}
			return ListUserDto;
		}
		return null;
		
	}
}
