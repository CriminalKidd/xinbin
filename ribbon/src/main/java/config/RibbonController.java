package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

	@Autowired
	RestTemplate rt;
	
	/**
	 * RestTemplate 在启动app类里面添加注解@loadBalance，然后使用RestTemplate去调用两个application name相同的应用，
	 * 从而实现软负载均衡
	 * @return
	 */
	@RequestMapping(value="/testRibbon" , method=RequestMethod.GET)
	public String getRibbon() {
		return rt.getForEntity("http://ribbon-consumer/testRibbon", String.class).getBody();
	}
	
}
