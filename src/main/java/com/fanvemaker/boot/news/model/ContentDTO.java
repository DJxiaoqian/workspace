package com.fanvemaker.boot.news.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_zjrhysp_content")
public class ContentDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "fid")
	private Integer id;
	@Column(name = "fcontent")
	private String content;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "ContentDTO [id=" + id + ", content=" + content + "]";
	}
	
}
