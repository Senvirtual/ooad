package com.example.ooad.domain;


public class TranscriptEntry {

    private Integer id;

    private String grade;

    private Student student;

    private Section section;

    private Integer studentNo;

    private Integer sectionNo;

    public TranscriptEntry(){

    }
    public TranscriptEntry(String grade,Student student,Section section){
        this.grade = grade;
        this.student = student;
        this.section = section;
    }


    public String getGrade() {
        return grade;
    }


    public void setGrade(String grade) {
        this.grade = grade;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }


    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public Integer getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(Integer sectionNo) {
        this.sectionNo = sectionNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
