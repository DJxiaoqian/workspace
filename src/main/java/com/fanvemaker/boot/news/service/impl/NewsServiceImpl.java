package com.fanvemaker.boot.news.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.fanvemaker.boot.news.dao.ContentDAO;
import com.fanvemaker.boot.news.dao.NewsDAO;
import com.fanvemaker.boot.news.dao.NewsPageDAO;
import com.fanvemaker.boot.news.model.AddNews;
import com.fanvemaker.boot.news.model.ContentDTO;
import com.fanvemaker.boot.news.model.NewsDTO;
import com.fanvemaker.boot.news.model.NewsPage;
import com.fanvemaker.boot.news.model.UpdateNews;
import com.fanvemaker.boot.news.service.INewsService;

@Service
public class NewsServiceImpl implements INewsService {
	@Autowired
	private NewsPageDAO newsPageDAO;
	@Autowired
	private ContentDAO contentDAO;
	@Autowired
	private NewsDAO newsDAO;

	@Override
	public Long totalCount(int type) {
		if (type == 0) {
			return newsPageDAO.count();
		} else {
			return newsPageDAO.countByType(type);
		}
	}

	@Override
	public List<NewsPage> getListNewsPage(int pageNumber, int pageSize, int type) {
		if (pageNumber<1) {
			return new ArrayList<>();
		}
		if (pageSize < 1) {
			return new ArrayList<>();
		}
		Sort sort = new Sort(Direction.DESC, "id");
		Pageable pageable = new PageRequest(pageNumber-1, pageSize, sort);
		if (type == 0) {
			Page<NewsPage> NewsPages = newsPageDAO.findAll(pageable);
			
			return NewsPages.getContent();
		} else {
			Page<NewsPage> NewsPages = newsPageDAO.findByType(type, pageable);
			return NewsPages.getContent();
		}
	}

	@Override
	public int addNews(AddNews addNewsnews) {
		ContentDTO content = new ContentDTO();
		content.setContent(addNewsnews.getContent());
		content = contentDAO.save(content);
		NewsDTO news = new NewsDTO();
		news.setFcontentid(content.getId());
		news.setFcreatetime(new Date());
		news.setFtitle(addNewsnews.getTitle());
		news.setFtype(addNewsnews.getType());
		news.setFviews(0);
		news = newsDAO.save(news);
		return news.getFid();
	}

	@Override
	public int updateNews(UpdateNews updateNews) {
		ContentDTO content = new ContentDTO();
		ContentDTO findOne = contentDAO.findOne(updateNews.getId()); 
		return 0;
	}

}
