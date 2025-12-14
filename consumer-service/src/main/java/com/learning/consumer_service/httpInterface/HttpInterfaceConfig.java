package com.learning.consumer_service.httpInterface;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class HttpInterfaceConfig {

    @Bean
    @LoadBalanced
    public WebClient.Builder builder() {
        return WebClient.builder();
    }

    @Bean
    public HttpInterfaceProvider webClientHttpInterface(WebClient.Builder builder) {
        WebClient webClient = builder.baseUrl("http://producer-service").build();
        WebClientAdapter webClientAdapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory.builderFor(webClientAdapter).build();
        HttpInterfaceProvider httpInterfaceProvider = httpServiceProxyFactory.createClient(HttpInterfaceProvider.class);

        return httpInterfaceProvider;
    }
}
