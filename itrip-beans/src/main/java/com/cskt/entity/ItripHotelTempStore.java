package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
    * 实时库存表
    */
@TableName(value = "itrip_hotel_temp_store")
public class ItripHotelTempStore {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "hotel_id")
    private Integer hotelId;

    /**
     * 商品id
     */
    @TableField(value = "room_id")
    private Long roomId;

    /**
     * 记录时间
     */
    @TableField(value = "record_date")
    private Date recordDate;

    /**
     * 库存
     */
    @TableField(value = "store")
    private Integer store;

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
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return hotel_id
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * @param hotelId
     */
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * 获取商品id
     *
     * @return room_id - 商品id
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * 设置商品id
     *
     * @param roomId 商品id
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取记录时间
     *
     * @return record_date - 记录时间
     */
    public Date getRecordDate() {
        return recordDate;
    }

    /**
     * 设置记录时间
     *
     * @param recordDate 记录时间
     */
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    /**
     * 获取库存
     *
     * @return store - 库存
     */
    public Integer getStore() {
        return store;
    }

    /**
     * 设置库存
     *
     * @param store 库存
     */
    public void setStore(Integer store) {
        this.store = store;
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