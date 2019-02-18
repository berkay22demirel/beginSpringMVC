package controller;

import model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.CommentService;
import service.ProductService;

@Controller
@RequestMapping
public class GeneralController {
	
	@Autowired
	ProductService productService;
	@Autowired
	CommentService commentService;

	@GetMapping
	public ModelAndView get() {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("products", productService.getAllProduct());
		modelAndView.setViewName("/home");
		return modelAndView;

	}

	@GetMapping("/product/{id}")
	public ModelAndView getProduct(@PathVariable("id") int id) {

		ModelAndView modelAndView = new ModelAndView();

		Product product = productService.getProductById(id);

		modelAndView.addObject("product", product);
		modelAndView.setViewName("/product");
		return modelAndView;

	}

}
