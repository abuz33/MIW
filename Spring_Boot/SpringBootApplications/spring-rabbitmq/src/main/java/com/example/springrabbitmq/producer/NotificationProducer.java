package com.example.springrabbitmq.producer;

import com.example.springrabbitmq.model.Notification;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.UUID;

@Service
public class NotificationProducer {

    @Value("${sr.rabbit.routing.name}")
    private String routingName;

    @Value("${sr.rabbit.exchange.name}")
    private String exchangeName;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void init() {
        for (int i = 0; i < 20; i++) {
            Notification notification = new Notification();
            notification.setId(UUID.randomUUID().toString());
            notification.setCreatedAt(new Date());
            notification.setMessage("Welcome Welcome");
            notification.setSeen(Boolean.FALSE);

            sendToQueue(notification);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendToQueue(Notification notification) {
        System.out.println("Notification Sent: " + notification.getId());
        rabbitTemplate.convertAndSend(exchangeName, routingName, notification);
    }
}
