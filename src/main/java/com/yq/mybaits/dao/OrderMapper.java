package com.yq.mybaits.dao;

import com.yq.mybaits.pojo.Order;
import com.yq.mybaits.pojo.OrderUser;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     * 一对一查询用例
     * 通过订单号查询用户下单信息
     * @param number
     * @return
     */
    OrderUser queryOrderUserByOrderNumber(@Param("number") String number);

    /**
     * 根据订单号查询订单用户的信息
     * @param number
     * @return
     */
    Order queryOrderWithUserByOrderNumber(@Param("number") String number);

    /**
     * 根据订单号查询订单用户的信息及订单详情
     * @param number
     * @return
     */
    Order queryOrderWithUserAndDetailByOrderNumber(@Param("number") String number);
}
