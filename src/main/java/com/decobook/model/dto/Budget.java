package com.decobook.model.dto;

public class Budget {
	
	private int budget_id;
	private String budget_date;
	private boolean isIncome; //t - 수입 / f - 지출
	private int category;
	private int cost;
	private String memo;
	private int amount; //원래있던잔고
	private int after_amount; // 지출/수입 후 잔고
	private String user_id;
	
	public Budget() {
	}

	public Budget(int budget_id, String budget_date, boolean isIncome, int category, int cost, String memo, int amount,
			int after_amount, String user_id) {
		super();
		this.budget_id = budget_id;
		this.budget_date = budget_date;
		this.isIncome = isIncome;
		this.category = category;
		this.cost = cost;
		this.memo = memo;
		this.amount = amount;
		this.after_amount = after_amount;
		this.user_id = user_id;
	}

	public int getBudget_id() {
		return budget_id;
	}

	public void setBudget_id(int budget_id) {
		this.budget_id = budget_id;
	}

	public String getBudget_date() {
		return budget_date;
	}

	public void setBudget_date(String budget_date) {
		this.budget_date = budget_date;
	}

	public boolean isIncome() {
		return isIncome;
	}

	public void setIncome(boolean isIncome) {
		this.isIncome = isIncome;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAfter_amount() {
		return after_amount;
	}

	public void setAfter_amount(int after_amount) {
		this.after_amount = after_amount;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Budget [budget_id=" + budget_id + ", budget_date=" + budget_date + ", isIncome=" + isIncome
				+ ", category=" + category + ", cost=" + cost + ", memo=" + memo + ", amount=" + amount
				+ ", after_amount=" + after_amount + ", user_id=" + user_id + "]";
	}


	
}
