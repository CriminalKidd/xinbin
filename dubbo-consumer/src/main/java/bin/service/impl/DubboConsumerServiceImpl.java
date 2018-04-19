package bin.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import bin.service.DemoConsumerService;
import config.service.DemoService;

@Component
public class DubboConsumerServiceImpl implements DemoConsumerService {

	//ע�����������
	@Reference(version="1.0.0")
	DemoService service;
	
	public void getDubboConsumer() {
		service.testDubbo();
	}

}
