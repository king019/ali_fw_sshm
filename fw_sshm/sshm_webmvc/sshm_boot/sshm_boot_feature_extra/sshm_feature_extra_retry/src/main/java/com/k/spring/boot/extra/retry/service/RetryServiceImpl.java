package com.k.spring.boot.extra.retry.service;

import com.k.spring.boot.extra.retry.exceptions.RetryException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Slf4j
@Service("retryService")
public class RetryServiceImpl {
    int retryNum = 0;
    int i = 1;

    @Retryable(value = {RuntimeException.class}, maxAttempts = 4, backoff = @Backoff(delay = 1000, multiplier = 1))
    public String retry() {
        log.info("测试retry" + (retryNum++));
        i++;// 生产环境此处应该为调用第三方接口，判断接口返回code
        if (i == 10) {
            return i + "";
        }
        RetryException retryException = new RetryException("9999", "连接超时" + retryNum);
        throw retryException;
    }

    @Recover()
    public String recover1(RetryException e) {
        log.info(e.getMessage());
        return "6";
    }
}