package com.hx78.spring.jdbc.service.impl;

import com.hx78.spring.jdbc.service.IHelloWorld;
import org.springframework.stereotype.Service;

/**
 * Created by linming on 2015/9/1 0001.
 */
@Service("helloWorld")
public class HelloWorldImpl implements IHelloWorld {
    @Override
    public void say() {
        System.out.println("hello world");
    }
}
