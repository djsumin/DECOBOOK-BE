package com.decobook.model.service;

import java.util.List;

import com.decobook.model.dto.Budget;

public interface BudgetService {
	
	//등록
	int registBudget(Budget budget);
	
	//수정
	int updateBudget(Budget budget);
	
	//삭제
	int deleteBudget(int budget_id);
	
	//전체목록 (필요할까? 필요없으면 빼기)
	List<Budget> selectBudgetAll();
	
	//디테일
	Budget selectBudgetOne(int budget_id);
	
	//현재 달의 총 수입
	List<Budget> selectBudgetIncome(int category);
	
	//현재 달의 총 지출
	List<Budget> selectBudgetExpenditure(int category);
	
	//월 별 가계부
	List<Budget> selectBudgetByMonth(String budget_date);
	
	//일 별 가계부
	List<Budget> selectBudgetByDay(String budget_date);

}
