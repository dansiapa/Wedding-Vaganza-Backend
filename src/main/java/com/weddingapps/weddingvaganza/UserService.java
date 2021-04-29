package com.weddingapps.weddingvaganza;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public UserModel createUser(String userName, String pasanganUser, String userEmail, String userPassword
			,String tglPernikahan, int nomorHPUser) {
		UserModel userModel = new UserModel();
		
		if (Objects.nonNull(userRepository.getUserModelByEmail(userEmail))) {
			return null;
		} else {
			userModel.setUserNama(userName);
			userModel.setUserEmail(userEmail);
			userModel.setUserPassword(userPassword);
			
			return userRepository.save(userModel);
		}
		
	}
	
	public Optional<UserModel> getUser(int userId){
		return userRepository.findById(userId);
	}
	
	public UserModel getUsersByEmail(String userEmail) {
		return userRepository.getUserModelByEmail(userEmail);
	}
	
	public Boolean login(String userEmail, String userPassword) {
		UserModel usersModel = userRepository.getUserModelByEmail(userEmail);
		if (Objects.nonNull(usersModel)) {
			if(usersModel.getUserPassword().equals(userPassword)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public Iterable<UserModel> getAllUser(){
		return userRepository.findAll();

	}

}
