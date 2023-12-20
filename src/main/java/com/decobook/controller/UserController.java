package com.decobook.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decobook.model.dto.User;
import com.decobook.model.service.UserService;
import com.decobook.util.JwtUtil;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	
	//로그인
	@PostMapping("/login")
	@Operation(summary = "로그인", description = "유저아이디와 비밀번호를 이용하여 액세스 토큰을 반환합니다.")
	public ResponseEntity<Map<String, Object>> login(@RequestBody User user){
		
		Map<String, Object> res = new HashMap<String, Object>();
		
		//User Service -> dao -> DB로 실제 유저인지 확인
		List<User> list = uService.searchById(user.getUser_id());
		
		HttpStatus status = null;
		
		//list의 password가 같다면 로그인 성공
		if(user.getUser_id() != null && user.getPassword() != null && list.get(0).getPassword().equals(user.getPassword())) {
			res.put("access-token", jwtUtil.createToken("id", user.getUser_id()));
			res.put("message", "로그인성공");
			res.put("user_name", list.get(0).getUser_name());
			status = HttpStatus.OK;
		}else {
			res.put("message", "로그인실패");
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return new ResponseEntity<Map<String, Object>>(res, status);
		
	}
	
	//등록
	@PostMapping("/signUp")
	public ResponseEntity<?> registUser(@RequestBody User user){ //@ModelAttribute?
		
		int res = uService.registUser(user);
		
		//실패
		if(res == 0) {
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		}
		
		//성공
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	//수정
	@PutMapping("/user") //매핑 체크
	public ResponseEntity<?> updateUser(User user){
		
		int res = uService.updateUser(user);
		
		//실패
		if(res == 0) {
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		}
		
		//성공
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	//user_id로 검색
	@GetMapping("/user") //매핑 체크
	public ResponseEntity<?> searchById(String user_id){
		
		List<User> list = uService.searchById(user_id);
		
		//일치하는 회원 없음
		if (list.size() == 0 || list == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		//있음
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
