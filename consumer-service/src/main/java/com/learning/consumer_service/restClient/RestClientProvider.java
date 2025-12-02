package com.learning.consumer_service.restClient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class RestClientProvider {

    private final RestClient restClient;

    public String getInstanceInfo() {
        return restClient.get()
                .uri("/instance")
                .retrieve()
                .body(String.class);
    }

}
