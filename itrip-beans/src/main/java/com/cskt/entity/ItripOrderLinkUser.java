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

@ApiModel(value="com-cskt-entity-ItripOrderLinkUser")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_order_link_user")
public class ItripOrderLinkUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    @ApiModelProperty(value="订单id")
    private Long orderId;

    /**
     * 联系人id
     */
    @TableField(value = "link_user_id")
    @ApiModelProperty(value="联系人id")
    private Long linkUserId;

    /**
     * 入住人姓名逗号分隔
     */
    @TableField(value = "link_user_name")
    @ApiModelProperty(value="入住人姓名逗号分隔")
    private String linkUserName;

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