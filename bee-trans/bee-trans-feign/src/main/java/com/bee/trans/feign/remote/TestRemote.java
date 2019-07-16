package com.bee.trans.feign.remote;

import com.bee.trans.feign.hystrix.TestHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @Auther: zhuGuangZhou
 * @Date: 2019/7/16 17:28
 * @Description:
 */
@FeignClient(path = "test", value = "yac-cp-provider", fallbackFactory = TestHystrix.class)
public interface TestRemote {

    @GetMapping("getTestInfo")
    Map<String,Object> getTestInfo();
}
