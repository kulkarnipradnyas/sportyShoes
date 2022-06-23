package com.simplilearn.sportyshoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  com.simplilearn.sportyshoes.dao.OrdersDao;
import  com.simplilearn.sportyshoes.dao.UsersDao;
import  com.simplilearn.sportyshoes.model.OrderedShoeModel;
import  com.simplilearn.sportyshoes.model.ShoesDataModel;
import  com.simplilearn.sportyshoes.model.UserInfoModel;

@Service
public class UsersService {

	@Autowired
	private UsersDao userDao;

	public UserInfoModel isValidAdminUserService(String username, String password) {

		UserInfoModel userInfoModel = userDao.isValidAdminUser(username, password);

		return userInfoModel;

	}
	
	public List<UserInfoModel> getUserDataService() {
		
		 List<UserInfoModel> usersList= (List)userDao.getUserDatabyRollid(2);
	        
	       return usersList;
	    }
	
	
	
	public  UserInfoModel  isCorrectPassword_or_NotService(String password) {
		
		  UserInfoModel  usersList=  userDao.isCorrectPassword_or_Not(password);
	        
	       return usersList;
	    }
	
 	
	public  boolean  updateAdminPasswordService(UserInfoModel userInfoModel, String currentpassword,
			String newpassword, String confirmpassword) {
		int count=0;
		boolean isUpdated=false;
		    count=  userDao.updateAdminPassword(confirmpassword,userInfoModel.getFirstname());
		     
	        if(count>0)
	        {
	        	isUpdated=true;
	        }
	       return isUpdated;
	    }
	
	public void insertUserDataService(String firstname, String lastname, String password, String confirmpassword, int rollid, Long mobileno, String email)
	{
		UserInfoModel   u =new UserInfoModel(firstname, lastname, confirmpassword, rollid, mobileno, email);
		userDao.save(u);
	}
}
