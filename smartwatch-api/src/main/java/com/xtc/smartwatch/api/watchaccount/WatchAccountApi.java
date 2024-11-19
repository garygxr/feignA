package com.xtc.smartwatch.api.watchaccount;

import com.xtc.framework.pojo.CommonResult;
import com.xtc.smartwatch.enums.ApiConstants;
import com.xtc.smartwatch.enums.watchaccount.WatchAccountVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * @author gan  # 淇敼鐢ㄦ埛鍚嶇О
 * @Date 2024/11/16 10:59
 **/
@FeignClient(name = ApiConstants.NAME)
public interface WatchAccountApi {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    CommonResult<WatchAccountVO> getWatchAccount();


    default WatchAccountVO getWatchAccountByRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WatchAccountVO> forEntity = restTemplate.getForEntity("http://localhost:8012/getByRest",
                WatchAccountVO.class);
        return forEntity.getBody();
    }
}
