package com.sedlarski.notification;

import com.sedlarski.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository repository;

    public void send(NotificationRequest notificationRequest) {
        repository.save(Notification.builder()
                .toCustomerId(notificationRequest.toCustomerId())
                .toCustomerEmail(notificationRequest.toCustomerEmail())
                .sender("SedApp")
                .message(notificationRequest.message())
                .sentAt(LocalDateTime.now())
                .build()
        );
    }
}
