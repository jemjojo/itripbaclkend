package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
    * 区域字典表
    */
@TableName(value = "itrip_area_dic")
public class ItripAreaDic {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 区域名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 区域编号
     */
    @TableField(value = "area_no")
    private String areaNo;

    /**
     * 父级区域
     */
    @TableField(value = "parent")
    private Long parent;

    /**
     * 0:未激活 1:已激活
     */
    @TableField(value = "is_activated")
    private Integer isActivated;

    /**
     * 是否是商圈(0:不是 1:是)
     */
    @TableField(value = "is_trading_area")
    private Integer isTradingArea;

    /**
     * (0:不是 1：是)
     */
    @TableField(value = "is_hot")
    private Integer isHot;

    /**
     * 区域级别(0:国家级 1:省级 2:市级 3:县/区)
     */
    @TableField(value = "level")
    private Integer level;

    /**
     * 1:国内 2：国外
     */
    @TableField(value = "is_china")
    private Integer isChina;

    @TableField(value = "pinyin")
    private String pinyin;

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
     * 获取区域名称
     *
     * @return name - 区域名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置区域名称
     *
     * @param name 区域名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取区域编号
     *
     * @return area_no - 区域编号
     */
    public String getAreaNo() {
        return areaNo;
    }

    /**
     * 设置区域编号
     *
     * @param areaNo 区域编号
     */
    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    /**
     * 获取父级区域
     *
     * @return parent - 父级区域
     */
    public Long getParent() {
        return parent;
    }

    /**
     * 设置父级区域
     *
     * @param parent 父级区域
     */
    public void setParent(Long parent) {
        this.parent = parent;
    }

    /**
     * 获取0:未激活 1:已激活
     *
     * @return is_activated - 0:未激活 1:已激活
     */
    public Integer getIsActivated() {
        return isActivated;
    }

    /**
     * 设置0:未激活 1:已激活
     *
     * @param isActivated 0:未激活 1:已激活
     */
    public void setIsActivated(Integer isActivated) {
        this.isActivated = isActivated;
    }

    /**
     * 获取是否是商圈(0:不是 1:是)
     *
     * @return is_trading_area - 是否是商圈(0:不是 1:是)
     */
    public Integer getIsTradingArea() {
        return isTradingArea;
    }

    /**
     * 设置是否是商圈(0:不是 1:是)
     *
     * @param isTradingArea 是否是商圈(0:不是 1:是)
     */
    public void setIsTradingArea(Integer isTradingArea) {
        this.isTradingArea = isTradingArea;
    }

    /**
     * 获取(0:不是 1：是)
     *
     * @return is_hot - (0:不是 1：是)
     */
    public Integer getIsHot() {
        return isHot;
    }

    /**
     * 设置(0:不是 1：是)
     *
     * @param isHot (0:不是 1：是)
     */
    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    /**
     * 获取区域级别(0:国家级 1:省级 2:市级 3:县/区)
     *
     * @return level - 区域级别(0:国家级 1:省级 2:市级 3:县/区)
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置区域级别(0:国家级 1:省级 2:市级 3:县/区)
     *
     * @param level 区域级别(0:国家级 1:省级 2:市级 3:县/区)
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取1:国内 2：国外
     *
     * @return is_china - 1:国内 2：国外
     */
    public Integer getIsChina() {
        return isChina;
    }

    /**
     * 设置1:国内 2：国外
     *
     * @param isChina 1:国内 2：国外
     */
    public void setIsChina(Integer isChina) {
        this.isChina = isChina;
    }

    /**
     * @return pinyin
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * @param pinyin
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
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