package dao;

import java.util.List;

import model.Product;

public interface ProductDAO {

	public List<Product> getAllProduct();

	public List<Product> getProductByCategory(String category);

	public Product getProductById(Integer id);

	public int insertProduct(Product product);

	public int deleteProduct(Product product);

	public int updateProduct(Product product);

}
