package com.leyou.item.common.advice;

import com.leyou.item.common.utils.R;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ProjectName leyou
 * @ClassName BaseHeandler
 * @Description TODO
 * @Author Lenovo
 * @Date 2019/11/10 11:27
 * @Version 1.0
 */
@RestControllerAdvice
public class BaseHeandler {

    private Logger log = LoggerFactory.getLogger(BaseHeandler.class);

    @ExceptionHandler
    public R handleException(IllegalArgumentException e) {
        log.info("异常信息:[{}]",e.getMessage());
        return R.error().put("msg", e.getMessage());
    }

    @ExceptionHandler
    public R handleException(RuntimeException e) {
        log.info("异常信息:[{}]",e.getMessage());
        return R.error().put("msg", e.getMessage());
    }

    @ExceptionHandler
    public R handleException(MissingServletRequestParameterException e) {
        log.info("异常信息:[{}]",e.getMessage());
        return R.error().put("msg", e.getMessage());
    }

    @ExceptionHandler
    public R handleException(MySQLIntegrityConstraintViolationException e) {
        log.info("异常信息:[{}]",e.getMessage());
        return R.error().put("msg", e.getMessage());
    }

    @ExceptionHandler
    public R handleException(DataIntegrityViolationException e) {
        log.info("异常信息:[{}]",e.getMessage());
        return R.error().put("msg", e.getMessage());
    }
}
