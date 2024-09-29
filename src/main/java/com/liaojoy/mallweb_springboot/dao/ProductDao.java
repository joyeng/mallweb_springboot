package com.liaojoy.mallweb_springboot.dao;

import com.liaojoy.mallweb_springboot.dto.ProductRequest;
import com.liaojoy.mallweb_springboot.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
