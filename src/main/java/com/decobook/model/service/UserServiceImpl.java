package com.decobook.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decobook.model.dao.UserDao;
import com.decobook.model.dto.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao uDao;

	@Override
	public Map<String, Object> login(String user_id, String password) {
		return uDao.login(user_id, password);
	}

	@Override
	public Integer registUser(User user) {
		return uDao.registUser(user);
	}

	@Override
	public Integer updateUser(User user) {
		return uDao.updateUser(user);
	}

	@Override
	public List<User> searchById(String user_id) {
		return uDao.searchById(user_id);
	}

}
