package com.yq.mybatis.dao;

import com.yq.mybatis.pojo.Order;
import com.yq.mybatis.pojo.OrderUser;
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
     * 根据订单号查询订单用户的信息（一对一）
     * @param number
     * @return
     */
    Order queryOrderWithUserByOrderNumber(@Param("number") String number);

    /**
     * 根据订单号查询订单用户的信息及订单详情（一对多）
     * @param number
     * @return
     */
    Order queryOrderWithUserAndDetailByOrderNumber(@Param("number") String number);

    /**
     * 根据订单号查询订单用户的信息及订单详情及订单详情对应的商品信息(多对多)
     * @param number
     * @return
     */
    Order queryOrderWithUserAndDetailItemByOrderNumber(@Param("number") String number);

    /**
     * 延迟加载
     * @param number
     * @return
     */
    Order queryOrderWithUserAndDetailItemByOrderNumberLazy(@Param("number") String number);
}
