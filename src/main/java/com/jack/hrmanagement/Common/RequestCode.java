package com.jack.hrmanagement.Common;

public enum RequestCode implements ErrorCode {

    SUCCESS(1000, "操作成功"),
    PARMATER_FAILED(1001, "参数检验失败"),
    UNAUTHORIZED(2000, "请先登录"),
    TOKEN_EXPIRE(2001, "登录信息过期"),
    FORBIDDEN(3000, "没有相关权限");


    long code;

    String message;

    private RequestCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode(){
         return code;
    }

    public String getMessage(){
         return message;
    }
}
