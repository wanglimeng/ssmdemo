package com.wlm.dao;

import com.wlm.pojo.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml"})
public class daoTest {


    @Autowired
    AdminMapper adminMapper;

    @Test
    public void testDao() {

        Integer id = 6;

        Admin admin = adminMapper.selectByPrimaryKey(id);

        System.out.println(admin);

    }




}
