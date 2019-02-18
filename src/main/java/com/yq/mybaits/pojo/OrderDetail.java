package com.yq.mybaits.pojo;

import java.text.SimpleDateFormat;

/**
 *
 */
public class OrderDetail {
    private Integer id;
    private Integer orderId;
    private Double totalPrice;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    //重写toString方法，数据展示好看一些。
    @Override
    public String toString(){
        return "OrderDetail{" +
                "id='" + id + '\'' +
                ", orderId='" +orderId + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
