package com.fanvemaker.boot.news.service;

import java.util.List;

import com.fanvemaker.boot.news.model.AddNews;
import com.fanvemaker.boot.news.model.NewsPage;
import com.fanvemaker.boot.news.model.UpdateNews;

public interface INewsService {
	Long totalCount(int type);
	
	List<NewsPage> getListNewsPage(int pageNumber,int pageSize,int type);
	
	int addNews(AddNews addNewsnews);
	
	int updateNews(UpdateNews updateNews);
}
