package com.lina.test;

import com.lina.mapper.TeamMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class Test01 {
    @Resource
    private TeamMapper teamMapper;

    @Test
    public void test(){
        teamMapper.selectByExample(null).forEach(System.out::println);
    }

}
