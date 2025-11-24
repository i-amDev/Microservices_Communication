package com.learning.consumer_service.restTemplate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
@RequiredArgsConstructor
public class RestTemplateController {

    private final RestTemplate restTemplate;

    @GetMapping("/getInstance")
    public String getInstance() {
        String response = restTemplate.getForObject("http://localhost:8081/instance", String.class);
        return response;
    }

}
