package config.service.impl;


import com.alibaba.dubbo.config.annotation.Service;

import config.service.DemoService;

/**
 * 注意service 一定是dubbo的jar包
 * @author chenxb
 *
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

	public void testDubbo() {
		System.out.println("第一个dubbo服务");
	}

}
