package com.example.ooad.domain;

import java.util.HashMap;

public class Section {

    private Integer sectionNo;

    private String dayOfWeek;

    private String timeOfDay;


    private String room;

    private Integer seatingCapacity;


    private Integer courseNo;

    private Integer teacherNo;

    private HashMap<Student,TranscriptEntry> assignedGrade = new HashMap<Student,TranscriptEntry>();

    public Section(){}

    public Section(Integer sectionNo,String dayOfWeek,String timeOfDay,String room){
        this.sectionNo = sectionNo;
        this.dayOfWeek = dayOfWeek;
        this.timeOfDay = timeOfDay;
        this.room = room;
    }

    public Integer getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(Integer sectionNo) {
        this.sectionNo = sectionNo;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Integer getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(Integer seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public Integer getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(Integer courseNo) {
        this.courseNo = courseNo;
    }

    public Integer getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(Integer teacherNo) {
        this.teacherNo = teacherNo;
    }

    public HashMap<Student, TranscriptEntry> getAssignedGrade() {
        return assignedGrade;
    }

    public void setAssignedGrade(HashMap<Student, TranscriptEntry> assignedGrade) {
        this.assignedGrade = assignedGrade;
    }

//    根据学生查成绩
    public TranscriptEntry getTranscriptEntryByStudent(Student student){
        return this.assignedGrade.get(student);
    }



}
