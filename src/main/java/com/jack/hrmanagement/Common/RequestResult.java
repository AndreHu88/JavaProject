package com.jack.hrmanagement.Common;

public class RequestResult<T> {

    long code;
    T data;
    String message;

    protected RequestResult(long code, T data, String message) {

        this.code = code;
        this.data = data;
        this.message = message;
    }

    public static <T> RequestResult<T> success(T data) {
        return new RequestResult<T>(RequestCode.SUCCESS.getCode(), data, RequestCode.SUCCESS.getMessage());
    }


}
