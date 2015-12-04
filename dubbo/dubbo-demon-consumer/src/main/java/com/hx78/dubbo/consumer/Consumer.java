package com.hx78.dubbo.consumer;

import com.hx78.dubbo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linming on 2015/12/3 0003.
 */
public class Consumer {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:consumer.xml" });
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法

        System.out.println(hello); // 显示调用结果
    }
}
