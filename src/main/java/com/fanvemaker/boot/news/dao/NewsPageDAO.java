package com.fanvemaker.boot.news.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fanvemaker.boot.news.model.NewsPage;

public interface NewsPageDAO extends JpaRepository<NewsPage, Integer>{
	Long countByType(Integer type);
	
	Page<NewsPage> findByType(int type,Pageable pageable);
}
