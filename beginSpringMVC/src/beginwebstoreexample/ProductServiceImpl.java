package beginwebstoreexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	@Override
	public List<Product> getAllProducts() {

		return productDAO.getAllProducts();

	}

	@Override
	public Product getProductById(int id) {

		return productDAO.getProductById(id);

	}

	@Override
	public List<Product> getProductsByCategory(String category) {

		return productDAO.getProductsByCategory(category);

	}

	@Override
	public List<Product> getProductsByBrands(List<String> brands) {

		return productDAO.getProductsByBrands(brands);

	}

}
