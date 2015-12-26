package com.hx78.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by linming on 2015/12/26 0026.
 */
public class TeacherTest {

    public static void main(String[] args){
        //读取hibernate.cfg.xml文件
        Configuration cfg = new Configuration().configure();

        //建立SessionFactory
        SessionFactory factory = cfg.buildSessionFactory();

        //取得session
        Session session = null;
        try {
            session = factory.openSession();
            //开启事务
            session.beginTransaction();
            Teacher teacher = new Teacher();
            teacher.setAge(28);
            teacher.setName("ming");
            teacher.setTitle("college");

            //保存s对象
            session.save(teacher);

            //提交事务
            session.getTransaction().commit();
        }catch(Exception e) {
            e.printStackTrace();
            //回滚事务
            session.getTransaction().rollback();
        }finally {
            if (session != null) {
                if (session.isOpen()) {
                    //关闭session
                    session.close();
                }
            }
        }
    }
}
