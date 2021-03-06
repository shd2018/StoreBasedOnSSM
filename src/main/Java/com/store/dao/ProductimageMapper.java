package com.store.dao;

import com.store.entity.Productimage;

import java.util.List;

public interface ProductimageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Productimage record);

    int insertSelective(Productimage record);

    Productimage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Productimage record);

    int updateByPrimaryKey(Productimage record);

    List<Productimage> selectImageByProductId(Integer productId);

    List<Productimage> getImagesByProductId(int productId);

    Productimage getImageIdByProductId(Integer productId);
}