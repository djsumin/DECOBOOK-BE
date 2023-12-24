package com.decobook.controller;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decobook.model.dto.Diary;
import com.decobook.model.service.DiaryService;

@RestController
@RequestMapping("/api/diary")
@CrossOrigin("*")
public class DiaryController {
	
	@Autowired private DiaryService dService;
	
	//등록
	@PostMapping("/")
	@Operation(summary = "등록", description = "등록 시 현재 시간으로 date입력")
	public ResponseEntity<?> registDiary(Diary diary){
		
		int res = dService.registDiary(diary);
		
		//실패
		if(res == 0) {
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		}
		
		//성공
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	//수정
	@PutMapping("/")
	@Operation(summary = "수정", description = "diary id 입력")
	public ResponseEntity<?> updateDiary(Diary diary){
		
		int res = dService.updateDiary(diary);
		
		//실패
		if(res == 0) {
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		}
		
		//성공
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	//삭제
	@DeleteMapping("/")//@DeleteMapping("/diary/{diary_id}")
	@Operation(summary = "삭제", description = "diary id 입력")
	public ResponseEntity<?> deleteDiary(int diary_id){
		
		int res = dService.deleteDiary(diary_id);
		
		//실패
		if(res == 0) {
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		}
		
		//성공
		return new ResponseEntity<Void>(HttpStatus.OK);
		
		
	}
	
	//전체(리스트)
	@GetMapping("/")
	@Operation(summary = "전체 조회", description = "전체 조회")
	public ResponseEntity<?> selectDiaryAll(){
		
		List<Diary> list = dService.selectDiaryAll();
		
		//리스트없음
		if(list == null || list.size() == 0) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		//리스트있음
		return new ResponseEntity<List<Diary>>(list,HttpStatus.OK);
		
	}
	
	
	//디테일
	@GetMapping("/id/{diary_id}")
	@Operation(summary = "다이어리 한 개 조회", description = "diary id 입력")
	public ResponseEntity<?> selectDiaryOne(int diary_id){
		
		Diary diary = dService.selectDiaryOne(diary_id);
		//해당 다이어리 없음
		if(diary == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		//있음
		return new ResponseEntity<Diary>(diary, HttpStatus.OK);
		
	}
	
	//최근(메인)
	@GetMapping("/recent")
	@Operation(summary = "최근 다이어리 조회", description = "")
	public ResponseEntity<?> selectDiaryRecent(){
		
		Diary diary = dService.selectDiaryRecent();
		
		//해당 다이어리 없음
		if(diary == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		//있음
		return new ResponseEntity<Diary>(diary, HttpStatus.OK);
	}
	
	//날짜별
	@GetMapping("/date/{diary_date}")
	@Operation(summary = "최근 다이어리 조회", description = "diary date 입력")
	public ResponseEntity<?> selectDiaryByDate(String diary_date){
		
		Diary diary = dService.selectDiaryByDate(diary_date);
		
		//해당 다이어리 없음
		if(diary == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		//있음
		return new ResponseEntity<Diary>(diary, HttpStatus.OK);
	}

	//이미지 url 가져오기
	@GetMapping("/{diary_id}/img")
	public ResponseEntity<?> getImgUrl(int diary_id){
		
		String url = dService.getImgUrl(diary_id);
		
		//url 없음
		if(url == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		//있음
		return new ResponseEntity<String>(url, HttpStatus.OK);
		
	}

}
