package top.vabook.service.impl;

import java.sql.SQLException;
import java.util.List;

import top.vabook.dao.CategoryDao;
import top.vabook.dao.impl.CategoryDaoImpl;
import top.vabook.domain.Category;
import top.vabook.service.CategoryService;

/**
* @author vabook@163.com
* @date 2019��4��30�� ����8:51:43
*
*/
public class CategoryServiceImpl implements CategoryService {

	@Override
	public List<Category> getAllCats() throws SQLException {
		CategoryDao CategoryDao=new CategoryDaoImpl();
		return CategoryDao.getAllCats();
	}

}
