package com.decobook.model.dto;

public class Diary {
	private int diary_id;
	private String diary_date;
	private String title;
	private String diary_content;
	private String img;
	private String orgImg;
	private int weather;
	private int feeling;
	private int star_score;
	private String user_id;
	private int latitude;
	private int longitude;

	public Diary() { }

	public Diary(int diary_id, String diary_date, String title, String diary_content, String img, String orgImg, int weather, int feeling, int star_score, String user_id, int latitude, int longitude) {
		this.diary_id = diary_id;
		this.diary_date = diary_date;
		this.title = title;
		this.diary_content = diary_content;
		this.img = img;
		this.orgImg = orgImg;
		this.weather = weather;
		this.feeling = feeling;
		this.star_score = star_score;
		this.user_id = user_id;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public int getDiary_id() {
		return diary_id;
	}

	public void setDiary_id(int diary_id) {
		this.diary_id = diary_id;
	}

	public String getDiary_date() {
		return diary_date;
	}

	public void setDiary_date(String diary_date) {
		this.diary_date = diary_date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiary_content() {
		return diary_content;
	}

	public void setDiary_content(String diary_content) {
		this.diary_content = diary_content;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getOrgImg() {
		return orgImg;
	}

	public void setOrgImg(String orgImg) {
		this.orgImg = orgImg;
	}

	public int getWeather() {
		return weather;
	}

	public void setWeather(int weather) {
		this.weather = weather;
	}

	public int getFeeling() {
		return feeling;
	}

	public void setFeeling(int feeling) {
		this.feeling = feeling;
	}

	public int getStar_score() {
		return star_score;
	}

	public void setStar_score(int star_score) {
		this.star_score = star_score;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Diary{" +
				"diary_id=" + diary_id +
				", diary_date='" + diary_date + '\'' +
				", title='" + title + '\'' +
				", diary_content='" + diary_content + '\'' +
				", img='" + img + '\'' +
				", orgImg='" + orgImg + '\'' +
				", weather=" + weather +
				", feeling=" + feeling +
				", star_score=" + star_score +
				", user_id='" + user_id + '\'' +
				", latitude=" + latitude +
				", longitude=" + longitude +
				'}';
	}
}
