package exceptionhandling;

import java.sql.SQLDataException;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlingController {
	
	@ExceptionHandler({SQLException.class, SQLDataException.class})
	public ModelAndView handleGenericSQLException(Exception exception) {
		System.out.println("handleGenericSQLException...");
		System.out.println(exception.getMessage());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message",
						"Belirtilen ürün bulunamadı! Lütfen başka bir ürün deneyiniz...");
		modelAndView.setViewName("/sqlexception");
		return modelAndView;
	}

	@ExceptionHandler({IndexOutOfBoundsException.class})
	public ModelAndView handleGenericIndexOutOfBoundsException(Exception exception) {
		System.out.println("handleGenericIndexOutOfBoundsException...");
		System.out.println(exception.getMessage());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message",
				"Beklenmedik bir hata oluştu! Lütfen tekrar deneyiniz...");
		modelAndView.setViewName("/indexoutofboundsexception");
		return modelAndView;
	}

}
