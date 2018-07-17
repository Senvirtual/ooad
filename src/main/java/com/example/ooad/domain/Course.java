package com.example.ooad.domain;

import java.util.ArrayList;

public class Course {


    private Integer courseNo;

    private String courseName;

    private Integer credits;


    private String semester;

    private Integer preNo;


    private ArrayList<Course> prerequisites = new ArrayList<Course>();;

    private ArrayList<Section> offeredAsSection = new ArrayList<Section>();;

    public Course(){}

    public Course(Integer courseNo,String courseName,Integer credits){
        this.courseNo = courseNo;
        this.courseName = courseName;
        this.credits = credits;
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

    public Integer getPreNo() {
        return preNo;
    }

    public void setPreNo(Integer preNo) {
        this.preNo = preNo;
    }

    //    添加先修课程

    public void addPrerequisite(Course course){
        this.prerequisites.add(course);
    }

//    删除先修课程
    public void dropPrerequisite(Course course){
        this.prerequisites.remove(course);
    }

//    是否有先修课程
    public boolean hasPrerequisites(){
        if (this.prerequisites==null){
            return false;
        }else{
            return true;
        }
    }

//    生成班次
    public void ScheduleSection(Section section){
        this.offeredAsSection.add(section);
    }
    public void ScheduleSection(Integer sectionNo,String dayOfWeek,String timeOfDay,String room){
        Section section = new Section(sectionNo,dayOfWeek,timeOfDay,room);
        this.offeredAsSection.add(section);
    }

//    根据sectionNO寻找班次
    public Section findCurrentSection(Integer sectionNo){
        Section section = new Section();
        section.setSectionNo(sectionNo);
        this.offeredAsSection.forEach((mask)->{
            if (section.getSectionNo().equals(mask.getSectionNo())){
                section.setDayOfWeek(mask.getDayOfWeek());
                section.setTimeOfDay(mask.getTimeOfDay());
                section.setRoom(mask.getRoom());
                section.setSeatingCapacity(mask.getSeatingCapacity());
            }
        });
        return section;
    }
//    删除班次

    public void dropSection(Section section){
        this.offeredAsSection.remove(section);
    }


    public ArrayList<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(ArrayList<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public ArrayList<Section> getOfferedAsSection() {
        return offeredAsSection;
    }

    public void setOfferedAsSection(ArrayList<Section> offeredAsSection) {
        this.offeredAsSection = offeredAsSection;
    }
}
