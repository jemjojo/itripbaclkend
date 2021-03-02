package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
    * 用户表
    */
@TableName(value = "itrip_user")
public class ItripUser {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
     */
    @TableField(value = "user_code")
    private String userCode;

    /**
     * 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
     */
    @TableField(value = "user_password")
    private String userPassword;

    /**
     * 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
     */
    @TableField(value = "user_type")
    private Integer userType;

    /**
     * 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
     */
    @TableField(value = "flat_id")
    private Long flatId;

    /**
     * 用户昵称
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 微信号
     */
    @TableField(value = "we_chat")
    private String weChat;

    /**
     * qq账号
     */
    @TableField(value = "qq")
    private String qq;

    /**
     * 微博账号
     */
    @TableField(value = "weibo")
    private String weibo;

    /**
     * 百度账号
     */
    @TableField(value = "baidu")
    private String baidu;

    @TableField(value = "creation_date")
    private Date creationDate;

    @TableField(value = "created_by")
    private Long createdBy;

    @TableField(value = "modify_date")
    private Date modifyDate;

    @TableField(value = "modified_by")
    private Long modifiedBy;

    /**
     * 是否激活,(0 false，1 true,默认是0)
     */
    @TableField(value = "activated")
    private Integer activated;

    /**
     * 逻辑删除
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
     * 获取若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
     *
     * @return user_code - 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 设置若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
     *
     * @param userCode 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * 获取若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
     *
     * @return user_password - 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
     *
     * @param userPassword 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
     *
     * @return user_type - 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
     *
     * @param userType 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
     *
     * @return flat_id - 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
     */
    public Long getFlatId() {
        return flatId;
    }

    /**
     * 设置平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
     *
     * @param flatId 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
     */
    public void setFlatId(Long flatId) {
        this.flatId = flatId;
    }

    /**
     * 获取用户昵称
     *
     * @return user_name - 用户昵称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户昵称
     *
     * @param userName 用户昵称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取微信号
     *
     * @return we_chat - 微信号
     */
    public String getWeChat() {
        return weChat;
    }

    /**
     * 设置微信号
     *
     * @param weChat 微信号
     */
    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    /**
     * 获取qq账号
     *
     * @return qq - qq账号
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置qq账号
     *
     * @param qq qq账号
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取微博账号
     *
     * @return weibo - 微博账号
     */
    public String getWeibo() {
        return weibo;
    }

    /**
     * 设置微博账号
     *
     * @param weibo 微博账号
     */
    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    /**
     * 获取百度账号
     *
     * @return baidu - 百度账号
     */
    public String getBaidu() {
        return baidu;
    }

    /**
     * 设置百度账号
     *
     * @param baidu 百度账号
     */
    public void setBaidu(String baidu) {
        this.baidu = baidu;
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
     * 获取是否激活,(0 false，1 true,默认是0)
     *
     * @return activated - 是否激活,(0 false，1 true,默认是0)
     */
    public Integer getActivated() {
        return activated;
    }

    /**
     * 设置是否激活,(0 false，1 true,默认是0)
     *
     * @param activated 是否激活,(0 false，1 true,默认是0)
     */
    public void setActivated(Integer activated) {
        this.activated = activated;
    }

    /**
     * 获取逻辑删除
     *
     * @return is_deleted - 逻辑删除
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置逻辑删除
     *
     * @param isDeleted 逻辑删除
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}