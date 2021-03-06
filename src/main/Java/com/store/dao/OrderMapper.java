package com.store.dao;

import com.store.entity.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Integer getProductId(Integer order_id);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    int getUsersOrderNum(int userId);

    List<Order> getAllOrders();

    List<Order> selectByProductId(int productId);

    List<Order> selectByUserId(int userId);



}