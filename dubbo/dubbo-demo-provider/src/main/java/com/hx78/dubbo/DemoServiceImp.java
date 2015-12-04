package com.hx78.dubbo;

/**
 * Created by linming on 2015/12/3 0003.
 */
public class DemoServiceImp implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
