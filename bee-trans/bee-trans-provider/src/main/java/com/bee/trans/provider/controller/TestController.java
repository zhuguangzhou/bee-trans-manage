package com.bee.trans.provider.controller;

import com.bee.trans.feign.remote.TestRemote;
import com.bee.trans.provider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Auther: zhuGuangZhou
 * @Date: 2019/7/16 17:10
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController implements TestRemote {

    @Autowired
    private TestService testService;

    @Override
    public Map<String, Object> getTestInfo() {
        return testService.getTestInfo();
    }
}
