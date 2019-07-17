package com.chen.common;

/**
 * 常量
 * <p>
 * @Author LeifChen
 * @Date 2019-07-17
 */
public class Const {

    public interface Redis {
        String OK = "OK";
        /**
         * 过期时间，一分钟
         */
        Integer EXPIRE_TIME_MINUTE = 60;
        /**
         * 过期时间，一小时
         */
        Integer EXPIRE_TIME_HOUR = 60 * 60;
        /**
         * 过期时间，一天
         */
        Integer EXPIRE_TIME_DAY = 60 * 60 * 24;
        String TOKEN_PREFIX = "token:";
    }
}
