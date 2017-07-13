package com.xzf.spring.boot.handler;

import com.xzf.spring.boot.exception.DataCheckException;
import com.xzf.spring.boot.pojo.ExceptionResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * @ControllerAdvice注解内部使用@ExceptionHandler、@InitBinder、@ModelAttribute注解的方法应用到所有的
 * @RequestMapping注解的方法。
 *
 * 统一异常处理
 */
//@ControllerAdvice
public class ControllerHandler {

    private final Logger logger = LoggerFactory.getLogger(ControllerHandler.class);

    /**
     * 该方式可以应用于：表单字段校验等需要返回回数据的场景
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(DataCheckException.class)
    @ResponseBody //返回json数据
    public ExceptionResponse exceptionHander(DataCheckException e){
        logger.info("-----Process DataCheckException-------");
        return e.getExceptionResponse();
    }

    /**
     * 统一异常处理：可根据异常类型跳转到错误页面
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public String exceptionHander(Exception e){
        logger.info("------Process Exception Jump to Error Page-------");
        return "/error/error";
    }



}
