package top.vabook.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;


import top.vabook.dao.CategoryDao;
import top.vabook.domain.Category;
import top.vabook.util.JDBCUtils;

/**
* @author vabook@163.com
*
*/
public class CategoryDaoImpl implements CategoryDao{

	@Override
	public List<Category> getAllCats() throws SQLException {
		String sql = "select * from category";
		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
		return qr.query(sql, new BeanListHandler<Category>(Category.class));
	}

}
