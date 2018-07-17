package com.example.ooad.domain;

import java.util.ArrayList;

public class Professor extends Person{

    private String title;

    private String department;

    private ArrayList<Student> advisees = new ArrayList<Student>();

    public ArrayList<Section> teaches = new ArrayList<Section>();

    public Professor(Integer ssn,String name,String password,String title,String department){

        super(ssn,name,password);
        this.title = title;
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //    添加指导学生

    public void addStudent(Student student){
        this.advisees.add(student);
    }

//    删除指导学生
    public void dropStudent(Student student){
        this.advisees.remove(student);
    }

//    添加班次
    public void addSection(Section section){
        this.teaches.add(section);
    }
//   删除班次
    public void dropSection(Section section){
        this.teaches.remove(section);
    }
}
