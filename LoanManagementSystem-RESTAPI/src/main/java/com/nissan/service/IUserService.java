package com.nissan.service;

import java.util.List;

import com.nissan.model.Apply;
import com.nissan.model.Feedback;
import com.nissan.model.Help;
import com.nissan.model.LoanType;
import com.nissan.model.Role;
import com.nissan.model.User;
import com.nissan.model.Verification;




public interface IUserService {
	
	
	List<User> getAllUsers();
	
	List<Role> findAllRoles();
	
	Verification updateVerification(Verification verification);
	
	void deleteVerification(int verId);
	
	//Insert User
	User addUser(User user);
	
	//Update User
	User updateUser(User user);

	List<Feedback> getAllFeedbacks();
	
	List<Help> getAllHelps();
	
	List<Apply> getAllAppls();
	
	List<LoanType> getAllLoanType();
}
