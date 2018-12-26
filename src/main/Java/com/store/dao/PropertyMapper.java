package com.store.dao;

import com.store.entity.Category;
import com.store.entity.Property;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import java.util.List;

public interface PropertyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Property record);

    int insertSelective(Property record);

    Property selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKey(Property record);

    int getPropertyNumByCategoryId(int id);


    Property getByProductId(int productId);

    void addProperty(@Param("id")int id,@Param("name")String name);

    List<Property> getPropertiesByCategoryId(int categoryId);


    Property getPropertyById(int propertyId);

}