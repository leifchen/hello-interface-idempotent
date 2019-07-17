package com.chen.common;

import lombok.Getter;

/**
 * 响应状态枚举
 * <p>
 * @Author LeifChen
 * @Date 2019-07-17
 */
@Getter
public enum ResponseCodeEnum {

    // 系统模块
    SUCCESS(0, "操作成功"),
    ERROR(1, "操作失败"),
    SERVER_ERROR(500, "服务器异常"),

    // 通用模块
    ILLEGAL_ARGUMENT(10000, "参数不合法"),
    REPETITIVE_OPERATION(10001, "请勿重复操作"),
    ACCESS_LIMIT(10002, "请求太频繁, 请稍后再试");

    private Integer code;
    private String msg;

    ResponseCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
