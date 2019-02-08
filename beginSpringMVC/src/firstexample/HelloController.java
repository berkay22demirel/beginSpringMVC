package firstexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(ModelMap model) {

		model.addAttribute("message", helloService.getMessage());

		return "/hello";

	}
	
	

}
