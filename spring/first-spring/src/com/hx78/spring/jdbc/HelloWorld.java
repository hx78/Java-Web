package com.hx78.spring.jdbc;

/**
 * Created by linming on 2015/8/31 0031.
 */
public class HelloWorld implements IHelloWorld {
    public String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayHello() {
        System.out.print("message:" + message);
    }
}
