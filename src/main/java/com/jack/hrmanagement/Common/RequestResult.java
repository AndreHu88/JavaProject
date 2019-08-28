package com.jack.hrmanagement.Common;

import cn.hutool.core.util.StrUtil;

public class RequestResult<T> {

    long code;
    T data;
    String message;

    protected RequestResult() {

    }

    protected RequestResult(long code, T data, String message) {

        this.code = code;
        this.data = data;
        this.message = message;
    }

    public static <T> RequestResult<T> success(T data) {
        return new RequestResult<T>(RequestCode.SUCCESS.getCode(), data, RequestCode.SUCCESS.getMessage());
    }

    /**
     * 参数错误
     */
    public static RequestResult<String> parameterError(String message) {
        return new RequestResult<>(RequestCode.PARMATER_FAILED.getCode(), "", message);
    }

    /**
     * Token失效
     */
    public static RequestResult<String> tokenxpire(String message) {
        return new RequestResult<>(RequestCode.TOKEN_EXPIRE.getCode(), "", RequestCode.TOKEN_EXPIRE.getMessage());
    }


    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
