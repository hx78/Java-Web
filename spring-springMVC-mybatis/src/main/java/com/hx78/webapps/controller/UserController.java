package com.hx78.webapps.controller;

import com.hx78.webapps.service.IUserService;
import com.hx78.webapps.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by linming on 2015/8/25 0025.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

//    public void setUserService(IUserService userService) {
//        this.userService = userService;
//    }

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        System.out.println("userId:" + userId);
        User user = this.userService.getUserById(userId);
        System.out.println(user.getUserName());
        model.addAttribute("user", user);
        return "showUser";
    }
}
