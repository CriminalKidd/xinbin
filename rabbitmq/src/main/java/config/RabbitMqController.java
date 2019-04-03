package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  mq 需要下载 这个服务 rabbitmq_server-3.7.4
 *  启动服务然后mq的消息就能存放在消息队列里面
 *  用cmd 启动
 *  1：启动：rabbitmq-service start
	2：停止：rabbitmq-service stop
 * @author chenxb
 *
 */
@RestController
public class RabbitMqController {

	
	@Autowired
	RabbitMqSender sender;
	
	@RequestMapping("/testMq")
	public String getMq() {
		
		sender.send();
		
		return "Success";
	}
	
}
