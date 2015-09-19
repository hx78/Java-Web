package com.hx78.spring.jdbc;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by linming on 2015/8/31 0031.
 */
public class BeanFactoryMain {

    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        System.out.println("message:" + obj.getMessage());
    }
}
