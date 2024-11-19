package com.xtc.smartwatch.service;

import com.xtc.smartwatch.enums.watchaccount.WatchAccountVO;
import org.springframework.stereotype.Service;

/**
 * @author gan  # 淇敼鐢ㄦ埛鍚嶇О
 * @Date 2024/11/16 11:22
 **/
@Service
public class WatchaccountService {
    public WatchAccountVO getWatchAccount() {
        WatchAccountVO watchAccountVO = new WatchAccountVO();
        watchAccountVO.setWatchId(1234);
        watchAccountVO.setName("张三");
        return watchAccountVO;
    }

        public WatchAccountVO getWatchAccountByRest() {
        WatchAccountVO watchAccountVO = new WatchAccountVO();
        watchAccountVO.setWatchId(56768);
        watchAccountVO.setName("李四");
        return watchAccountVO;
    }
}
