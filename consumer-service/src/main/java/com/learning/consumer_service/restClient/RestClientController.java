package com.learning.consumer_service.restClient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/consumer/restClient")
@RequiredArgsConstructor
public class RestClientController {

    private final RestClient restClient;

    @GetMapping("/getInstance")
    public String getInstance() {
        String response = restClient.get()
                .uri("http://localhost:8081/instance")
                .retrieve()
                .body(String.class);

        return response;
    }
}
