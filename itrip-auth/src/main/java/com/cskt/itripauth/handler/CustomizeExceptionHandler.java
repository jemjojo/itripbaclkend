package com.cskt.itripauth.handler;

import com.cskt.common.constants.ErrorCodeEnum;
import com.cskt.common.vo.ReturnResult;
import com.cskt.itripauth.exception.DaoException;
import com.cskt.itripauth.exception.ServiceException;
import com.cskt.itripauth.exception.SysException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 类名 : CustomizeExceptionHandler
 * 类描述 :
 * 创建人 : Mr.彭凌岚
 * 创建时间 : 2021-03-01 18:22
 * <p>
 * 修改人 :
 * 修改内容 :
 * 修改日期 :
 **/
@RestControllerAdvice
public class CustomizeExceptionHandler {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(CustomizeExceptionHandler.class);

    /**
     * 捕获异常
     * @param e 异常类型为Exception的异常
     * @return 异常信息
     */
    @ExceptionHandler(Exception.class)
    public ReturnResult error(Exception e){
        //把异常信息记录到日志
        LOGGER.error(e.getMessage(),e);
        //把异常信息返回到页面
        return ReturnResult.error(ErrorCodeEnum.SYSTEM_EXECUTION_ERROR);
    }

    /**
     * 捕获异常
     * @param e 异常类型为DaoException的异常
     * @return 异常信息
     */
    @ExceptionHandler(DaoException.class)
    public ReturnResult error(DaoException e){
        //把异常信息记录到日志
        LOGGER.error(e.getMessage(),e);
        //把异常信息返回到页面
        return ReturnResult.error(e.getErrorCode(),e.getMessage());
    }

    /**
     * 捕获异常
     * @param e 异常类型为ServiceException的异常
     * @return 异常信息
     */
    @ExceptionHandler(ServiceException.class)
    public ReturnResult error(ServiceException e){
        //把异常信息记录到日志
        LOGGER.error(e.getMessage(),e);
        //把异常信息返回到页面
        return ReturnResult.error(e.getErrorCode(),e.getMessage());
    }

    /**
     * 捕获异常
     * @param e 异常类型为SysException的异常
     * @return 异常信息
     */
    @ExceptionHandler(SysException.class)
    public ReturnResult error(SysException e){
        //把异常信息记录到日志
        LOGGER.error(e.getMessage(),e);
        //把异常信息返回到页面
        return ReturnResult.error(e.getErrorCode(),e.getMessage());
    }
}
