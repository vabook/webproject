package top.vabook.dao;

import java.sql.SQLException;
import java.util.List;

import top.vabook.domain.Category;

/**
* @author vabook@163.com
* 
*
*/
public interface CategoryDao {
	List<Category> getAllCats() throws SQLException;
}
