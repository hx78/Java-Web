package com.hx78.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by linming on 2015/8/31 0031.
 */
public class InheritBeanMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloChina obj = (HelloChina) context.getBean("helloChina");
        System.out.println("message:" + obj.getMessage1());
        System.out.println("message:" + obj.getMessage2());
        System.out.println("message:" + obj.getMessage3());
    }
}
