package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
    * 订单表
    */
@TableName(value = "itrip_hotel_order")
public class ItripHotelOrder {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
     */
    @TableField(value = "order_type")
    private Integer orderType;

    /**
     * 订单号
     */
    @TableField(value = "order_no")
    private String orderNo;

    /**
     * 交易编号
     */
    @TableField(value = "trade_no")
    private String tradeNo;

    /**
     * 冗余字段 酒店id
     */
    @TableField(value = "hotel_id")
    private Long hotelId;

    /**
     * 冗余字段 酒店名称
     */
    @TableField(value = "hotel_name")
    private String hotelName;

    /**
     * 房间id
     */
    @TableField(value = "room_id")
    private Long roomId;

    /**
     * 消耗数量
     */
    @TableField(value = "count")
    private Integer count;

    /**
     * 预订天数
     */
    @TableField(value = "booking_days")
    private Integer bookingDays;

    /**
     * 入住时间
     */
    @TableField(value = "check_in_date")
    private Date checkInDate;

    /**
     * 退房时间
     */
    @TableField(value = "check_out_date")
    private Date checkOutDate;

    /**
     * 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
     */
    @TableField(value = "order_status")
    private Integer orderStatus;

    /**
     * 支付金额
     */
    @TableField(value = "pay_amount")
    private BigDecimal payAmount;

    /**
     * 支付方式:1:支付宝 2:微信 3:到店付
     */
    @TableField(value = "pay_type")
    private Integer payType;

    /**
     * 联系手机号
     */
    @TableField(value = "notice_phone")
    private String noticePhone;

    /**
     * 联系邮箱
     */
    @TableField(value = "notice_email")
    private String noticeEmail;

    /**
     * 特殊需求
     */
    @TableField(value = "special_requirement")
    private String specialRequirement;

    /**
     * 是否需要发票（0：不需要 1：需要）
     */
    @TableField(value = "is_need_invoice")
    private Integer isNeedInvoice;

    /**
     * 发票类型（0：个人 1：公司）
     */
    @TableField(value = "invoice_type")
    private Integer invoiceType;

    /**
     * 发票抬头
     */
    @TableField(value = "invoice_head")
    private String invoiceHead;

    /**
     * 入住人名称
     */
    @TableField(value = "link_user_name")
    private String linkUserName;

    /**
     * 0:WEB端 1:手机端 2:其他客户端
     */
    @TableField(value = "book_type")
    private Integer bookType;

    /**
     * 预定时间
     */
    @TableField(value = "creation_date")
    private Date creationDate;

    @TableField(value = "created_by")
    private Long createdBy;

    /**
     * 支付完成时间
     */
    @TableField(value = "modify_date")
    private Date modifyDate;

    @TableField(value = "modified_by")
    private Long modifiedBy;

    /**
     * 逻辑删除（0:未删除；1：删除）
     */
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取订单类型(0:旅游产品 1:酒店产品 2：机票产品)
     *
     * @return order_type - 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型(0:旅游产品 1:酒店产品 2：机票产品)
     *
     * @param orderType 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取订单号
     *
     * @return order_no - 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号
     *
     * @param orderNo 订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取交易编号
     *
     * @return trade_no - 交易编号
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 设置交易编号
     *
     * @param tradeNo 交易编号
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * 获取冗余字段 酒店id
     *
     * @return hotel_id - 冗余字段 酒店id
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * 设置冗余字段 酒店id
     *
     * @param hotelId 冗余字段 酒店id
     */
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * 获取冗余字段 酒店名称
     *
     * @return hotel_name - 冗余字段 酒店名称
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置冗余字段 酒店名称
     *
     * @param hotelName 冗余字段 酒店名称
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * 获取房间id
     *
     * @return room_id - 房间id
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * 设置房间id
     *
     * @param roomId 房间id
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取消耗数量
     *
     * @return count - 消耗数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置消耗数量
     *
     * @param count 消耗数量
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 获取预订天数
     *
     * @return booking_days - 预订天数
     */
    public Integer getBookingDays() {
        return bookingDays;
    }

    /**
     * 设置预订天数
     *
     * @param bookingDays 预订天数
     */
    public void setBookingDays(Integer bookingDays) {
        this.bookingDays = bookingDays;
    }

    /**
     * 获取入住时间
     *
     * @return check_in_date - 入住时间
     */
    public Date getCheckInDate() {
        return checkInDate;
    }

