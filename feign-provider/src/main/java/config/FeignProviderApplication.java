package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient//eureka 客户端注册注解
@RestController
public class FeignProviderApplication {

	 public static void main(String[] args) {
	        SpringApplication.run(FeignProviderApplication.class, args);
	 }
	 
	 @RequestMapping(value="/testProvider" ,method = RequestMethod.GET)
	 public String getProvider() {
		 return "Feign Provider Success";
	 }
}
