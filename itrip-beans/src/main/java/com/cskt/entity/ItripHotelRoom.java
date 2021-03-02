package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
    * 酒店房间表
    */
@TableName(value = "itrip_hotel_room")
public class ItripHotelRoom {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 酒店ID
     */
    @TableField(value = "hotel_id")
    private Long hotelId;

    /**
     * 房间名称
     */
    @TableField(value = "room_title")
    private String roomTitle;

    /**
     * 房间价格
     */
    @TableField(value = "room_price")
    private BigDecimal roomPrice;

    /**
     * 酒店床型
     */
    @TableField(value = "room_bed_type_id")
    private Long roomBedTypeId;

    /**
     * 是否包含早餐
     */
    @TableField(value = "is_having_breakfast")
    private Integer isHavingBreakfast;

    /**
     * 1:在线付 2:到店付 3:不限
     */
    @TableField(value = "pay_type")
    private Integer payType;

    /**
     * 满意度（冗余字段，在用户评论后更新）
     */
    @TableField(value = "satisfaction")
    private Long satisfaction;

    /**
     * 是否可预订(0:不可以 1:可以)
     */
    @TableField(value = "is_book")
    private Integer isBook;

    /**
     * 是否可取消(0:不可 1:可以)
     */
    @TableField(value = "is_cancel")
    private Integer isCancel;

    /**
     * 是否及时响应(0:不及时 1:及时)
     */
    @TableField(value = "is_timely_response")
    private Integer isTimelyResponse;

    @TableField(value = "creation_date")
    private Date creationDate;

    @TableField(value = "created_by")
    private Long createdBy;

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
     * 获取酒店ID
     *
     * @return hotel_id - 酒店ID
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * 设置酒店ID
     *
     * @param hotelId 酒店ID
     */
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * 获取房间名称
     *
     * @return room_title - 房间名称
     */
    public String getRoomTitle() {
        return roomTitle;
    }

    /**
     * 设置房间名称
     *
     * @param roomTitle 房间名称
     */
    public void setRoomTitle(String roomTitle) {
        this.roomTitle = roomTitle;
    }

    /**
     * 获取房间价格
     *
     * @return room_price - 房间价格
     */
    public BigDecimal getRoomPrice() {
        return roomPrice;
    }

    /**
     * 设置房间价格
     *
     * @param roomPrice 房间价格
     */
    public void setRoomPrice(BigDecimal roomPrice) {
        this.roomPrice = roomPrice;
    }

    /**
     * 获取酒店床型
     *
     * @return room_bed_type_id - 酒店床型
     */
    public Long getRoomBedTypeId() {
        return roomBedTypeId;
    }

    /**
     * 设置酒店床型
     *
     * @param roomBedTypeId 酒店床型
     */
    public void setRoomBedTypeId(Long roomBedTypeId) {
        this.roomBedTypeId = roomBedTypeId;
    }

    /**
     * 获取是否包含早餐
     *
     * @return is_having_breakfast - 是否包含早餐
     */
    public Integer getIsHavingBreakfast() {
        return isHavingBreakfast;
    }

    /**
     * 设置是否包含早餐
     *
     * @param isHavingBreakfast 是否包含早餐
     */
    public void setIsHavingBreakfast(Integer isHavingBreakfast) {
        this.isHavingBreakfast = isHavingBreakfast;
    }

    /**
     * 获取1:在线付 2:到店付 3:不限
     *
     * @return pay_type - 1:在线付 2:到店付 3:不限
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置1:在线付 2:到店付 3:不限
     *
     * @param payType 1:在线付 2:到店付 3:不限
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取满意度（冗余字段，在用户评论后更新）
     *
     * @return satisfaction - 满意度（冗余字段，在用户评论后更新）
     */
    public Long getSatisfaction() {
        return satisfaction;
    }

    /**
     * 设置满意度（冗余字段，在用户评论后更新）
     *
     * @param satisfaction 满意度（冗余字段，在用户评论后更新）
     */
    public void setSatisfaction(Long satisfaction) {
        this.satisfaction = satisfaction;
    }

    /**
     * 获取是否可预订(0:不可以 1:可以)
     *
     * @return is_book - 是否可预订(0:不可以 1:可以)
     */
    public Integer getIsBook() {
        return isBook;
    }

    /**
     * 设置是否可预订(0:不可以 1:可以)
     *
     * @param isBook 是否可预订(0:不可以 1:可以)
     */
    public void setIsBook(Integer isBook) {
        this.isBook = isBook;
    }

    /**
     * 获取是否可取消(0:不可 1:可以)
     *
     * @return is_cancel - 是否可取消(0:不可 1:可以)
     */
    public Integer getIsCancel() {
        return isCancel;
    }

    /**
     * 设置是否可取消(0:不可 1:可以)
     *
     * @param isCancel 是否可取消(0:不可 1:可以)
     */
    public void setIsCancel(Integer isCancel) {
        this.isCancel = isCancel;
    }

    /**
     * 获取是否及时响应(0:不及时 1:及时)
     *
     * @return is_timely_response - 是否及时响应(0:不及时 1:及时)
     */
    public Integer getIsTimelyResponse() {
        return isTimelyResponse;
    }

    /**
     * 设置是否及时响应(0:不及时 1:及时)
     *
     * @param isTimelyResponse 是否及时响应(0:不及时 1:及时)
     */
    public void setIsTimelyResponse(Integer isTimelyResponse) {
        this.isTimelyResponse = isTimelyResponse;
    }

    /**
     * @return creation_date
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate
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
     * @return modify_date
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
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