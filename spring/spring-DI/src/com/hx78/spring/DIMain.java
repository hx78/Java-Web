package com.hx78.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linming on 2015/8/31 0031.
 */
public class DIMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );

//        TextEditor te = (TextEditor) context.getBean("textEditor");
//        te.spellCheck();
    }
}
