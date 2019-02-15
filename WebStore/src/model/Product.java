package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "descripton")
	private String description;
	@Column(name = "category")
	private String category;
	@Column(name = "brand")
	private String brand;
	@Column(name = "price")
	private Double price;
	@Column(name = "listPrice")
	private Double listPrice;
	@Column(name = "stock")
	private Integer stock;
	@Column(name = "stars")
	private Double stars;
	@Column(name = "visual")
	private String visual;
	// FIXME
	private List<Comment> comments;

	public Product() {
		super();
	}

	public Product(Integer id, String name, String description,
			String category, String brand, Double price, Double listPrice,
			Integer stock, Double stars, String visual, List<Comment> comments) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.listPrice = listPrice;
		this.stock = stock;
		this.stars = stars;
		this.visual = visual;
		this.comments = comments;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getListPrice() {
		return listPrice;
	}

	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Double getStars() {
		return stars;
	}

	public void setStars(Double stars) {
		this.stars = stars;
	}

	public String getVisual() {
		return visual;
	}

	public void setVisual(String visual) {
		this.visual = visual;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
