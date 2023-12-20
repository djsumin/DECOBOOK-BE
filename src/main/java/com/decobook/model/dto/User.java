package com.decobook.model.dto;

public class User {
	
	private String user_id;
	private String password;
	private String user_name;
	private int age;
	private String email;
	private String phone_number;
	private boolean gender;
	private String birthday;
	private int amount; //현재 잔고 (가계부에서 활용)
	
	public User() {
	}

	public User(String user_id, String password, String user_name, int age, String email, String phone_number,
			boolean gender, String birthday, int amount) {
		super();
		this.user_id = user_id;
		this.password = password;
		this.user_name = user_name;
		this.age = age;
		this.email = email;
		this.phone_number = phone_number;
		this.gender = gender;
		this.birthday = birthday;
		this.amount = amount;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", password=" + password + ", user_name=" + user_name + ", age=" + age
				+ ", email=" + email + ", phone_number=" + phone_number + ", gender=" + gender + ", birthday="
				+ birthday + ", amount=" + amount + "]";
	}

	
	
}
