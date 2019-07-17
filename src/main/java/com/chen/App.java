package com.chen;

import com.chen.interceptor.ApiIdempotentInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * App
 * <p>
 * @Author LeifChen
 * @Date 2019-07-17
 */
@SpringBootApplication
public class App implements WebMvcConfigurer {

    @Autowired
    private ApiIdempotentInterceptor apiIdempotentInterceptor;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiIdempotentInterceptor);
    }
}
