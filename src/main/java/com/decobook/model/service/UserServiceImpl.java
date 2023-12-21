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
	public Map<String, Object> login(User user) {
		return uDao.login(user);
	}

	@Override
	public int registUser(User user) {
		return uDao.registUser(user);
	}

	@Override
	public int updateUser(User user) {
		return uDao.updateUser(user);
	}

	@Override
	public List<User> searchById(String user_id) {
		return uDao.searchById(user_id);
	}

}
