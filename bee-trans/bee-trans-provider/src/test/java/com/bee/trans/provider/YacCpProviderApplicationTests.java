package com.bee.trans.provider;

import com.alibaba.fastjson.JSON;
import com.bee.trans.provider.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YacCpProviderApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    public void contextLoads() {

        Map<String,Object> map = testService.getTestInfo();
        System.out.println(JSON.toJSONString(map));
    }

}
