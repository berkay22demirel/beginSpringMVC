package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Comment;
import model.Product;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	public static List<Product> products = new ArrayList<>();

	static {

		Product product = new Product();
		List<Comment> comments = new ArrayList<>();
		Product product2 = new Product();
		List<Comment> comments2 = new ArrayList<>();
		Product product3 = new Product();
		List<Comment> comments3 = new ArrayList<>();
		Product product4 = new Product();
		List<Comment> comments4 = new ArrayList<>();
		Product product5 = new Product();
		List<Comment> comments5 = new ArrayList<>();
		Product product6 = new Product();
		List<Comment> comments6 = new ArrayList<>();

		product.setId(1);
		product.setName("Dell Laptop");
		product.setPrice(555.92);
		product.setListPrice(623.92);
		product.setVisual("delllaptop.jpg");

		product2.setId(2);
		product2.setName("Macbook Air");
		product2.setPrice(555.92);
		product2.setListPrice(623.92);
		product2.setVisual("macbookair.png");

		product3.setId(3);
		product3.setName("Hp Laptop");
		product3.setPrice(555.92);
		product3.setListPrice(623.92);
		product3.setVisual("hplaptop.jpeg");

		product4.setId(4);
		product4.setName("Lenovo Laptop");
		product4.setPrice(555.92);
		product4.setListPrice(623.92);
		product4.setVisual("lenovolaptop.jpeg");

		product5.setId(5);
		product5.setName("Macbook Pro");
		product5.setPrice(555.92);
		product5.setListPrice(623.92);
		product5.setVisual("macbookpro.jpeg");

		product6.setId(6);
		product6.setName("Macbook Air");
		product6.setPrice(555.92);
		product6.setListPrice(623.92);
		product6.setVisual("macbookair.png");

		Comment comment = new Comment();
		comment.setMessage("deneme denemme denememe mdmemmemdme");
		comment.setUserName("Berkay Demirel");
		comment.setDate(new Date());
		comment.setMessageHeading("DEneme MEsaj Başlığı");

		Comment comment2 = new Comment();
		comment2.setMessage("deneme denemme denememe mdmemmemdme22222");
		comment2.setUserName("Berkay2222Demirel");
		comment2.setDate(new Date());
		comment2.setMessageHeading("DEneme MEsaj Başlığı222");

		comments.add(comment);
		comments.add(comment2);
		comments2.add(comment);
		comments2.add(comment2);
		comments3.add(comment);
		comments3.add(comment2);
		comments4.add(comment);
		comments4.add(comment2);
		comments5.add(comment);
		comments5.add(comment2);
		comments6.add(comment);
		comments6.add(comment2);

		product.setComments(comments);
		product2.setComments(comments2);
		product3.setComments(comments3);
		product4.setComments(comments4);
		product5.setComments(comments5);
		product6.setComments(comments6);

		products.add(product);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product6);

	}

	@Override
	public List<Product> getAllProduct() {

		return products;
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(Integer id) {

		for (Product product : products) {

			if (product.getId().equals(id)) {

				return product;
			}
		}

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
