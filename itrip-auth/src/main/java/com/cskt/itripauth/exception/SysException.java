package com.cskt.itripauth.exception;

import com.cskt.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 类名 : SysException
 * 类描述 :自定义系统层异常
 * 创建人 : Mr.彭凌岚
 * 创建时间 : 2021-03-01 17:52
 * <p>
 * 修改人 :
 * 修改内容 :
 * 修改日期 :
 **/
@Data
@ApiModel(value = "自定义系统层异常")
public class SysException extends RuntimeException {
    @ApiModelProperty(value = "异常编码")
    private String errorCode;

    public SysException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public SysException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }
}
