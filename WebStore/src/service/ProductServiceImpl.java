package service;

import java.util.List;

import model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;

	@Override
	public List<Product> getAllProduct() {
		
		return productDAO.getAllProduct();
	}

	@Override
	public List<Product> getProductByCategory(String category) {

		return productDAO.getProductByCategory(category);
	}

	@Override
	public Product getProductById(Integer id) {

		return productDAO.getProductById(id);
	}

	@Override
	public int insertProduct(Product product) {

		return productDAO.insertProduct(product);
	}

	@Override
	public int deleteProduct(Product product) {

		return productDAO.deleteProduct(product);
	}

	@Override
	public int updateProduct(Product product) {

		return productDAO.updateProduct(product);
	}

}
