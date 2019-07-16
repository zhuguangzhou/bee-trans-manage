package com.bee.trans.provider.mapper.test;

import com.bee.trans.entity.sqlserver.TabUserBasicInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: zhuGuangZhou
 * @Date: 2019/7/10 19:09
 * @Description:
 */
@Mapper
public interface TestMapper {

    TabUserBasicInfo getUserInfo(@Param("tel") String tel);
}
