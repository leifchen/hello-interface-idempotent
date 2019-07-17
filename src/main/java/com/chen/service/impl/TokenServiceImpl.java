package com.chen.service.impl;

import com.chen.common.Const;
import com.chen.common.ResponseCodeEnum;
import com.chen.common.ServerResponse;
import com.chen.exception.ServiceException;
import com.chen.service.TokenService;
import com.chen.util.JedisUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * TokenServiceImpl
 * <p>
 * @Author LeifChen
 * @Date 2019-07-17
 */
@Service
public class TokenServiceImpl implements TokenService {

    private static final String TOKEN_NAME = "token";

    @Autowired
    private JedisUtils jedisUtils;

    @Override
    public ServerResponse createToken() {
        String str = UUID.randomUUID().toString();
        StringBuilder token = new StringBuilder();
        token.append(Const.Redis.TOKEN_PREFIX).append(str);
        jedisUtils.setEx(token.toString(), token.toString(), Const.Redis.EXPIRE_TIME_MINUTE);
        return ServerResponse.success(token.toString());
    }

    @Override
    public void checkToken(HttpServletRequest request) {
        String token = request.getHeader(TOKEN_NAME);
        if (StringUtils.isBlank(token)) {
            token = request.getParameter(TOKEN_NAME);
            if (StringUtils.isBlank(token)) {
                throw new ServiceException(ResponseCodeEnum.ILLEGAL_ARGUMENT.getMsg());
            }
        }

        if (!jedisUtils.exists(token)) {
            throw new ServiceException(ResponseCodeEnum.REPETITIVE_OPERATION.getMsg());
        }

        Long del = jedisUtils.del(token);
        if (del <= 0) {
            throw new ServiceException(ResponseCodeEnum.REPETITIVE_OPERATION.getMsg());
        }
    }
}
