package com.powernode.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Student {
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    public Student() {
    }

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
