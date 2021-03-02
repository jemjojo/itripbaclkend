package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
    * 标签字典表
    */
@TableName(value = "itrip_label_dic")
public class ItripLabelDic {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * key值
     */
    @TableField(value = "name")
    private String name;

    /**
     * value值
     */
    @TableField(value = "value")
    private String value;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 父级标签id(1级标签则为0)
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 标签图片地址
     */
    @TableField(value = "pic")
    private String pic;

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
     * 获取key值
     *
     * @return name - key值
     */
    public String getName() {
        return name;
    }

    /**
     * 设置key值
     *
     * @param name key值
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取value值
     *
     * @return value - value值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value值
     *
     * @param value value值
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取父级标签id(1级标签则为0)
     *
     * @return parent_id - 父级标签id(1级标签则为0)
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父级标签id(1级标签则为0)
     *
     * @param parentId 父级标签id(1级标签则为0)
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取标签图片地址
     *
     * @return pic - 标签图片地址
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置标签图片地址
     *
     * @param pic 标签图片地址
     */
    public void setPic(String pic) {
        this.pic = pic;
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