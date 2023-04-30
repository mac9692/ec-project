package com.plateer.ec.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @GetMapping("orderMain")
    public String getOrderMain() {
        return "getOrderMain";
    }
}
