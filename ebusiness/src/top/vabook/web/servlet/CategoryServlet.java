package top.vabook.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import redis.clients.jedis.Jedis;
import top.vabook.domain.Category;
import top.vabook.service.CategoryService;
import top.vabook.service.impl.CategoryServiceImpl;
import top.vabook.util.JedisUtils;
import top.vabook.web.base.BaseServlet;

/**
* @author vabook@163.com
*
*/
public class CategoryServlet extends BaseServlet {
	public String findAllCats(HttpServletRequest request,HttpServletResponse response) throws SQLException, IOException {
		Jedis jedis = JedisUtils.getJedis();
		String jsonStr = jedis.get("allCats");
		if (null == jsonStr || "".equals(jsonStr)) {
			CategoryService categoryService = new CategoryServiceImpl();
			List<Category> list = categoryService.getAllCats();
			
			jsonStr = JSONArray.fromObject(list).toString();
			jedis.set("allCats", jsonStr);
			response.setContentType("application/json charSet=utf-8");
			response.getWriter().print(jsonStr);
		}else {
			response.setContentType("application/json charSet=utf-8");
			response.getWriter().print(jsonStr);
		}
		jedis.close();
		return null;
	}

}
