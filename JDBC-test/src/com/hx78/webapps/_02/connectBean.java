package com.hx78.webapps._02;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by linming on 2015/8/24 0024.
 */
public class connectBean {
    Connection conn=null;
    public connectBean(){
        this.connect();
    }

    public Connection getConn(){
        return this.conn;
    }
    public boolean connect(){
        try{
            //使用JDBC桥创建数据库连接
//            Class.forName("org.gjt.mm.MYSQL.Driver").newInstance();
            Class.forName("com.mysql.jdbc.Driver");

            //使用DriverManager类的getConnection()方法建立连接
            //第一个参数定义用户名，第二个参数定义密码
//            this.conn=java.sql.DriverManager.getConnection("
//                    jdbc:MYSQL://localhost:3306/logindemo?useUnicode=true&characterEncoding=gb2312",
//            "root","123456");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}
