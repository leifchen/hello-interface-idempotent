package com.chen.service;

import com.chen.common.ServerResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * TokenService
 * <p>
 * @Author LeifChen
 * @Date 2019-07-17
 */
public interface TokenService {

    /**
     * 创建Token
     * @return
     */
    ServerResponse createToken();

    /**
     * 校验Token
     * @param request
     */
    void checkToken(HttpServletRequest request);
}
