package com.chen.controller;

import com.chen.annotation.ApiIdempotent;
import com.chen.common.ServerResponse;
import com.chen.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 * <p>
 * @Author LeifChen
 * @Date 2019-07-17
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @ApiIdempotent
    @PostMapping
    public ServerResponse testIdempotent() {
        return testService.testIdempotent();
    }
}
