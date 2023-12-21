package com.decobook.model.dao;

import java.util.List;

import com.decobook.model.dto.Budget;

public interface BudgetDao {
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
	
	//밑의 메서드들 파라미터 고민해보고 작성
	//현재 달의 어쩌고들은 List아니고 Budget으로 해도 될 듯,,,,?
	//근데 Budget에서 뭘 뽑아와야할지 모르겠다
	
	//현재 달의 총 수입
	List<Budget> selectBudgetIncome(int category);
	
	//현재 달의 총 지출
	List<Budget> selectBudgetExpenditure(int category);
	
	//월 별 가계부
	List<Budget> selectBudgetByMonth(String budget_date);
	
	//일 별 가계부
	List<Budget> selectBudgetByDay(String budget_date);
}
