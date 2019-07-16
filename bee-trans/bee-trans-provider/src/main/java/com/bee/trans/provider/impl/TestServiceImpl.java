package com.bee.trans.provider.impl;

import com.bee.trans.entity.sqlserver.TabUserBasicInfo;
import com.bee.trans.provider.service.TestService;
import com.bee.trans.provider.config.datasource.DataSourceEnum;
import com.bee.trans.provider.config.datasource.TargetDataSource;
import com.bee.trans.provider.mapper.test.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: zhuGuangZhou
 * @Date: 2019/7/10 17:34
 * @Description:
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @TargetDataSource(DataSourceEnum.SQLServer)
    @Override
    public Map<String, Object> getTestInfo() {
        Map<String,Object> map = new HashMap<>();
        String tel = "13699786643";
        map.put("userName","admin");
        map.put("tel",tel);
        TabUserBasicInfo userInfo = testMapper.getUserInfo(tel);
        map.put("userInfo",userInfo);
        return map;
    }
}
