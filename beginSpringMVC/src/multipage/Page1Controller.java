package multipage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page1Controller {

	@GetMapping(value = "/page1")
	public String hello(ModelMap model) {

		model.addAttribute("message", "Welcome Page1");

		return "/page1";

	}

}
