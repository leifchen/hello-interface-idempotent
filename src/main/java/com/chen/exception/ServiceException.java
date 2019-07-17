package com.chen.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * 业务逻辑异常
 * <p>
 * @Author LeifChen
 * @Date 2019-07-17
 */
@Getter
@Setter
public class ServiceException extends RuntimeException {

    public ServiceException() {
        super();
    }

    public ServiceException(String msg) {
        super(msg);
    }
}
