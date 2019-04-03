package config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign �ͻ���
 * @author chenxb
 *
 */
@FeignClient(value="feign-provider")//ע�� feign ���õķ�������
public interface FeignClientService {

	@RequestMapping(value="/testProvider",method=RequestMethod.GET)
	public String getStr();
}
