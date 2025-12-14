package com.learning.consumer_service.restClient;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer/restClient")
@RequiredArgsConstructor
public class RestClientController {

    @LoadBalanced
    private final RestClientProvider restClientProvider;

//    @GetMapping("/getInstance")
//    public String getInstance() {
//        String response = restClient.get()
//                .uri("http://localhost:8081/instance")
//                .retrieve()
//                .body(String.class);
//
//        return response;
//    }

    @GetMapping("/getInstance")
    public String getInstance() {
        return restClientProvider.getInstanceInfo();
    }
}
