package com.decobook.model.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decobook.model.dao.DiaryDao;
import com.decobook.model.dto.Diary;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DiaryServiceImpl implements DiaryService{
	private static final String UPLOAD_DIR = "static/images/";

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
	public Diary selectDiaryRecent() {
		return dDao.selectDiaryRecent();
	}

	@Override
	public Diary selectDiaryByDate(String diary_date) {
		return dDao.selectDiaryByDate(diary_date);
	}

	@Override
	public String getLocationDetail(int diary_id) {
//		return dDao.getLocationDetail(diary_id);
		return null;
	}

	@Override
	public String getImgUrl(int diary_id) {
		return null;
		//return dDao.getImgUrl(diary_id);
	}

	@Override
	public int uploadImg(MultipartFile file, int diary_id) {
		Diary diary = new Diary();
		diary.setDiary_id(diary_id);
		int fail = 0;
		// StringUtils 클래스만으로 거의 대부분의 문자열 처리를 수행할 수 있으며 피라미터 값으로 null을 주더라도 절대 NPE를 발생시키지 않는다
		String orgImg = StringUtils.cleanPath(file.getOriginalFilename());
		try {
			if(orgImg.contains("..")) {
				System.out.println("invalid path : " + orgImg);
				return fail;
			}
			System.out.println("?? / " + orgImg);

			// check for the targetpath
			Path targetDirectory = Paths.get(UPLOAD_DIR);
			if (!Files.exists(targetDirectory)) {
				try {
					Files.createDirectories(targetDirectory);
				} catch (IOException e) {
					e.printStackTrace(); // 예외 처리 로직 추가
					return fail;
				}
			}

			// Prepare the target path
			Path targetPath = Path.of(UPLOAD_DIR, orgImg);

			// Copy the file to the target path
			Files.copy(file.getInputStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);
			// Assuming you want to save the file path in the diary object
			System.out.println("dd/" + orgImg);
			System.out.println("ee/" +targetPath.toString());
			diary.setImg(orgImg);
			diary.setOrgImg(targetPath.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return dDao.uploadImg(diary);
	}

}
