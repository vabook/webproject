package top.vabook.web.base;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
* @author vabook@163.com
*
*/
public class BaseServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String method = req.getMethod();
		if (method == null || "".equals(method) || method.trim().equals("")) {
			method = "execute";
		}
		Class clazz = this.getClass();
		try {
			Method md = clazz.getMethod(method, HttpServletRequest.class,HttpServletResponse.class);
			if (null != md) {
				String jspPath = (String) md.invoke(this, req,response);
				if (null != jspPath) {
					req.getRequestDispatcher(jspPath).forward(req, response);;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
				
	}
	
	//默认,请求方法为空时
	public String execute(HttpServletRequest request,HttpServletResponse response) throws Exception {
		return null;
		
	}
}
