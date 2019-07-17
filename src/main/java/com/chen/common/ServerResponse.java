package com.chen.common;

import lombok.Getter;

/**
 * 统一请求返回结果
 * <p>
 * @Author LeifChen
 * @Date 2019-07-17
 */
@Getter
public class ServerResponse {

    /**
     * 请求状态编码
     */
    private Integer code;
    /**
     * 请求返回消息
     */
    private String msg;
    /**
     * 请求返回数据
     */
    private Object data;

    private ServerResponse(Integer code) {
        this.code = code;
    }

    public static ServerResponse success() {
        return new ServerResponse(ResponseCodeEnum.SUCCESS.getCode());
    }

    public static ServerResponse success(String msg) {
        ServerResponse result = new ServerResponse(ResponseCodeEnum.SUCCESS.getCode());
        result.msg = msg;
        return result;
    }

    public static ServerResponse success(Object data) {
        ServerResponse result = new ServerResponse(ResponseCodeEnum.SUCCESS.getCode());
        result.data = data;
        return result;
    }

    public static ServerResponse success(Object data, String msg) {
        ServerResponse result = new ServerResponse(ResponseCodeEnum.SUCCESS.getCode());
        result.msg = msg;
        result.data = data;
        return result;
    }

    public static ServerResponse error(String msg) {
        ServerResponse result = new ServerResponse(ResponseCodeEnum.ERROR.getCode());
        result.msg = msg;
        return result;
    }
}