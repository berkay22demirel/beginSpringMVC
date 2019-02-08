package beginwebstoreexample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {

	private List<Product> products = new ArrayList<>();

	ProductDAOImpl() {

		Product iphone = new Product();
		iphone.setId(111111);
		iphone.setName("iPhone X");
		iphone.setPrice(1099);
		iphone.setDescription("Apple iPhone X Smartphone");
		iphone.setCategory("Phone");
		iphone.setManufacturer("Apple");
		iphone.setUnitsInStock(1000);

		Product sonyXZ1 = new Product();
		sonyXZ1.setId(222222);
		sonyXZ1.setName("XZ1");
		sonyXZ1.setPrice(599);
		sonyXZ1.setDescription("Sony XZ1 Smartphone");
		sonyXZ1.setCategory("Phone");
		sonyXZ1.setManufacturer("Sony");
		sonyXZ1.setUnitsInStock(500);

		Product mac = new Product();
		mac.setId(333333);
		mac.setName("Macbook Pro");
		mac.setPrice(1299);
		mac.setDescription("Apple Macbook Pro Laptop");
		mac.setCategory("Laptop");
		mac.setManufacturer("Apple");
		mac.setUnitsInStock(1000);

		Product dell = new Product();
		dell.setId(444444);
		dell.setName("Dell XPS13");
		dell.setPrice(799);
		dell.setDescription("Dell XPS13 Laptop");
		dell.setCategory("Laptop");
		dell.setManufacturer("Dell");
		dell.setUnitsInStock(2000);

		Product lenovo = new Product();
		lenovo.setId(555555);
		lenovo.setName("Lenovo Yoga");
		lenovo.setPrice(799);
		lenovo.setDescription("Lenovo Yoga Laptop");
		lenovo.setCategory("Laptop");
		lenovo.setManufacturer("Lenovo");
		lenovo.setUnitsInStock(3000);

		products.add(iphone);
		products.add(sonyXZ1);
		products.add(mac);
		products.add(dell);
		products.add(lenovo);

	}

	@Override
	public List<Product> getAllProducts() {

		return products;
	}

	@Override
	public Product getProductById(int id) {

		for (Product product : products) {

			if (id == product.getId()) {

				return product;
			}

		}

		return null;

	}

	@Override
	public List<Product> getProductsByCategory(String category) {

		List<Product> productsByCategory = new ArrayList<>();

		for (Product product : products) {

			if (product.getCategory().equalsIgnoreCase(category)) {

				productsByCategory.add(product);
			}

		}

		return productsByCategory;

	}

	@Override
	public List<Product> getProductsByBrands(List<String> brands) {

		List<Product> productsByBrand = new ArrayList<>();

		for (Product product : products) {

			for (String brand : brands) {

				if (product.getManufacturer().equalsIgnoreCase(brand)) {

					productsByBrand.add(product);
					break;
				}
			
			}

		}

		return productsByBrand;

	}

}
