package com.store.service;

import com.store.entity.Store;

import java.util.List;

public interface StoreService {

    Store selectByPrimaryKey(Integer id);
    //获取所有店铺
    List<Store> getAllStore();
    //删除店铺
    void deleteStoreById(int id);
    //修改店铺状态
    void changeStoreStatus(int id,int status);
}
