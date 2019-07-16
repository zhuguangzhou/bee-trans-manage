package com.bee.trans.api.controller;

import com.bee.trans.common.exception.SysException;
import com.bee.trans.common.result.RequestResult;
import com.bee.trans.feign.remote.TestRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Auther: zhuGuangZhou
 * @Date: 2019/7/16 17:02
 * @Description:
 */
@RestController
public class TestController {

    @Autowired
    private TestRemote testRemote;

    @RequestMapping(value = "test/getTestInfo",method = RequestMethod.POST)
    public RequestResult getTestInfo(){
        RequestResult result = new RequestResult();
        try {
            Map<String,Object> bases=testRemote.getTestInfo();
            result.setData(bases);
        }catch (SysException e){
            result.setCode(e.getCode());
            result.setDesc(e.getMessage());
        }
        return result;
    }

}
