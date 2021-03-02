package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
    * 订单支付完成后，系统需对该订单进行后续处理，如减库存等。处理完成后，删除此表中的订单记录
    */
@TableName(value = "itrip_trade_ends")
public class ItripTradeEnds {
    /**
     * 订单ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 订单编号(注意非支付宝交易编号tradeNo)
     */
    @TableField(value = "order_no")
    private String orderNo;

    /**
     * 标识字段(默认0：未处理；1：处理中)
     */
    @TableField(value = "flag")
    private Boolean flag;

    /**
     * 逻辑删除（0:未删除；1：删除）
     */
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /**
     * 获取订单ID
     *
     * @return id - 订单ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置订单ID
     *
     * @param id 订单ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取订单编号(注意非支付宝交易编号tradeNo)
     *
     * @return order_no - 订单编号(注意非支付宝交易编号tradeNo)
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号(注意非支付宝交易编号tradeNo)
     *
     * @param orderNo 订单编号(注意非支付宝交易编号tradeNo)
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取标识字段(默认0：未处理；1：处理中)
     *
     * @return flag - 标识字段(默认0：未处理；1：处理中)
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * 设置标识字段(默认0：未处理；1：处理中)
     *
     * @param flag 标识字段(默认0：未处理；1：处理中)
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    /**
     * 获取逻辑删除（0:未删除；1：删除）
     *
     * @return is_deleted - 逻辑删除（0:未删除；1：删除）
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置逻辑删除（0:未删除；1：删除）
     *
     * @param isDeleted 逻辑删除（0:未删除；1：删除）
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}