package com.fanvemaker.boot.news.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fanvemaker.boot.news.model.NewsDTO;

public interface NewsDAO extends  JpaRepository<NewsDTO, Integer>{
}
