package config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfigTest {

    @Bean
    public Queue Queue() {
        return new Queue("demo");
    }
}
