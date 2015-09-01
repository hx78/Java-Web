package com.hx78.spring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Created by linming on 2015/8/31 0031.
 */
public class ApplicationContextMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        // context = new FileSystemXmlApplicationContext("Beans.xml");

//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        System.out.println("message:" + obj.getMessage());

        IHelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.sayHello();
    }
}
