package com.decobook.controller;

import java.util.List;

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
@RequestMapping("/api")
@CrossOrigin("*")
public class DiaryController {
	
	@Autowired
	private DiaryService dService;
	
	//등록
	@PostMapping("/diary")
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
	@PutMapping("/diary")
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
	@DeleteMapping("/diary")//@DeleteMapping("/diary/{diary_id}")
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
	@GetMapping("/diary")
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
	@GetMapping("/diary/{diary_id}")
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
	@GetMapping("/diary/recent")
	public ResponseEntity<?> selectDiaryRecent(int diary_id){
		
		Diary diary = dService.selectDiaryRecent(diary_id);
		
		//해당 다이어리 없음
		if(diary == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		//있음
		return new ResponseEntity<Diary>(diary, HttpStatus.OK);
	}
	
	//날짜별
	@GetMapping("/diary/{diary_date}")
	public ResponseEntity<?> selectDiaryByDate(String diary_date){
		
		Diary diary = dService.selectDiaryByDate(diary_date);
		
		//해당 다이어리 없음
		if(diary == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		//있음
		return new ResponseEntity<Diary>(diary, HttpStatus.OK);
	}
	
	
	//장소 가져오기
	@GetMapping("diary/{diary_id}/location")
	public ResponseEntity<?> getLocationDetail(int diary_id){
		
		String location = dService.getLocationDetail(diary_id);
		
		//장소 없음
		if(location == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
		//있음
		return new ResponseEntity<String>(location, HttpStatus.OK);
	}
	
	//이미지 url 가져오기
	@GetMapping("diary/{diary_id}/img")
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
