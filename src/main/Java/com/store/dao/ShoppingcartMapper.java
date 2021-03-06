package com.store.dao;

import com.store.entity.Shoppingcart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoppingcartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shoppingcart record);

    int insertSelective(Shoppingcart record);

    Shoppingcart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shoppingcart record);

    int updateByPrimaryKey(Shoppingcart record);

    void addProductToShoppingCart(@Param("id")Integer id, @Param("productId")Integer productId,@Param("userId")Integer userId);

    List<Shoppingcart> selectByUserId(Integer userId);




}