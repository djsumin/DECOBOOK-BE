package com.decobook.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decobook.model.dao.DiaryDao;
import com.decobook.model.dto.Diary;

@Service
public class DiaryServiceImpl implements DiaryService{
	
	@Autowired
	private DiaryDao dDao;
	
	@Override
	public int registDiary(Diary diary) {
		return dDao.registDiary(diary);
	}

	@Override
	public int updateDiary(Diary diary) {
		return dDao.updateDiary(diary);
	}

	@Override
	public int deleteDiary(int diary_id) {
		return dDao.deleteDiary(diary_id);
	}

	@Override
	public List<Diary> selectDiaryAll() {
		return dDao.selectDiaryAll();
	}

	@Override
	public Diary selectDiaryOne(int diary_id) {
		return dDao.selectDiaryOne(diary_id);
	}

	@Override
	public Diary selectDiaryRecent(int diary_id) {
		return dDao.selectDiaryRecent(diary_id);
	}

	@Override
	public Diary selectDiaryByDate(String diary_date) {
		return dDao.selectDiaryByDate(diary_date);
	}

	@Override
	public String getLocationDetail(int diary_id) {
		return dDao.getLocationDetail(diary_id);
	}

}
