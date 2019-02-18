package controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import model.Comment;
import model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PostMapping("/product/addComment")
	public String addComment(HttpServletRequest request) {

		System.out.println(request.getParameter("userName"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("messageHeading"));
		System.out.println(request.getParameter("message"));
		System.out.println(request.getParameter("star"));
		System.out.println(request.getParameter("productId"));

		Comment comment = new Comment();

		comment.setDate(new Date());
		comment.setUserName(request.getParameter("userName"));
		comment.setEmail(request.getParameter("email"));
		comment.setMessageHeading(request.getParameter("messageHeading"));
		comment.setMessage(request.getParameter("message"));
		comment.setStar(Integer.getInteger(request.getParameter("star")));
		comment.setProductId(Integer.valueOf(request.getParameter("productId")));

		System.out.println(comment.getProductId());

		int result = commentService.insertComment(comment);

		System.out.println(result);

		return "redirect:/product/" + request.getParameter("productId");

	}

}
