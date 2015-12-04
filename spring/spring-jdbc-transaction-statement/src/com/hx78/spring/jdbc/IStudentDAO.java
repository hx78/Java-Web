package com.hx78.spring.jdbc;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by linming on 2015/9/19 0019.
 */
public interface IStudentDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);
    /**
     * This is the method to be used to create
     * a record in the Student and Marks tables.
     */
    public void create(String name, Integer age, Integer marks, Integer year);
    /**
     * This is the method to be used to list down
     * all the records from the Student and Marks tables.
     */
    public List<StudentMarks> listStudents();
}
