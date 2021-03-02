package com.cskt.itripauth.exception;

import com.cskt.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 类名 : DaoException
 * 类描述 :自定义Dao层异常
 * 创建人 : Mr.彭凌岚
 * 创建时间 : 2021-03-01 17:47
 * <p>
 * 修改人 :
 * 修改内容 :
 * 修改日期 :
 **/
@Data
@ApiModel(value = "自定义Dao层异常")
public class DaoException extends RuntimeException {
    @ApiModelProperty(value = "异常状态码")
    private String errorCode;

    public DaoException(String message, String errorCode) {
        //把返回给前端的信息放在异常信息里面
        super(message);
        this.errorCode = errorCode;
    }

    public DaoException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }
}
