package beginwebstoreexample;

import java.util.List;

public interface ProductDAO {

	public List<Product> getAllProducts();

	public Product getProductById(int id);

	public List<Product> getProductsByCategory(String category);

	public List<Product> getProductsByBrands(List<String> brands);

}
