package com.decobook.model.service;

import java.util.List;

import com.decobook.model.dto.Diary;

public interface DiaryService {
	
	//등록
	int registDiary(Diary diary);
	
	//수정
	int updateDiary(Diary diary);
	
	//삭제
	int deleteDiary(int diary_id);
	
	//전체 (리스트)
	List<Diary> selectDiaryAll();
	
	//디테일
	Diary selectDiaryOne(int diary_id);
	
	//최근 (메인)
	Diary selectDiaryRecent(int diary_id);
	
	//날짜별
	Diary selectDiaryByDate(String diary_date);
	
	//장소
	String getLocationDetail(int diary_id);
	
	//이미지
//	String getImgUrl(); //파라미터 뭘로 받아올지 고민 후 수정하기
	

}
