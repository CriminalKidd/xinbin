package bin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bin.service.DemoConsumerService;

@RestController
public class DubboConsumerController {

	@Autowired
	DemoConsumerService service;
	
	@RequestMapping(value="/dubbo",method=RequestMethod.GET)
	public void getDubbo() {
		service.getDubboConsumer();
	}
}
