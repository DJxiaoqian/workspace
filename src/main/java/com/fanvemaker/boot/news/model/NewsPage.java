package com.fanvemaker.boot.news.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="t_zjrhysp_news")
public class NewsPage {
	@Id
	@Column(name="fid")
	private int id;
	@Column(name="ftitle")
	private String title;
	@Column(name="ftype")
	private int type;
	@Column(name="fcreatetime")
	private Date createtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "NewsPageDTO [id=" + id + ", title=" + title + ", type=" + type + ", createtime=" + createtime + "]";
	}
	
	public NewsPage() {
	}
	
	
	public NewsPage(NewsDTO newsDTO) {
		this.id = newsDTO.getFid();
		this.title = newsDTO.getFtitle();
		this.type = newsDTO.getFtype();
		this.createtime = newsDTO.getFcreatetime();
	}
}
