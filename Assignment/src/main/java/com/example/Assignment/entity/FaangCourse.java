package com.example.Assignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//FaangCourse class must be present in both api's
@Entity
@Table
public class FaangCourse {
    @Id
    @Column
    Integer no;
    @Column
    String course;
    @Column
    String company;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public FaangCourse(Integer no, String course, String company) {
        this.no = no;
        this.course = course;
        this.company = company;
    }
   public FaangCourse(){

    }
}
