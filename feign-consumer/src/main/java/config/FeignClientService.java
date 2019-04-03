package config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign 客户端
 * @author chenxb
 *
 */
@FeignClient(value="feign-provider")//注明 feign 调用的服务名称
public interface FeignClientService {

	@RequestMapping(value="/testProvider",method=RequestMethod.GET)
	public String getStr();
}
