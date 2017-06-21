package com.xzf.spring.boot.pojo;


public class ExceptionResponse {

    private String errorMsg;
    private String errorCode;

    public ExceptionResponse(String errorCode,String errorMsg){
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public static ExceptionResponse create(String errorCode,String errorMsg){
        return new ExceptionResponse(errorCode,errorMsg);
    }

}
