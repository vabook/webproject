package top.vabook.web.servlet;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import top.vabook.domain.Product;
import top.vabook.service.ProductService;
import top.vabook.service.impl.ProductServiceImpl;
import top.vabook.web.base.BaseServlet;

/**
* @author vabook@163.com
*
*/
public class ProductServlet extends BaseServlet {
	public String findProductByPid(HttpServletRequest requsest,HttpServletResponse response) throws Exception {
		String pid = requsest.getParameter("pid");
		ProductService productService = new ProductServiceImpl();
		Product product = productService.findProductByPid(pid);
		
		requsest.setAttribute("product", product);
		
		return "/jsp/product_info.jsp";
		
	}
}
