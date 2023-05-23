package com.company;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public NotificationService(){
        System.out.println("Constructor NotificationService");
    }

    public void imprimirSaludo(){
        System.out.println("Saludos");
    }
}
