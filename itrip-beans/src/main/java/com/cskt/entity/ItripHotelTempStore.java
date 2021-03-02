package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 实时库存表
    */
@ApiModel(value="com-cskt-entity-ItripHotelTempStore")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel_temp_store")
public class ItripHotelTempStore implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Long id;

    /**
     * 酒店id
     */
    @TableField(value = "hotel_id")
    @ApiModelProperty(value="酒店id")
    private Integer hotelId;

    /**
     * 商品id
     */
    @TableField(value = "room_id")
    @ApiModelProperty(value="商品id")
    private Long roomId;

    /**
     * 记录时间
     */
    @TableField(value = "record_date")
    @ApiModelProperty(value="记录时间")
    private Date recordDate;

    /**
     * 库存
     */
    @TableField(value = "store")
    @ApiModelProperty(value="库存")
    private Integer store;

    /**
     * 创建时间
     */
    @TableField(value = "creation_date")
    @ApiModelProperty(value="创建时间")
    private Date creationDate;

    /**
     * 创建人
     */
    @TableField(value = "created_by")
    @ApiModelProperty(value="创建人")
    private Long createdBy;

    /**
     * 修改时间
     */
    @TableField(value = "modify_date")
    @ApiModelProperty(value="修改时间")
    private Date modifyDate;

    /**
     * 修改人
     */
    @TableField(value = "modified_by")
    @ApiModelProperty(value="修改人")
    private Long modifiedBy;

    /**
     * 逻辑删除（0:未删除；1：删除）
     */
    @TableField(value = "is_deleted")
    @ApiModelProperty(value="逻辑删除（0:未删除；1：删除）")
    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}