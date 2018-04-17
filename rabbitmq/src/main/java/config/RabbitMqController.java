package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {

	
	@Autowired
	RabbitMqSender sender;
	
	@RequestMapping("/testMq")
	public String getMq() {
		
		sender.send();
		
		return "Success";
	}
	
}
