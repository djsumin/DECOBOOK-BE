package com.decobook.model.dao;

import java.util.List;
import java.util.Map;

import com.decobook.model.dto.User;

public interface UserDao {
	
	//로그인
	Map<String, Object> login(String user_id, String password);

	//등록
	Integer registUser(User user);
	
	//수정
	Integer updateUser(User user);
	
	//user_id로 검색 (jwt 검증을 위해)
	List<User> searchById(String user_id);
}
