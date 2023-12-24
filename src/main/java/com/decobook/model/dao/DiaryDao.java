package com.decobook.model.dao;

import java.util.List;

import com.decobook.model.dto.Diary;

public interface DiaryDao {
	
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
	Diary selectDiaryRecent();
	
	//날짜별
	Diary selectDiaryByDate(String diary_date);


}