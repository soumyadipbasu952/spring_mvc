package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.User;
import com.lti.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;
	
	@Override
	public User login(User u) {
		User userToBeReturned=null;
		User uDB=repository.findUserByEmail(u.getEmail());
		if(uDB==null)
		{
			
		}
		else if(uDB.getEmail().equals(u.getEmail()) && (uDB.getPassword().equals(u.getPassword())))
		{
			userToBeReturned=uDB;
		}
		else
		{
			
		}
		return userToBeReturned;
		
		
	}

	
	
	@Override
	public User addUser(User u) {
		return repository.addUser(u);
	}

	@Override
	public void updateUser(User u) {
		repository.updateUser(u);
		
	}

	@Override
	public void deleteUser(User u) {
		repository.deleteUser(u);
		
	}

	

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public User findUserById(int id) {
		return repository.findUserById(id);
	}
	

}
