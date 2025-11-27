package com.example.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 定时任务配置类
 */
@Component
public class ScheduledConfig {
    
    /**
     * 每5分钟执行一次的示例任务
     */
    @Scheduled(cron = "0/30 * * * * ?")
    public void exampleTask() {
        // 执行定时任务逻辑
        System.out.println("定时任务执行时间：" + new Date());
    }
}