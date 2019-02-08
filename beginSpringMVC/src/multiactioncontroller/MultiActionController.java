package multiactioncontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/multiaction")
public class MultiActionController {

	@GetMapping
	public String get(ModelMap model) {

		model.addAttribute("message", "Home Page");

		return "/multiaction";

	}

	@GetMapping(value = "/add")
	public String add(ModelMap model) {

		model.addAttribute("message", "add");

		return "/multiaction";

	}

	@GetMapping(value = "/delete")
	public String delete(HttpServletRequest request,
			HttpServletResponse response) {

		request.setAttribute("message", "delete");

		return "/multiaction";

	}

	@GetMapping(value = "/update")
	public ModelAndView update(HttpServletRequest request,
			HttpServletResponse response, ModelAndView modelAndView) {

		modelAndView.setViewName("/multiaction");
		modelAndView.addObject("message", "update");

		return modelAndView;

	}

}
