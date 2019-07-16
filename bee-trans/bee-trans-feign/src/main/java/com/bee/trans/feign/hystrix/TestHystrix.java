package com.bee.trans.feign.hystrix;

import com.bee.trans.common.exception.RemoteRequestExcepton;
import com.bee.trans.feign.remote.TestRemote;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Auther: zhuGuangZhou
 * @Date: 2019/7/16 17:00
 * @Description:
 */
@Component
public class TestHystrix implements FallbackFactory<TestRemote> {

    @Override
    public TestRemote create(Throwable throwable) {
        TestRemote testRemote = new TestRemote() {
            @Override
            public Map<String, Object> getTestInfo() {
                throw new RemoteRequestExcepton("查询失败");
            }
        };
        return testRemote;
    }

}
