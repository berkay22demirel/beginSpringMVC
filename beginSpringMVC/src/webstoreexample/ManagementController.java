package webstoreexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/management")
public class ManagementController {

	@Autowired
	private ProductService productService;

	@GetMapping(value = "/product")
	public String getProduct(@ModelAttribute("newProduct") Product product) {

		product.setDescription("Please insert a description!");

		return "/productAdd";

	}

	@PostMapping(value = "/product")
	public String addProduct(@ModelAttribute("newProduct") Product product) {

		productService.addProduct(product);
		return "redirect:/products";

	}

	@ModelAttribute("manufacturerList")
	public List<String> prepareManufacturerList() {

		return productService.getManufacturerList();
	}

	@ModelAttribute("categoryList")
	public List<String> prepareCategoryList() {
		return productService.getCategoryList();
	}

}
