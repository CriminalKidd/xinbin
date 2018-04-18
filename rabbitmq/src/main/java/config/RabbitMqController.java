package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  mq ��Ҫ���� ������� rabbitmq_server-3.7.4
 *  ��������Ȼ��mq����Ϣ���ܴ������Ϣ��������
 *  ��cmd ����
 *  1��������rabbitmq-service start
	2��ֹͣ��rabbitmq-service stop
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
