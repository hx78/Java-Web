package com.hx78.webapps;

import com.hx78.webapps.DAO.userDaoImpl;
import com.hx78.webapps.DTO.userEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by linming on 2015/8/21 0021.
 */
public class JDBCDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        userDaoImpl userDao = new userDaoImpl();
        userEntity userEntity;

        //query
        userEntity = userDao.query(1);
        if (userEntity != null) {
            System.out.println(userEntity.toString());
        }
        else {
            System.out.println("user is not exists of something error");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
