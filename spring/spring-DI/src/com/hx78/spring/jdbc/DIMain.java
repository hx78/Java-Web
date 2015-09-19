package com.hx78.spring.jdbc;

import com.hx78.spring.jdbc.service.IHelloWorld;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Created by linming on 2015/8/31 0031.
 */
public class DIMain {
    @Resource(name = "helloWorld")
    public IHelloWorld helloWorld = null;

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();

        //context.start();
        Profile profile = (Profile) context.getBean("profile");
        profile.printName();
        profile.printAge();

        //helloWorld.say();

       /* 这里你需要注册一个关闭钩 registerShutdownHook() 方法，该方法在 Ab
        stractApplicationContext 类中被声明。这将确保一个完美的关闭并调用相关的销毁方法。
        */
        context.registerShutdownHook();
    }
}
