package com.learning.consumer_service.httpInterface;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface HttpInterfaceProvider {

    @GetExchange("/instance")
    String getInstance();
}
