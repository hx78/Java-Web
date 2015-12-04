package com.hx78.spring.jdbc.test;

import com.hx78.spring.jdbc.service.IHelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by linming on 2015/9/1 0001.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Beans2.xml"})
public class TestDI {
    //ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
    @Resource
    public IHelloWorld helloWorld = null;

    @Test
    public void test1() {
        helloWorld.say();
    }
}
