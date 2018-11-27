package com.sgic.hrm.employee.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.repository.UserRepository;
import com.sgic.hrm.employee.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Override
	public boolean addUser(User user) {
		userRepository.save(user);
		return true;
	}
	@Override
	public List<User> getUser() {
		return userRepository.findAll();
		
	}
	@Override
	public boolean editUser(User user, Integer id) {
		if(userRepository.getOne(id) != null) {
			user.setId(id);
			userRepository.save(user);
			return true;
		}
		return false;
	}
	@Override
	public Optional<User> getUserId(Integer id) {
		return userRepository.findById(id);
	}
	@Override
	public boolean deleteUser(Integer id) {
		if(userRepository.getOne(id)!= null) {
			userRepository.deleteById(id);
			return true;
		}
		return false;
	}
	

}
