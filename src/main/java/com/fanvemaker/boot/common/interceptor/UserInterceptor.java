package com.fanvemaker.boot.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fanvemaker.boot.common.model.ResponseVO;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if ("/admin/user/login".equals(request.getRequestURI())) {
			return true;
		}
        Object userid =  request.getSession().getAttribute("userid");
		if (userid == null) {
			ObjectMapper mapper = new ObjectMapper();
			ResponseVO responseVO = new ResponseVO();
			responseVO.setCode(101);
			responseVO.setMsg("请登录帐号");
			responseVO.setSuccess(false);
			response.setCharacterEncoding("UTF-8");
			response.setHeader("Content-type", "text/html;charset=UTF-8");
			response.getWriter().println(mapper.writeValueAsString(responseVO));
	        return false;
		}
        return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
