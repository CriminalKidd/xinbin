package config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqSender {

	@Autowired
    private AmqpTemplate rabbitTemplate;

	
    public void send() {
        
    	String str="Hello MQ";
    	Map<String, String> map=new HashMap<String, String>();
    	map.put("a", "1");
    	map.put("b", "2");
    	map.put("c", "3");
    	map.put("d", "4");
    	
        System.out.println("Sender : " + map);
        this.rabbitTemplate.convertAndSend("demo", map);
    }
    
}
