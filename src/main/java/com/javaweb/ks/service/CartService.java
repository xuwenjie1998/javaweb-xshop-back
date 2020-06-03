package com.javaweb.ks.service;

import com.javaweb.ks.result.Results;

public interface CartService {

    // 加入购物车（相当于修改用户商品数量）number为1则加1,为-1则减一
    Results addCart(int shopID, int id, String token, int number);

}
