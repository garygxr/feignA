package com.xtc.smartwatch.controller;

import com.xtc.smartwatch.enums.watchaccount.WatchAccountVO;
import com.xtc.smartwatch.service.WatchaccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author gan  # 淇敼鐢ㄦ埛鍚嶇О
 * @Date 2024/11/16 11:16
 **/
@RestController
public class WatchAccountController {

    @Resource
    private WatchaccountService watchaccountService;

    @PostConstruct
    public void init() {
        System.out.println("WatchAccountController init");
    }

    @GetMapping("/getByRest")
    public WatchAccountVO getWatchAccount() {
        WatchAccountVO watchAccount = watchaccountService.getWatchAccountByRest();
        return watchAccount;
    }
}
