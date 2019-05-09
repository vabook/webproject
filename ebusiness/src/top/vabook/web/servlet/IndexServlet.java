package top.vabook.web.servlet;

import java.util.List;

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
public class IndexServlet extends BaseServlet {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ProductService productService = new ProductServiceImpl();
		
		List<Product> listHotProduct = productService.findHots();
		List<Product> listNew = productService.findNews();
		
		request.setAttribute("hots", listHotProduct);
		request.setAttribute("news", listNew);
		return "/jsp/index.jsp";
	}
}
