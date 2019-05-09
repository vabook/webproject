package top.vabook.dao;
/**
* @author vabook@163.com
* 
*
*/

import java.sql.SQLException;
import java.util.List;

import top.vabook.domain.Product;

public interface ProductDao {
	
	List<Product> findHots() throws SQLException ;
	
	List<Product> findNews() throws SQLException ;
	
	Product findProductByPid(String pid) throws SQLException;
	
}
