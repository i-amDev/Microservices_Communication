package com.learning.consumer_service.openFeign;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer/feign")
@RequiredArgsConstructor
public class FeignController {

    private final OpenFeignClient openFeignClient;

    @GetMapping("/getInstance")
    public String getInstanceInfo() {
        return openFeignClient.getInstance();
    }

}
