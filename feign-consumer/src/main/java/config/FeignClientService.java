package config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="feign-provider")
public interface FeignClientService {

	@RequestMapping(value="/testProvider",method=RequestMethod.GET)
	public String getStr();
}
