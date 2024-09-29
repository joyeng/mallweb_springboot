package com.liaojoy.mallweb_springboot.service;

import com.liaojoy.mallweb_springboot.constant.ProductCategory;
import com.liaojoy.mallweb_springboot.dto.ProductRequest;
import com.liaojoy.mallweb_springboot.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
