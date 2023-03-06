package com.hackerrank.configstyles.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {

    private String serviceName;

    public EmailNotificationService(@Value("${service.name}") String serviceName) {
        this.serviceName = serviceName;
    }

    public ServiceResponse sendNotification(String notification) {
        return new ServiceResponse(serviceName, notification);
    }

}
