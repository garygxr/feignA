package com.xtc.smartwatch.api.watchaccount;

import com.xtc.framework.pojo.CommonResult;
import com.xtc.smartwatch.enums.watchaccount.WatchAccountVO;
import com.xtc.smartwatch.service.WatchaccountService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author gan  # 淇敼鐢ㄦ埛鍚嶇О
 * @Date 2024/11/16 11:16
 **/
@RestController
public class WatchAccountApiImpl implements WatchAccountApi {

    @Resource
    private WatchaccountService watchaccountService;

    @Override
    public CommonResult<WatchAccountVO> getWatchAccount() {
        WatchAccountVO watchAccount = watchaccountService.getWatchAccount();
        return CommonResult.success(watchAccount);
    }
}
