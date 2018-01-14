package com.fanvemaker.boot.test.news.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fanvemaker.boot.BaseApplicationTests;
import com.fanvemaker.boot.news.dao.ContentDAO;
import com.fanvemaker.boot.news.dao.NewsDAO;
import com.fanvemaker.boot.news.dao.NewsPageDAO;
import com.fanvemaker.boot.news.model.ContentDTO;

public class NewsDAOTest extends BaseApplicationTests{
	@Autowired
	private NewsDAO newsDAO;
	@Autowired
	private NewsPageDAO newsPageDAO;
	@Autowired
	private ContentDAO contentDAO;
	
	@Test
	public void testName() throws Exception {
		System.out.println(newsDAO.findAll());
		System.out.println(newsPageDAO.findAll());
		System.out.println(newsPageDAO.countByType(2));
	}
	
	@Test
	public void testAdd() throws Exception {
		ContentDTO content = new ContentDTO();
		content.setContent("这是内容这是内容这是内容这是内容这是内容这是内容这是内容这是内容这是内容这是内容");
		content = contentDAO.save(content);
		System.out.println(content);
	}
}
