package com.k.spring.retry;


import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.RetryListener;
import org.springframework.retry.RetryPolicy;
import org.springframework.retry.backoff.BackOffContext;
import org.springframework.retry.backoff.BackOffInterruptedException;
import org.springframework.retry.backoff.BackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

@Slf4j
public class RetryDemo {

    @Test
    @Ignore
    public void test() {
        try {
            RetryTemplate template = new RetryTemplate();
            template.setBackOffPolicy(buildBackOffPolicy());
            template.setListeners(buildRetryListener());
            template.setRetryPolicy(buildRetryPolicy());
            template.setThrowLastExceptionOnExhausted(buildThrowLastExceptionOnExhausted());
            template.execute(new RetryCallback<Long, Throwable>() {
                @Override
                public Long doWithRetry(RetryContext context) throws Throwable {
                    boolean flag = true;
                    if (flag) {
                        throw new Exception();
                    }
                    return null;
                }
            });
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private BackOffPolicy buildBackOffPolicy() {
        BackOffPolicy backOffPolicy = new BackOffPolicy() {
            @Override
            public BackOffContext start(RetryContext context) {
                return null;
            }

            @Override
            public void backOff(BackOffContext backOffContext) throws BackOffInterruptedException {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        return backOffPolicy;
    }

    private RetryListener[] buildRetryListener() {
        RetryListener[] retryListeners = new RetryListener[1];
        RetryListener retryListener = new RetryListener() {
            @Override
            public <T, E extends Throwable> boolean open(RetryContext context, RetryCallback<T, E> callback) {
                log.info("RetryListeneropen");
                return true;
            }

            @Override
            public <T, E extends Throwable> void close(RetryContext context, RetryCallback<T, E> callback, Throwable throwable) {
                log.info("RetryListenerclose");
            }

            @Override
            public <T, E extends Throwable> void onError(RetryContext context, RetryCallback<T, E> callback, Throwable throwable) {
                log.info("RetryListeneronError");
            }
        };
        retryListeners[0] = retryListener;
        return retryListeners;
    }

    private RetryPolicy buildRetryPolicy() {
        SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy() {
            @Override
            public RetryContext open(RetryContext parent) {
                log.info("RetryPolicyopen");
                return super.open(parent);
            }

            @Override
            public boolean canRetry(RetryContext context) {
                log.info("RetryPolicycanRetry");
                return super.canRetry(context);
            }

            @Override
            public void close(RetryContext status) {
                log.info("RetryPolicyclose");
                super.close(status);
            }
        };
        retryPolicy.setMaxAttempts(3);
        return retryPolicy;
    }

    private boolean buildThrowLastExceptionOnExhausted() {
        return true;
    }
}
