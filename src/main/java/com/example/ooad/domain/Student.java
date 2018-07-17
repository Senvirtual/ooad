package com.example.ooad.domain;

import java.util.ArrayList;

public class Student extends Person{

    public boolean flag = false;

    private String major;

    private String degree;

    private Transcript transcript;

    private ArrayList<Section> mySections = new ArrayList<Section>();

    private ArrayList<Course> planOfStudy = new ArrayList<Course>();


    public Student(Integer ssn,String name,String password,String major, String degree){
        super(ssn,name,password);
        this.major = major;
        this.degree = degree;
    }

    public ArrayList<Section> getMySections() {
        return mySections;
    }

    public void setMySections(ArrayList<Section> mySections) {
        this.mySections = mySections;
    }

    public ArrayList<Course> getPlanOfStudy() {
        return planOfStudy;
    }

    public void setPlanOfStudy(ArrayList<Course> planOfStudy) {
        this.planOfStudy = planOfStudy;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

//    返回当前已选Section

    public ArrayList<Section> getEnrolledSections() {
        return mySections;
    }

//    添加Section
    public void addSection(Section section) {
        this.mySections.add(section);
    }
//    删除Section

    public void dropSection(Section section){
        this.mySections.remove(section);
    }

//    Section是否已选
    public boolean IsEnrolledIn(Section section){
        this.mySections.forEach((theSection)->{
            if (theSection.getSectionNo().equals(section.getSectionNo())){
                this.flag = true;
            }else {
                this.flag = false;
            }
        });
        return this.flag;
    }

    public void displayCourseSchedule(){

    }
}
