package top.vabook.service;
/**
* @author vabook@163.com
*
*/

import java.sql.SQLException;
import java.util.List;

import top.vabook.domain.Category;

public interface CategoryService {
	List<Category> getAllCats() throws SQLException;
}
