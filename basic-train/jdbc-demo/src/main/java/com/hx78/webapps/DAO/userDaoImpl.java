package com.hx78.webapps.DAO;

import com.hx78.webapps.DTO.userEntity;
import com.hx78.webapps.utils.ConnectorFactory;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by linming on 2015/8/21 0021.
 */
public class userDaoImpl implements userDaoInterface {

    @Override
    public userEntity query(int id) {
        userEntity userEntity;
        ConnectorFactory connectorFactory = ConnectorFactory.getInstance();
        Connection connection = connectorFactory.getConnection();
        if (connection != null) {

            try {
                Statement statement = connection.createStatement();
                String sql = "select * from table1 where id=1";
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    userEntity = new userEntity();
                    userEntity.setId(resultSet.getInt("id"));
                    userEntity.setName(resultSet.getString("name"));
                    userEntity.setJob(resultSet.getString("job"));
                    userEntity.setDate(resultSet.getDate("date"));

                    return userEntity;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return null;
    }

    @Override
    public int insert(userEntity user) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int update(userEntity user) {
        return 0;
    }
}
