package config.service.impl;


import com.alibaba.dubbo.config.annotation.Service;

import config.service.DemoService;

/**
 * ע��service һ����dubbo��jar��
 * @author chenxb
 *
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

	public void testDubbo() {
		System.out.println("��һ��dubbo����");
	}

}
