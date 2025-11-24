package com.learning.consumer_service.httpInterface;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer/httpInterface")
@RequiredArgsConstructor
public class HttpInterfaceController {

    private final HttpInterfaceProvider httpInterfaceProvider;

    @GetMapping("/getInstance")
    public String getInstance() {
        return httpInterfaceProvider.getInstance();
    }

}
