package jsonview;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import webstoreexample.Product;

@Controller
@RequestMapping(value = "/json")
public class JSONController {

	private static List<Product> products = new ArrayList<>();

	static {

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

		Product ipad = new Product();
		ipad.setId(666666);
		ipad.setName("Apple Ipad");
		ipad.setPrice(499);
		ipad.setDescription("Apple Ipad");
		ipad.setCategory("Tablet");
		ipad.setManufacturer("Apple");
		ipad.setUnitsInStock(300);

		products.add(iphone);
		products.add(sonyXZ1);
		products.add(mac);
		products.add(dell);
		products.add(lenovo);
		products.add(ipad);

	}

	@GetMapping(value = "/get")
	@ResponseBody
	public Product getProduct() {
		
		return products.get(0);
	}

	@GetMapping(value = "/getProducts")
	@ResponseBody
	public List<Product> getProducts() {

		return products;
	}

}
