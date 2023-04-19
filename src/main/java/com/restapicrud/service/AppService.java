package com.restapicrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapicrud.model.User;
import com.restapicrud.repositary.AppRepo;

@Service
public class AppService {

	@Autowired
	private AppRepo appRepo;

	public Object saveUser(User user) {
		
		return appRepo.save(user);
	}

	public Object getById(int id) {
		
		return appRepo.findById(id);
	}

	public Object deleteUserId(int id) {
		appRepo.deleteById(id);
		
		return "record deleted succesfully";
	}

	public Object updateById(int id,User updateUser) {
		
		User userData=(User) getById(id);
		if(userData!=null) {
			
			userData.setUserName(updateUser.getUserName());
			userData.setUserEmail(updateUser.getUserEmail());
			userData.setUserAddress(updateUser.getUserAddress());
			return appRepo.save(userData);
		}
		else {
			
			return "user doesnot exists!!";
		}
		
		
	}
	
	
	
		 
		
	
}
