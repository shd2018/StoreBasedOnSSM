package com.store.service;



public interface EvaluationService {

    //根据用户id和商品id插入评价
    void insertByUserId(String content,Integer userId,Integer productId);
}