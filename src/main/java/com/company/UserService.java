package com.company;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notification){
        this.notificationService = notification;
    }
}
