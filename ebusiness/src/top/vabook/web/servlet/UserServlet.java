package top.vabook.web.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import top.vabook.web.base.BaseServlet;

/**
* @author vabook@163.com
*
*/
public class UserServlet extends BaseServlet {
	public String register(HttpServletRequest request,HttpServletResponse response) {
		return "/jsp/register.jsp";
	}

	public String loginUI(HttpServletRequest request,HttpServletResponse response) {
		return "/jsp/login.jsp";
		
	}
	
	public String userRegister(HttpServletRequest request,HttpServletResponse response) {
		return null;
		
	}
}
