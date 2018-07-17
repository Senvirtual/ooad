package com.example.ooad.po;

import com.example.ooad.dao.*;
import com.example.ooad.domain.*;
import com.example.ooad.service.CourseService;
import com.example.ooad.service.ProfessorService;
import com.example.ooad.service.SectionService;
import com.example.ooad.service.TranscriptEntryService;
import com.example.ooad.service.serviceimpl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public  class CourseCatalogFactory {
    @Autowired
    CourseService courseService;
    @Autowired
    SectionService sectionService;
    @Autowired
    ProfessorService professorService;
    @Autowired
    TranscriptEntryService transcriptEntryService;


            public  List<CourseCatalog> CreateCourseCatalog(List<CourseCatalog> courseCatalogList,List<TranscriptEntry> transcriptEntryList){

                transcriptEntryList.forEach((trans->{
                    Section section = sectionService.findById(trans.getSectionNo());
                    Course course = courseService.findById(section.getCourseNo());
                    CourseCatalog courseCatalog = new CourseCatalog(course,trans);
                    courseCatalogList.add(courseCatalog);
                }));
                return  courseCatalogList;
                }

                public List<SectionCataLog> CreateSectionCatalog(List<SectionCataLog> sectionCataLogList,List<TranscriptEntry> transcriptEntryList){
                transcriptEntryList.forEach((trans)->{
                    Course course = courseService.findCourseByTransId(trans.getId());
                    Section section = sectionService.findById(trans.getSectionNo());
                    Professor professor = professorService.findById(section.getTeacherNo());
                    SectionCataLog  sectionCataLog = new SectionCataLog(course,professor,section,trans);
                    sectionCataLogList.add(sectionCataLog);
                });
                return sectionCataLogList;
                }

}
