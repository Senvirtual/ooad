package com.example.ooad.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Transcript {

    private Student studentOwner;

    private HashMap<Section,TranscriptEntry> gradeList = new HashMap<Section,TranscriptEntry>();

    private ArrayList<TranscriptEntry> transcriptEntries = new ArrayList<TranscriptEntry>();

    public Transcript(){

    }

    public Student getStudentOwner() {
        return studentOwner;
    }

    public void setStudentOwner(Student studentOwner) {
        this.studentOwner = studentOwner;
    }

    public ArrayList<TranscriptEntry> getTranscriptEntries() {
        return transcriptEntries;
    }

    public void addTranscriptEntry(TranscriptEntry transcriptEntry) {
        this.transcriptEntries.add(transcriptEntry);
    }

    //    指定成绩通过且有效
//    public void verifyCompletion(Student student) {
//
//    }
}
