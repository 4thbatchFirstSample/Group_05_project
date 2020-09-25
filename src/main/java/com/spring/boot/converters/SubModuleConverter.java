package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.SubModuleDto;
import com.spring.boot.entities.Module;
import com.spring.boot.entities.SubModule;
import com.spring.boot.entities.User;

@Service
public class SubModuleConverter {
	public static SubModule subModuleDtotoSubModule(SubModuleDto subModuleDto) {
		SubModule subModule = new SubModule();
		Module module = new Module();
		
		if(subModuleDto != null) {
			subModule.setId(subModuleDto.getId());
			subModule.setName(subModuleDto.getName());
			module.setId(subModuleDto.getModuleId());
			module.setName(subModuleDto.getModuleName());
			List<User> userList = new ArrayList<User>();
			for(Long userId : subModuleDto.getUserId()) {
				User user = new User();
				user.setId(userId);
				userList.add(user);				
			}
			subModule.setModule(module);
			subModule.setUsers(userList);
			return subModule;
		}
		return null;
		
	}
	public static List<SubModuleDto> subModuleToSubModuleDto(List<SubModule> subModuleList ){
		List<SubModuleDto> listSubModuleDto = new ArrayList<>();
		if(subModuleList != null) {
			for(SubModule subModule : subModuleList) {
				SubModuleDto subModuleDto = new SubModuleDto();
				List<Long> userIdList = new ArrayList<>();
				subModuleDto.setId(subModule.getId());
				subModuleDto.setName(subModule.getName());
				subModuleDto.setModuleId(subModule.getModule().getId());
				subModuleDto.setModuleName(subModule.getModule().getName());
				for(User user: subModule.getUsers()) {
					userIdList.add(user.getId());
				}
				subModuleDto.setUserId(userIdList);
				listSubModuleDto.add(subModuleDto);
			}
			return listSubModuleDto;
		}
		return null;
	}
	public static SubModuleDto subModuleTosubModuleDto(SubModule subModule) {
		SubModuleDto subModuleDto = new SubModuleDto();
		List<Long> userIdList = new ArrayList<>();
		if(subModule != null) {
			subModuleDto.setId(subModule.getId());
			subModuleDto.setName(subModule.getName());
			subModuleDto.setModuleId(subModule.getModule().getId());
			subModuleDto.setModuleName(subModule.getModule().getName());
			for(User user: subModule.getUsers()) {
				userIdList.add(user.getId());
			}
			subModuleDto.setUserId(userIdList);
			return subModuleDto;
		}
		return null;
	}
}
