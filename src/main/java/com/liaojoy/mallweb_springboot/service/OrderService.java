package com.liaojoy.mallweb_springboot.service;

import com.liaojoy.mallweb_springboot.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
