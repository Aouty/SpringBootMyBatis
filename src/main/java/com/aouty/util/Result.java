package com.aouty.util;

/**
 * @author Aouty
 * @date 2018-07-16 22:06
 * @description 返回的数据结果
 */
public class Result {
    private String statusCode;

    private String message;

    private Object data;

    public Result(String statusCode, String message, Object data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public Result(String statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = "";

    }

    public Result(Object data) {
        this.statusCode = "200";
        this.message = "ok";
        this.data = data;
    }

    public static Result success(String statusCode, String message, Object data) {
        return new Result(statusCode, message, data);
    }

    public static Result success(String statusCode, String message) {
        return new Result(statusCode, message);
    }

    public static Result success(Object data) {
        return new Result(data);
    }

    public static Result error(String statusCode, String message) {
        return new Result(statusCode, message);
    }


    public static Result error(String statusCode) {
        return new Result(statusCode);
    }


    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
