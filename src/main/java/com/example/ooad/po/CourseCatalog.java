package com.example.ooad.po;

import com.example.ooad.domain.Course;
import com.example.ooad.domain.TranscriptEntry;

public class CourseCatalog {


    private Integer courseNo;

    private String courseName;

    private Integer credits;


    private String semester;

    private String grade;

    public CourseCatalog(){}

    public CourseCatalog(Course course, TranscriptEntry transcriptEntry){
        this.courseNo = course.getCourseNo();
        this.courseName = course.getCourseName();
        this.credits = course.getCredits();
        this.semester = course.getSemester();
        this.grade = transcriptEntry.getGrade();

    }

    public Integer getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(Integer courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
