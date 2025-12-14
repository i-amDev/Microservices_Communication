package com.learning.consumer_service.openFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "producer-service", url = "http://localhost:8081")
@FeignClient(name = "producer-service")
public interface OpenFeignClient {

    @GetMapping("/instance")
    String getInstance();
}
