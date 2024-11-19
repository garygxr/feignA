package com.xtc.smartwatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gan  # 淇敼鐢ㄦ埛鍚嶇О
 * @Date 2024/11/16 10:58
 **/
@SpringBootApplication
@EnableFeignClients(basePackages ={"com.xtc.*.api"})
public class SmartWatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartWatchApplication.class, args);
    }
}
