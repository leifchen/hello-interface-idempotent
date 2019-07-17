package com.chen.service.impl;

import com.chen.common.ServerResponse;
import com.chen.service.TestService;
import org.springframework.stereotype.Service;

/**
 * TestServiceImpl
 * <p>
 * @Author LeifChen
 * @Date 2019-07-17
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public ServerResponse testIdempotent() {
        return ServerResponse.success("test idempotent success");
    }
}
