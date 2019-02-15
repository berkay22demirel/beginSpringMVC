package webstoreexample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	private static final String SELECT_BRANDS = "Select p from Product p where p.manufacturer IN(:brands)";
	private static final String SELECT_CATEGORY = "Select p from Product p where p.category = ?1";
	private static final String SELECT_ALL = "Select p from Product p";
	
	private EntityManager entityManager;
	
	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public List<Product> getAllProducts() {

		TypedQuery<Product> query = entityManager.createQuery(SELECT_ALL, Product.class);
		return query.getResultList();
	}

	@Override
	public Product getProductById(int id) {

		return entityManager.find(Product.class, id);

	}

	@Override
	public List<Product> getProductsByCategory(String category) {

		TypedQuery<Product> query = entityManager.createQuery(SELECT_CATEGORY,
				Product.class).setParameter(1, category);
		return query.getResultList();

	}

	@Override
	public List<Product> getProductsByBrands(List<String> brands) {

		TypedQuery<Product> query = entityManager.createQuery(SELECT_CATEGORY,
				Product.class).setParameter(1, getListToString(brands));
		return query.getResultList();

	}

	@Override
	public void addProduct(Product product) {

		entityManager.getTransaction().begin();
		entityManager.persist(product);
		entityManager.getTransaction().commit();

	}

	@Override
	public List<String> getManufacturerList() {

		List<String> manufacturerList = new ArrayList<>();
		manufacturerList.add("Apple");
		manufacturerList.add("Sony");
		manufacturerList.add("Lenovo");
		manufacturerList.add("Dell");
		return manufacturerList;

	}

	@Override
	public List<String> getCategoryList() {
		
		List<String> categoryList = new ArrayList<>();
		categoryList.add("Phone");
		categoryList.add("Tablet");
		categoryList.add("Laptop");
		
		return categoryList;
	}

	public String getListToString(List<String> list) {
		
		if (list != null && !list.isEmpty()) {
			
			String result = "";
			
			for(String item : list) {
				
				result = "'" + item + "',";

			}
			
			return result.substring(0, result.length() - 1);
			
		}
		
		return "";

	}

}
