package webstoreexample;

import java.util.List;

public interface ProductService {

	public List<Product> getAllProducts();

	public Product getProductById(int id);

	public List<Product> getProductsByCategory(String category);

	public List<Product> getProductsByBrands(List<String> brands);

	public int addProduct(Product product);

	public List<String> getManufacturerList();

	public List<String> getCategoryList();

}
