package com.liaojoy.mallweb_springboot.dao;

import com.liaojoy.mallweb_springboot.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
