package com.learning.producer_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class InstanceController {

    @Value("${server.port}")
    private String port;

    private final String instanceID = UUID.randomUUID().toString();

    @GetMapping("/instance")
    public String getInstanceInfo() {
        System.out.println("Producer called!!");
        return "Request received at instance running on port : " + port + " with Instance ID as " + instanceID;
    }
}
