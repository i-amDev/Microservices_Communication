package com.learning.consumer_service.webClient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/consumer/webClient")
@RequiredArgsConstructor
public class WebClientController {

    private final WebClient webClient;

    @GetMapping("/getInstance")
    public Mono<String> getInstance() {
        Mono<String> response = webClient.get()
                .uri("http://localhost:8081/instance")
                .retrieve()
                .bodyToMono(String.class);
        return response;
    }
}
