package com.chen.service;

import com.chen.common.ServerResponse;

/**
 * TestService
 * <p>
 * @Author LeifChen
 * @Date 2019-07-17
 */
public interface TestService {

    /**
     * 测试接口的幂等性
     * @return
     */
    ServerResponse testIdempotent();
}
