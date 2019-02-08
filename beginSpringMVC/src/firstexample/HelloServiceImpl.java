package firstexample;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String getMessage() {
		
		return "Welcome berkay22demirel.com";
		
	}

}
