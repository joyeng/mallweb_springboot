package com.liaojoy.mallweb_springboot.service;

import com.liaojoy.mallweb_springboot.dto.ProductQueryParams;
import com.liaojoy.mallweb_springboot.dto.ProductRequest;
import com.liaojoy.mallweb_springboot.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
