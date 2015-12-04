package com.hx78.spring.jdbc.jdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by linming on 2015/9/6 0006.
 */
public class StudentDaoImpl implements IStudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(String name, Integer age) {
        String SQL = "insert into Student (name, age) values (?, ?)";
        jdbcTemplateObject.update(SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }

    public Student getStudent(Integer id) throws DataAccessException {
        String SQL = "select * from Student where id = ?";
        Student student = null;
        student = (Student) jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new StudentMapper());
        return student;
    }

    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List<Student> students = null;
        students = jdbcTemplateObject.query(SQL,
                new StudentMapper());
        return students;
    }

    public void delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id);
        return;
    }

    public void update(Integer id, Integer age) {
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id);
        return;
    }

}
