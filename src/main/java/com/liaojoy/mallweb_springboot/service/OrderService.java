package com.liaojoy.mallweb_springboot.service;

import com.liaojoy.mallweb_springboot.dto.CreateOrderRequest;
import com.liaojoy.mallweb_springboot.dto.OrderQueryParams;
import com.liaojoy.mallweb_springboot.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
