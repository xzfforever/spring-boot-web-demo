package com.xzf.spring.boot.exception;

import com.xzf.spring.boot.pojo.ExceptionResponse;


public class DataCheckException extends Exception {

    private String errorMsg;

    private String errorCode;

    private ExceptionResponse exceptionResponse;

    public DataCheckException(String errorCode, String errorMsg){
        exceptionResponse = ExceptionResponse.create(errorCode,errorMsg);
    }

    public ExceptionResponse getExceptionResponse(){
        return exceptionResponse;
    }

}
