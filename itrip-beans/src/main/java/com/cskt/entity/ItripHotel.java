package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
    * 酒店表
    */
@TableName(value = "itrip_hotel")
public class ItripHotel {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 酒店名称
     */
    @TableField(value = "hotel_name")
    private String hotelName;

    /**
     * 所在国家id
     */
    @TableField(value = "country_id")
    private Long countryId;

    /**
     * 所在省份id
     */
    @TableField(value = "province_id")
    private Long provinceId;

    /**
     * 所在城市id
     */
    @TableField(value = "city_id")
    private Long cityId;

    /**
     * 酒店所在地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 酒店介绍（保存附文本）
     */
    @TableField(value = "details")
    private String details;

    /**
     * 酒店设施
     */
    @TableField(value = "facilities")
    private String facilities;

    /**
     * 酒店政策
     */
    @TableField(value = "hotel_policy")
    private String hotelPolicy;

    /**
     * 酒店类型(1:国内酒店 2:国际酒店)
     */
    @TableField(value = "hotel_type")
    private Integer hotelType;

    /**
     * (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
     */
    @TableField(value = "hotel_level")
    private Integer hotelLevel;

    /**
     * 是否是团购酒店
     */
    @TableField(value = "is_group_purchase")
    private Integer isGroupPurchase;

    /**
     * 城市名称 冗余字段
     */
    @TableField(value = "redundant_city_name")
    private String redundantCityName;

    /**
     * 省名称 冗余字段
     */
    @TableField(value = "redundant_province_name")
    private String redundantProvinceName;

    /**
     * 国家名称 冗余字段
     */
    @TableField(value = "redundant_country_name")
    private String redundantCountryName;

    /**
     * 酒店库存（冗余，每天开定时任务的时候更新）
     */
    @TableField(value = "redundant_hotel_store")
    private Integer redundantHotelStore;

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
     * 获取酒店名称
     *
     * @return hotel_name - 酒店名称
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置酒店名称
     *
     * @param hotelName 酒店名称
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * 获取所在国家id
     *
     * @return country_id - 所在国家id
     */
    public Long getCountryId() {
        return countryId;
    }

    /**
     * 设置所在国家id
     *
     * @param countryId 所在国家id
     */
    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    /**
     * 获取所在省份id
     *
     * @return province_id - 所在省份id
     */
    public Long getProvinceId() {
        return provinceId;
    }

    /**
     * 设置所在省份id
     *
     * @param provinceId 所在省份id
     */
    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取所在城市id
     *
     * @return city_id - 所在城市id
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * 设置所在城市id
     *
     * @param cityId 所在城市id
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取酒店所在地址
     *
     * @return address - 酒店所在地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置酒店所在地址
     *
     * @param address 酒店所在地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取酒店介绍（保存附文本）
     *
     * @return details - 酒店介绍（保存附文本）
     */
    public String getDetails() {
        return details;
    }

    /**
     * 设置酒店介绍（保存附文本）
     *
     * @param details 酒店介绍（保存附文本）
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * 获取酒店设施
     *
     * @return facilities - 酒店设施
     */
    public String getFacilities() {
        return facilities;
    }

    /**
     * 设置酒店设施
     *
     * @param facilities 酒店设施
     */
    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    /**
     * 获取酒店政策
     *
     * @return hotel_policy - 酒店政策
     */
    public String getHotelPolicy() {
        return hotelPolicy;
    }

    /**
     * 设置酒店政策
     *
     * @param hotelPolicy 酒店政策
     */
    public void setHotelPolicy(String hotelPolicy) {
        this.hotelPolicy = hotelPolicy;
    }

    /**
     * 获取酒店类型(1:国内酒店 2:国际酒店)
     *
     * @return hotel_type - 酒店类型(1:国内酒店 2:国际酒店)
     */
    public Integer getHotelType() {
        return hotelType;
    }

    /**
     * 设置酒店类型(1:国内酒店 2:国际酒店)
     *
     * @param hotelType 酒店类型(1:国内酒店 2:国际酒店)
     */
    public void setHotelType(Integer hotelType) {
        this.hotelType = hotelType;
    }

    /**
     * 获取(1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
     *
     * @return hotel_level - (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
     */
    public Integer getHotelLevel() {
        return hotelLevel;
    }

    /**
     * 设置(1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
     *
     * @param hotelLevel (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
     */
    public void setHotelLevel(Integer hotelLevel) {
        this.hotelLevel = hotelLevel;
    }

    /**
     * 获取是否是团购酒店
     *
     * @return is_group_purchase - 是否是团购酒店
     */
    public Integer getIsGroupPurchase() {
        return isGroupPurchase;
    }

    /**
     * 设置是否是团购酒店
     *
     * @param isGroupPurchase 是否是团购酒店
     */
    public void setIsGroupPurchase(Integer isGroupPurchase) {
        this.isGroupPurchase = isGroupPurchase;
    }

    /**
     * 获取城市名称 冗余字段
     *
     * @return redundant_city_name - 城市名称 冗余字段
     */
    public String getRedundantCityName() {
        return redundantCityName;
    }

    /**
     * 设置城市名称 冗余字段
     *
     * @param redundantCityName 城市名称 冗余字段
     */
    public void setRedundantCityName(String redundantCityName) {
        this.redundantCityName = redundantCityName;
    }

    /**
     * 获取省名称 冗余字段
     *
     * @return redundant_province_name - 省名称 冗余字段
     */
    public String getRedundantProvinceName() {
        return redundantProvinceName;
    }

    /**
     * 设置省名称 冗余字段
     *
     * @param redundantProvinceName 省名称 冗余字段
     */
    public void setRedundantProvinceName(String redundantProvinceName) {
        this.redundantProvinceName = redundantProvinceName;
    }

    /**
     * 获取国家名称 冗余字段
     *
     * @return redundant_country_name - 国家名称 冗余字段
     */
    public String getRedundantCountryName() {
        return redundantCountryName;
    }

    /**
     * 设置国家名称 冗余字段
     *
     * @param redundantCountryName 国家名称 冗余字段
     */
    public void setRedundantCountryName(String redundantCountryName) {
        this.redundantCountryName = redundantCountryName;
    }

    /**
     * 获取酒店库存（冗余，每天开定时任务的时候更新）
     *
     * @return redundant_hotel_store - 酒店库存（冗余，每天开定时任务的时候更新）
     */
    public Integer getRedundantHotelStore() {
        return redundantHotelStore;
    }

    /**
     * 设置酒店库存（冗余，每天开定时任务的时候更新）
     *
     * @param redundantHotelStore 酒店库存（冗余，每天开定时任务的时候更新）
     */
    public void setRedundantHotelStore(Integer redundantHotelStore) {
        this.redundantHotelStore = redundantHotelStore;
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