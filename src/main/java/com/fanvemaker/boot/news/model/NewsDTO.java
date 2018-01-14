package com.fanvemaker.boot.news.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_zjrhysp_news")
public class NewsDTO {
	@Id
	@GeneratedValue
	private int fid;
	private String ftitle;
	private int fcontentid;
	private int ftype;
	private int fviews;
	private Date fcreatetime;
	private Date fupdatetime;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFtitle() {
		return ftitle;
	}
	public void setFtitle(String ftitle) {
		this.ftitle = ftitle;
	}
	public int getFcontentid() {
		return fcontentid;
	}
	public void setFcontentid(int fcontentid) {
		this.fcontentid = fcontentid;
	}
	public int getFtype() {
		return ftype;
	}
	public void setFtype(int ftype) {
		this.ftype = ftype;
	}
	public int getFviews() {
		return fviews;
	}
	public void setFviews(int fviews) {
		this.fviews = fviews;
	}
	public Date getFcreatetime() {
		return fcreatetime;
	}
	public void setFcreatetime(Date fcreatetime) {
		this.fcreatetime = fcreatetime;
	}
	public Date getFupdatetime() {
		return fupdatetime;
	}
	public void setFupdatetime(Date fupdatetime) {
		this.fupdatetime = fupdatetime;
	}
	@Override
	public String toString() {
		return "NewsDTO [fid=" + fid + ", ftitle=" + ftitle + ", fcontentid=" + fcontentid + ", ftype=" + ftype
				+ ", fviews=" + fviews + ", fcreatetime=" + fcreatetime + ", fupdatetime=" + fupdatetime + "]";
	}
	
}
