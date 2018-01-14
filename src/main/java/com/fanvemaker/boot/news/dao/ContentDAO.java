package com.fanvemaker.boot.news.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fanvemaker.boot.news.model.ContentDTO;

public interface ContentDAO extends JpaRepository<ContentDTO, Integer>{

}
