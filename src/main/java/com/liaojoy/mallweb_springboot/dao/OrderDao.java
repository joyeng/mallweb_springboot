package com.liaojoy.mallweb_springboot.dao;

import com.liaojoy.mallweb_springboot.dto.CreateOrderRequest;
import com.liaojoy.mallweb_springboot.model.Order;
import com.liaojoy.mallweb_springboot.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
