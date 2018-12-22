package com.store.dao;

import com.store.entity.Product;
import com.store.entity.ProductKey;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(ProductKey key);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(ProductKey key);

    Product selectById(Integer id);
    
    List<Product> selectByStoreId(Integer storeId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> getProductsByCategoryId(int categoryId);

    List<Product> getProductsType();

    int getProductNumByCategoryId(int id);

    int getProductNumByStoreId(int id);
}