    /**
     * 设置入住时间
     *
     * @param checkInDate 入住时间
     */
    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    /**
     * 获取退房时间
     *
     * @return check_out_date - 退房时间
     */
    public Date getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * 设置退房时间
     *
     * @param checkOutDate 退房时间
     */
    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    /**
     * 获取订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
     *
     * @return order_status - 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
     *
     * @param orderStatus 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取支付金额
     *
     * @return pay_amount - 支付金额
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * 设置支付金额
     *
     * @param payAmount 支付金额
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 获取支付方式:1:支付宝 2:微信 3:到店付
     *
     * @return pay_type - 支付方式:1:支付宝 2:微信 3:到店付
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置支付方式:1:支付宝 2:微信 3:到店付
     *
     * @param payType 支付方式:1:支付宝 2:微信 3:到店付
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取联系手机号
     *
     * @return notice_phone - 联系手机号
     */
    public String getNoticePhone() {
        return noticePhone;
    }

    /**
     * 设置联系手机号
     *
     * @param noticePhone 联系手机号
     */
    public void setNoticePhone(String noticePhone) {
        this.noticePhone = noticePhone;
    }

    /**
     * 获取联系邮箱
     *
     * @return notice_email - 联系邮箱
     */
    public String getNoticeEmail() {
        return noticeEmail;
    }

    /**
     * 设置联系邮箱
     *
     * @param noticeEmail 联系邮箱
     */
    public void setNoticeEmail(String noticeEmail) {
        this.noticeEmail = noticeEmail;
    }

    /**
     * 获取特殊需求
     *
     * @return special_requirement - 特殊需求
     */
    public String getSpecialRequirement() {
        return specialRequirement;
    }

    /**
     * 设置特殊需求
     *
     * @param specialRequirement 特殊需求
     */
    public void setSpecialRequirement(String specialRequirement) {
        this.specialRequirement = specialRequirement;
    }

    /**
     * 获取是否需要发票（0：不需要 1：需要）
     *
     * @return is_need_invoice - 是否需要发票（0：不需要 1：需要）
     */
    public Integer getIsNeedInvoice() {
        return isNeedInvoice;
    }

    /**
     * 设置是否需要发票（0：不需要 1：需要）
     *
     * @param isNeedInvoice 是否需要发票（0：不需要 1：需要）
     */
    public void setIsNeedInvoice(Integer isNeedInvoice) {
        this.isNeedInvoice = isNeedInvoice;
    }

    /**
     * 获取发票类型（0：个人 1：公司）
     *
     * @return invoice_type - 发票类型（0：个人 1：公司）
     */
    public Integer getInvoiceType() {
        return invoiceType;
    }

    /**
     * 设置发票类型（0：个人 1：公司）
     *
     * @param invoiceType 发票类型（0：个人 1：公司）
     */
    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * 获取发票抬头
     *
     * @return invoice_head - 发票抬头
     */
    public String getInvoiceHead() {
        return invoiceHead;
    }

    /**
     * 设置发票抬头
     *
     * @param invoiceHead 发票抬头
     */
    public void setInvoiceHead(String invoiceHead) {
        this.invoiceHead = invoiceHead;
    }

    /**
     * 获取入住人名称
     *
     * @return link_user_name - 入住人名称
     */
    public String getLinkUserName() {
        return linkUserName;
    }

    /**
     * 设置入住人名称
     *
     * @param linkUserName 入住人名称
     */
    public void setLinkUserName(String linkUserName) {
        this.linkUserName = linkUserName;
    }

    /**
     * 获取0:WEB端 1:手机端 2:其他客户端
     *
     * @return book_type - 0:WEB端 1:手机端 2:其他客户端
     */
    public Integer getBookType() {
        return bookType;
    }

    /**
     * 设置0:WEB端 1:手机端 2:其他客户端
     *
     * @param bookType 0:WEB端 1:手机端 2:其他客户端
     */
    public void setBookType(Integer bookType) {
        this.bookType = bookType;
    }

    /**
     * 获取预定时间
     *
     * @return creation_date - 预定时间
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * 设置预定时间
     *
     * @param creationDate 预定时间
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return created_by
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取支付完成时间
     *
     * @return modify_date - 支付完成时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 设置支付完成时间
     *
     * @param modifyDate 支付完成时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return modified_by
     */
    public Long getModifiedBy() {
        return modifiedBy;
    }

    /**
     * @param modifiedBy
     */
    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
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