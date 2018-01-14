package com.fanvemaker.boot.news.model;

public class AddNews {
	private String title;
	private String content;
	private Integer type;
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
		return "AddNews [title=" + title + ", content=" + content + ", type=" + type + "]";
	}
	
	
	
}
