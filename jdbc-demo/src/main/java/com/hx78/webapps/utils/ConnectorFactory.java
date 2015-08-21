package com.hx78.webapps.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by linming on 2015/8/21 0021.
 */
public class ConnectorFactory {
    private static ConnectorFactory instance;
    private ConnectorFactory(){}
    private static String driver;
    private static String driverManager;
    private static String user;
    private static String pwd;
    static {
        Properties properties = new Properties();
        try {
            InputStream inputStream = ConnectorFactory.class.getResourceAsStream("/database.properties");
            if (inputStream != null) {
//                System.out.println("inputStream is not null");
                properties.load(inputStream);
                driver = properties.getProperty("driver");
                driverManager = properties.getProperty("driverManager");
                user = properties.getProperty("user");
                pwd = properties.getProperty("pwd");
//                System.out.println(driver);
//                System.out.println(driverManager);
//                System.out.println(user);
//                System.out.println(pwd);
            }
            else {
                System.out.println("inputStream is null");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ConnectorFactory getInstance(){
        if (instance == null) {
            instance = new ConnectorFactory();
            return instance;
        }
        else {
            return instance;
        }
    }

    public Connection getConnection() {
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(driverManager, user, pwd);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
