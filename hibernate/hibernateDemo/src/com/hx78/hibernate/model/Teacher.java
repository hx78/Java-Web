package com.hx78.hibernate.model;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by linming on 2015/12/26 0026.
 */
@Entity
public class Teacher {
    private int id;
    private String name;
    private int age;
    private String title;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
