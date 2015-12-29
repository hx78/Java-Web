package com.hx78.struts;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by linming on 2015/12/28 0028.
 */
public class Login  extends ActionSupport{

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("login execute");
        if (username.equals("admin") && password.equals("123456")) {
            return "success";
        } else {
            return "error";
        }
    }
}
