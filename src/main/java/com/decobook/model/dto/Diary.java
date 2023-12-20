package com.decobook.model.dto;

public class Diary {
	private int diary_id;
	private String diary_date;
	private String title;
	private String diary_content;
	private String img;
	private int weather;
	private int feeling;
	private int star_score;
	private String location;
	
	public Diary() {
	}

	public Diary(int diary_id, String diary_date, String title, String diary_content, String img, int weather,
			int feeling, int star_score, String location) {
		super();
		this.diary_id = diary_id;
		this.diary_date = diary_date;
		this.title = title;
		this.diary_content = diary_content;
		this.img = img;
		this.weather = weather;
		this.feeling = feeling;
		this.star_score = star_score;
		this.location = location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Diary [diary_id=" + diary_id + ", diary_date=" + diary_date + ", title=" + title + ", diary_content="
				+ diary_content + ", img=" + img + ", weather=" + weather + ", feeling=" + feeling + ", star_score="
				+ star_score + ", location=" + location + "]";
	}
	
}