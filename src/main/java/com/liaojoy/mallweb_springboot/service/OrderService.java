package com.liaojoy.mallweb_springboot.service;

import com.liaojoy.mallweb_springboot.dto.CreateOrderRequest;
import com.liaojoy.mallweb_springboot.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
