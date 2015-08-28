package com.hx78.webapps.DAO;

import com.hx78.webapps.DTO.userEntity;

/**
 * Created by linming on 2015/8/21 0021.
 */
public interface userDaoInterface {
    public userEntity query(int id);
    public int insert(userEntity user);
    public int delete(int id);
    public int update(userEntity user);
}
