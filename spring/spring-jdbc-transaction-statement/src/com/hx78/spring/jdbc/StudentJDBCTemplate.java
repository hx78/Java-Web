package com.hx78.spring.jdbc;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by linming on 2015/9/19 0019.
 */
public class StudentJDBCTemplate implements IStudentDAO {
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource ds) {
        this.jdbcTemplateObject = new JdbcTemplate(ds);
    }

    @Override
    public void create(String name, Integer age, Integer marks, Integer year) {
        try {
            String SQL1 = "insert into Student (name, age) values (?, ?)";
            jdbcTemplateObject.update( SQL1, name, age);

            // Get the latest student id to be used in Marks table
            String SQL2 = "select max(id) from Student";
            int sid = jdbcTemplateObject.queryForObject(SQL2, Integer.class);

            String SQL3 = "insert into Marks(sid, marks, year) " +
                    "values (?, ?, ?)";
            jdbcTemplateObject.update( SQL3, sid, marks, year);
            System.out.println("Created Name = " + name + ", Age = " + age);

            // to simulate the exception.
            throw new RuntimeException("simulate Error condition") ;
        } catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
            throw e;
        }
    }

    @Override
    public List<StudentMarks> listStudents() {
        return null;
    }
}
