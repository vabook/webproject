package top.vabook.service.impl;

import java.util.List;

import top.vabook.dao.impl.ProductDaoImpl;
import top.vabook.domain.Product;
import top.vabook.service.ProductService;
import top.vabook.dao.ProductDao;
/**
* @author vabook@163.com
* 
*
*/
public class ProductServiceImpl implements ProductService {

	ProductDao ProductDao=new ProductDaoImpl();
	@Override
	public List<Product> findHots() throws Exception {
		return ProductDao.findHots();
	}

	@Override
	public List<Product> findNews() throws Exception {
		return ProductDao.findNews();
	}

	@Override
	public Product findProductByPid(String pid) throws Exception {
		return ProductDao.findProductByPid(pid);
	}

}
