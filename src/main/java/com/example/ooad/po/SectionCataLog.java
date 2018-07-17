package com.example.ooad.po;

import com.example.ooad.domain.*;

public class SectionCataLog {

    private Student student;

    private Course course;

    private Professor professor;

    private Section section;

    private TranscriptEntry transcriptEntry;

    public SectionCataLog(){}


    public SectionCataLog(Student student,TranscriptEntry transcriptEntry,Section section){

        this.student =student;
        this.transcriptEntry = transcriptEntry;
        this.section = section;
    }

    public SectionCataLog(Section section,Course course){
        this.section = section;
        this.course = course;
    }


    public SectionCataLog(Section section,TranscriptEntry transcriptEntry){
        this.section = section;
        this.transcriptEntry = transcriptEntry;
    }

    public SectionCataLog(Course course,Professor professor,Section section){
        this.course = course;
        this.professor = professor;
        this.section = section;
    }

    public SectionCataLog(Course course,Section section,TranscriptEntry transcriptEntry){
        this.course = course;
        this.section = section;
        this.transcriptEntry = transcriptEntry;
    }


    public SectionCataLog(Course course,Professor professor,Section section,TranscriptEntry transcriptEntry){
        this.course = course;
        this.professor = professor;
        this.section = section;
        this.transcriptEntry = transcriptEntry;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public TranscriptEntry getTranscriptEntry() {
        return transcriptEntry;
    }

    public void setTranscriptEntry(TranscriptEntry transcriptEntry) {
        this.transcriptEntry = transcriptEntry;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
