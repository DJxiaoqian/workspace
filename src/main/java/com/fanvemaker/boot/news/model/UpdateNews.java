package com.fanvemaker.boot.news.model;

public class UpdateNews {
	private Integer id;
	private String title;
	private String content;
	private Integer type;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "UpdateNews [id=" + id + ", title=" + title + ", content=" + content + ", type=" + type + "]";
	}
	
}
