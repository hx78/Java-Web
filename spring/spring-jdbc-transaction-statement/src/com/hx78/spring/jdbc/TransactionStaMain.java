package com.hx78.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by linming on 2015/9/19 0019.
 */
public class TransactionStaMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        IStudentDAO studentJDBCTemplate =
                (IStudentDAO)context.getBean("studentJDBCTemplate");
        System.out.println("------Records creation--------" );
        studentJDBCTemplate.create("LM1", 11, 99, 2010);
        studentJDBCTemplate.create("LM2", 20, 97, 2010);
        studentJDBCTemplate.create("LM3", 25, 100, 2011);

        System.out.println("------Listing all the records--------" );
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }
    }
}
