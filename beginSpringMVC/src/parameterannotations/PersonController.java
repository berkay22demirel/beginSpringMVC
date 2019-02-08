package parameterannotations;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "/person")
@Controller
public class PersonController {

	// http://localhost:8080/beginSpringMVC/person/pathVariable/get/105

	@GetMapping(value = "/pathVariable/get/{id}")
	public ModelAndView getPersonById(@PathVariable("id") int id,
			ModelAndView modelAndView) {

		modelAndView.addObject("person", new Integer(id));
		modelAndView.setViewName("/person");

		return modelAndView;

	}

	// http://localhost:8080/beginSpringMVC/person/pathVariable/get2/5/10/1995

	@GetMapping(value = "/pathVariable/get2/{day}/{month}/{year}")
	public ModelAndView getPersonsByBirthDate(@PathVariable int day,
			@PathVariable int month, @PathVariable int year,
			ModelAndView modelAndView) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day);
		Date birthDate = calendar.getTime();

		modelAndView.addObject("person", birthDate);
		modelAndView.setViewName("/person");

		return modelAndView;

	}
	
	// http://localhost:8080/beginSpringMVC/person/requestParam/get?id=5

	@GetMapping(value = "/requestParam/get")
	public ModelAndView getPersonById2(@RequestParam("id") int id,
			ModelAndView modelAndView) {

		modelAndView.addObject("person", new Integer(id));
		modelAndView.setViewName("/person");

		return modelAndView;

	}

	// http://localhost:8080/beginSpringMVC/person/requestParam/get2?day=5&month=3&year=1995

	@GetMapping(value = "/requestParam/get2")
	public ModelAndView getPersonsByBirthDate2(@RequestParam("day") int day,
			@RequestParam("month") int month, @RequestParam("year") int year,
			ModelAndView modelAndView) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day);
		Date birthDate = calendar.getTime();

		modelAndView.addObject("person", birthDate);
		modelAndView.setViewName("/person");

		return modelAndView;

	}
	
	// http://localhost:8080/beginSpringMVC/person/matrixParam/get/citys=istanbul,edirne

	@GetMapping(value = "/matrixParam/get/{citys}")
	public ModelAndView getList(
			@MatrixVariable(pathVar = "citys") List<String> citys,
			ModelAndView modelAndView) {

		modelAndView.addObject("person", citys);
		modelAndView.setViewName("/person");

		return modelAndView;

	}

}
