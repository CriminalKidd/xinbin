package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class RibbonConsumerTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerTwoApplication.class, args);
	}
	
	 /**
	  * ∏∫‘ÿæ˘∫¨≤‚ ‘¿‡
	  * @return
	  */
	 @RequestMapping(value="/testRibbon" , method=RequestMethod.GET)
	 public String testRibbon() {
		 return "Consumer two success";
	 }
}
