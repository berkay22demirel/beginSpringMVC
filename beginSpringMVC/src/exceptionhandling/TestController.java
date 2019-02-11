package exceptionhandling;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/exception")
public class TestController {

	@GetMapping(value = "/sql")
	String throwSQLException() throws SQLException {
		System.out.println("SQLException....");
		throw new SQLException();
	}

	@GetMapping(value = "/indexoutofbounds")
	String throwIndexOutOfBoundsException() {
		System.out.println("IndexOutOfBoundsException....");
		throw new IndexOutOfBoundsException();
	}

}
