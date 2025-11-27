package com.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    private static final Logger log = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void test1() {
        log.trace("这是 trace 日志");
        log.debug("这是 debug 日志");
        log.info("这是 info 日志");
        log.warn("这是 warn 日志");
        log.error("这是 error 日志");
    }
}
