package com.hx78.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linming on 2015/8/31 0031.
 */
public class JavaCollectionMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
        System.out.println(jc.getAddressList());
        System.out.println(jc.getAddressSet());
        System.out.println(jc.getAddressMap());
        System.out.println(jc.getAddressProp());
    }
}
