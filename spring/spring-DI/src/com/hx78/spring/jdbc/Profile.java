package com.hx78.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by linming on 2015/9/1 0001.
 */
public class Profile {
    @Autowired
    @Qualifier("student1")
    private Student student;

    public Profile(){
        System.out.println("Inside Profile constructor." );
    }

    public void printAge() {
        System.out.println("Age : " + student.getAge() );
    }

    public void printName() {
        System.out.println("Name : " + student.getName() );
    }
}
