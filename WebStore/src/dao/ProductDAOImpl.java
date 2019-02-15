package dao;

import java.util.ArrayList;
import java.util.List;

import model.Product;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Override
	public List<Product> getAllProduct() {
		Product product = new Product();

		product.setName("deneme123");

		List<Product> products = new ArrayList<>();
		products.add(product);

		return products;
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

}
