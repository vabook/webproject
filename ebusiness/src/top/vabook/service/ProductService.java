package top.vabook.service;

import java.util.List;

import top.vabook.domain.Product;

/**
* @author vabook@163.com
* 
*
*/
public interface ProductService {
	List<Product> findHots()throws Exception;

	List<Product> findNews()throws Exception;

	Product findProductByPid(String pid)throws Exception;
}
