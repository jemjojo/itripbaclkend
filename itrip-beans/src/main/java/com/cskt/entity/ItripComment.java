package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
    * 评论表
    */
@TableName(value = "itrip_comment")
public class ItripComment {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 如果产品是酒店的话 改字段保存酒店id
     */
    @TableField(value = "hotel_id")
    private Long hotelId;

    /**
     * 商品id
     */
    @TableField(value = "product_id")
    private Long productId;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    private Long orderId;

    /**
     * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     */
    @TableField(value = "product_type")
    private Integer productType;

    /**
     * 评论内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 用户编号
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
     */
    @TableField(value = "is_having_img")
    private Integer isHavingImg;

    /**
     * 位置评分
     */
    @TableField(value = "position_score")
    private Integer positionScore;

    /**
     * 设施评分
     */
    @TableField(value = "facilities_score")
    private Integer facilitiesScore;

    /**
     * 服务评分
     */
    @TableField(value = "service_score")
    private Integer serviceScore;

    /**
     * 卫生评分
     */
    @TableField(value = "hygiene_score")
    private Integer hygieneScore;

    /**
     * 综合评分
     */
    @TableField(value = "score")
    private Integer score;

    /**
     * 出游类型
     */
    @TableField(value = "trip_mode")
    private Long tripMode;

    /**
     * 是否满意（0：有待改善 1：值得推荐）
     */
    @TableField(value = "is_ok")
    private Integer isOk;

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
     * 获取如果产品是酒店的话 改字段保存酒店id
     *
     * @return hotel_id - 如果产品是酒店的话 改字段保存酒店id
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * 设置如果产品是酒店的话 改字段保存酒店id
     *
     * @param hotelId 如果产品是酒店的话 改字段保存酒店id
     */
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * 获取商品id
     *
     * @return product_id - 商品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置商品id
     *
     * @param productId 商品id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     *
     * @return product_type - 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 设置商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     *
     * @param productType 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 获取评论内容
     *
     * @return content - 评论内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置评论内容
     *
     * @param content 评论内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
     *
     * @return is_having_img - 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
     */
    public Integer getIsHavingImg() {
        return isHavingImg;
    }

    /**
     * 设置是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
     *
     * @param isHavingImg 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
     */
    public void setIsHavingImg(Integer isHavingImg) {
        this.isHavingImg = isHavingImg;
    }

    /**
     * 获取位置评分
     *
     * @return position_score - 位置评分
     */
    public Integer getPositionScore() {
        return positionScore;
    }

    /**
     * 设置位置评分
     *
     * @param positionScore 位置评分
     */
    public void setPositionScore(Integer positionScore) {
        this.positionScore = positionScore;
    }

    /**
     * 获取设施评分
     *
     * @return facilities_score - 设施评分
     */
    public Integer getFacilitiesScore() {
        return facilitiesScore;
    }

    /**
     * 设置设施评分
     *
     * @param facilitiesScore 设施评分
     */
    public void setFacilitiesScore(Integer facilitiesScore) {
        this.facilitiesScore = facilitiesScore;
    }

    /**
     * 获取服务评分
     *
     * @return service_score - 服务评分
     */
    public Integer getServiceScore() {
        return serviceScore;
    }

    /**
     * 设置服务评分
     *
     * @param serviceScore 服务评分
     */
    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }

    /**
     * 获取卫生评分
     *
     * @return hygiene_score - 卫生评分
     */
    public Integer getHygieneScore() {
        return hygieneScore;
    }

    /**
     * 设置卫生评分
     *
     * @param hygieneScore 卫生评分
     */
    public void setHygieneScore(Integer hygieneScore) {
        this.hygieneScore = hygieneScore;
    }

    /**
     * 获取综合评分
     *
     * @return score - 综合评分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置综合评分
     *
     * @param score 综合评分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取出游类型
     *
     * @return trip_mode - 出游类型
     */
    public Long getTripMode() {
        return tripMode;
    }

    /**
     * 设置出游类型
     *
     * @param tripMode 出游类型
     */
    public void setTripMode(Long tripMode) {
        this.tripMode = tripMode;
    }

    /**
     * 获取是否满意（0：有待改善 1：值得推荐）
     *
     * @return is_ok - 是否满意（0：有待改善 1：值得推荐）
     */
    public Integer getIsOk() {
        return isOk;
    }

    /**
     * 设置是否满意（0：有待改善 1：值得推荐）
     *
     * @param isOk 是否满意（0：有待改善 1：值得推荐）
     */
    public void setIsOk(Integer isOk) {
        this.isOk = isOk;
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