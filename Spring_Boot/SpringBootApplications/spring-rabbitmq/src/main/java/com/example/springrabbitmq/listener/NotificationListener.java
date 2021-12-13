package com.example.springrabbitmq.listener;

import com.example.springrabbitmq.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {
    @Value("${sr.rabbit.queue.name}")
    private String queueName;


    @RabbitListener(queues = "try-this-queue")
    public void handleNotification(Notification notification) {
        System.out.println("Message Received");
        System.out.println(notification.toString());
    }
}
