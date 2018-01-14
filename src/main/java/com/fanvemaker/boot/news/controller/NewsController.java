package com.fanvemaker.boot.news.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fanvemaker.boot.common.model.ResponseVO;
import com.fanvemaker.boot.news.model.AddNews;
import com.fanvemaker.boot.news.model.NewsPage;
import com.fanvemaker.boot.news.model.UpdateNews;
import com.fanvemaker.boot.news.service.INewsService;

@RestController
public class NewsController {
	@Autowired
	private INewsService newsService;

	@GetMapping("/hello")
	public String hello() {
		return "你好，hello";
	}
	/**
	 * 获取新闻页面列表（分页）
	 * @param pageNumber
	 * @param pageSize
	 * @param type 全部为0
	 * @return
	 */
	@GetMapping("/news/getNewsPageList")
	public ResponseVO getNewsPageList(@RequestParam(required = false,defaultValue="1") Integer pageNumber,
			@RequestParam(required = false,defaultValue="10") Integer pageSize,
			@RequestParam(required=false,defaultValue="0") Integer type) {
		Map<String,Object> data = new HashMap<>();
		Long totalCount = newsService.totalCount(type);
		data.put("totalCount", totalCount);
		List<NewsPage> news = newsService.getListNewsPage(pageNumber, pageSize, type);
		data.put("news", news);
		ResponseVO responseVO = new ResponseVO();
		responseVO.setCode(100);
		responseVO.setSuccess(true);
		responseVO.setData(data);
		return responseVO;
	}
	/**
	 * 添加新闻
	 * @param addnews
	 * @return
	 */
	@PostMapping("/admin/news/addNews")
	public ResponseVO addNews(@ModelAttribute AddNews addnews){
		ResponseVO responseVO = new ResponseVO();
		if (StringUtils.isEmpty(addnews.getTitle())) {
			responseVO.setCode(301);
			responseVO.setMsg("标题不能为空");
			responseVO.setSuccess(false);
			return responseVO;
		}
		if (StringUtils.isEmpty(addnews.getClass())) {
			responseVO.setCode(302);
			responseVO.setMsg("内容不能为空");
			responseVO.setSuccess(false);
			return responseVO;
		}
		if (addnews.getType()==null||addnews.getType()==0) {
			responseVO.setCode(303);
			responseVO.setMsg("文章类型不能为空");
			responseVO.setSuccess(false);
			return responseVO;
		}
		int newid = newsService.addNews(addnews);
		responseVO.setCode(100);
		responseVO.setMsg("添加成功");
		responseVO.setSuccess(true);
		Map<String,Object> data =new HashMap<>();
		data.put("newid", newid);
		responseVO.setData(data);
		return responseVO;
	}
	@PostMapping("/admin/news/updateNews")
	public ResponseVO updateNews(@ModelAttribute UpdateNews updateNews){
		ResponseVO responseVO = new ResponseVO();
		if (updateNews.getId()==null||updateNews.getId()==0) {
			responseVO.setCode(303);
			responseVO.setMsg("id不能为空");
			responseVO.setSuccess(false);
			return responseVO;
		}
		if (StringUtils.isEmpty(updateNews.getTitle())) {
			responseVO.setCode(301);
			responseVO.setMsg("标题不能为空");
			responseVO.setSuccess(false);
			return responseVO;
		}
		if (StringUtils.isEmpty(updateNews.getClass())) {
			responseVO.setCode(302);
			responseVO.setMsg("内容不能为空");
			responseVO.setSuccess(false);
			return responseVO;
		}
		if (updateNews.getType()==null||updateNews.getType()==0) {
			responseVO.setCode(303);
			responseVO.setMsg("文章类型不能为空");
			responseVO.setSuccess(false);
			return responseVO;
		}
		
		return responseVO;
	}
	
	
}
