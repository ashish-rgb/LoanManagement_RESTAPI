package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Apply;
import com.nissan.model.Feedback;
import com.nissan.model.Help;
import com.nissan.model.LoanType;
import com.nissan.model.Role;
import com.nissan.model.User;
import com.nissan.model.Verification;
import com.nissan.repo.IApplyRepository;
import com.nissan.repo.IFeedbackRepository;
import com.nissan.repo.IHelpRepository;
import com.nissan.repo.ILoanTypeRepository;
import com.nissan.repo.IRoleRepository;
import com.nissan.repo.IUserRepository;
import com.nissan.repo.IVerificationRepository;



@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserRepository userRepository;
	@Autowired
	IFeedbackRepository feedbackRepository;
	@Autowired
	IHelpRepository helpRepository;
	@Autowired
	IApplyRepository applyRepository;
	@Autowired
	IVerificationRepository verificationRepository;
	@Autowired
	IRoleRepository roleRepo;
	@Autowired
	ILoanTypeRepository loanTypeRepo;

	@Override
	public List<Apply> getAllAppls() {
		// TODO Auto-generated method stub
		return (List<Apply>) applyRepository.findAll();
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

	


	@Override
	public List<Feedback> getAllFeedbacks() {
		// TODO Auto-generated method stub
		return (List<Feedback>) feedbackRepository.findAll();
	}

	@Override
	public List<Help> getAllHelps() {
		// TODO Auto-generated method stub
		return (List<Help>) helpRepository.findAll();
	}

	@Override
	public Verification updateVerification(Verification verification) {
		// TODO Auto-generated method stub
		return verificationRepository.save(verification);
	}

	@Override
	public void deleteVerification(int verId) {
		// TODO Auto-generated method stub
		verificationRepository.deleteById(verId);
		
	}

	@Override
	public List<Role> findAllRoles() {
		return (List<Role>) roleRepo.findAll();
	}

	@Transactional
	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<LoanType> getAllLoanType() {
		return (List<LoanType>) loanTypeRepo.findAll();
	}

}
