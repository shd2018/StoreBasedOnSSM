package com.store.service;

import com.store.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> commodityPaging(Integer storeId,int page,int pageSize);

    List<Product> selectByStoreId(Integer storeId);

    Product selectById(Integer id);

    List<Product> getProductsByCategoryId(int categoryId);

    int insertProduct(Product product);

    int deleteProductById(int id);

    int updateProduct(Product product);

    List<Product> getProductsType();

    int getAllProductNum();

    List<Product> getAllProduct(int page,int pageSize);

    List<Product> getProductBycategoryId(int categoryId);



}
