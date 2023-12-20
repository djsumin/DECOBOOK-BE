package com.decobook.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decobook.model.dao.BudgetDao;
import com.decobook.model.dto.Budget;

@Service
public class BudgetServiceImpl implements BudgetService{
	
	@Autowired
	private BudgetDao bDao;

	@Override
	public int registBudget(Budget budget) {
		return bDao.registBudget(budget);
	}

	@Override
	public int updateBudget(Budget budget) {
		return bDao.updateBudget(budget);
	}

	@Override
	public int deleteBudget(int budget_id) {
		return bDao.deleteBudget(budget_id);
	}

	@Override
	public List<Budget> selectBudgetAll() {
		return bDao.selectBudgetAll();
	}

	@Override
	public Budget selectBudgetOne(int budget_id) {
		return bDao.selectBudgetOne(budget_id);
	}

	@Override
	public List<Budget> selectBudgetIncome() {
		return bDao.selectBudgetIncome();
	}

	@Override
	public List<Budget> selectBudgetExpenditure() {
		return bDao.selectBudgetExpenditure();
	}

	@Override
	public List<Budget> selectBudgetByMonth() {
		return bDao.selectBudgetByMonth();
	}

	@Override
	public List<Budget> selectBudgetByDay() {
		return bDao.selectBudgetByDay();
	}

}
