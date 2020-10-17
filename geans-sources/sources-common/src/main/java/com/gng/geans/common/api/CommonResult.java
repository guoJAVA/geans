package com.gng.geans.common.api;

import com.gng.geans.common.constant.CommonConstant;

/**
 * 通用返回对象
 */
public class CommonResult<T> {

    /**
     * 状态码, 0：成功；1：失败
     */
    private String code;

    /**
     * 提示信息
     */
    private String message;

    /**
     * 数据封装
     */
    private T data;

    protected CommonResult() {
    }

    protected CommonResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     * @param message
     * @param data 获取的数据
     */
    public static <T> CommonResult<T> createSuccessResult(String message, T data) {
        return new CommonResult<T>(CommonConstant.CODE_SUCCESS, message, data);
    }

    /**
     * 失败返回结果
     * @param data 获取的数据
     */
    public static <T> CommonResult<T> createFailedResult(String message, T data) {
        return new CommonResult<T>(CommonConstant.CODE_FAIL, message, data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
