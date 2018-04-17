package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

	@Autowired
	FeignClientService service;
	
	@RequestMapping(value="/testFeign",method=RequestMethod.GET)
	public void test() {
		
		String s = service.getStr();
		System.out.println(s);
	}
}
