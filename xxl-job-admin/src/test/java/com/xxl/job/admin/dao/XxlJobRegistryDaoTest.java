package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobRegistry;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class XxlJobRegistryDaoTest {

    @Resource
    private XxlJobRegistryDao xxlJobRegistryDao;

    @Test
    public void test(){
        //TODO oracle支持调整 此处修改日期类型 new Timestamp(new Date().getTime())
        int ret = xxlJobRegistryDao.registryUpdate("g1", "k1", "v1", new Timestamp(new Date().getTime()));
        if (ret < 1) {
            ret = xxlJobRegistryDao.registrySave("g1", "k1", "v1", new Timestamp(new Date().getTime()));
        }

        List<XxlJobRegistry> list = xxlJobRegistryDao.findAll(1, new Timestamp(new Date().getTime()));

        int ret2 = xxlJobRegistryDao.removeDead(Arrays.asList(1));
    }

}
