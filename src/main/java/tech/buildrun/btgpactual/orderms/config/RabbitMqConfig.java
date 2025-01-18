package tech.buildrun.btgpactual.orderms.config;

import org.springframework.amqp.core.Declarable;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {
    public static final String ORDER_CREATED_QUEUE = "btg-pactual-order-created"; // Nome da fila que receberá as mensagens de criação de pedidos. Consumida pelo Rabbitmq

    @Bean
    public Jackson2JsonMessageConverter jackson2JsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public Declarable orderCretedQueue() {
        return new Queue(ORDER_CREATED_QUEUE);
    }
}
