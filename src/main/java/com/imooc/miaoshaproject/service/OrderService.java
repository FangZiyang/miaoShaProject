package com.imooc.miaoshaproject.service;

import com.imooc.miaoshaproject.error.BusinessException;
import com.imooc.miaoshaproject.service.model.OrderModel;

public interface OrderService {
    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId, Integer amount) throws BusinessException;

}
