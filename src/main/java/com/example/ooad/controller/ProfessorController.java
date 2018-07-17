package com.example.ooad.controller;


import com.example.ooad.domain.Professor;
import com.example.ooad.domain.Section;
import com.example.ooad.domain.Student;
import com.example.ooad.domain.TranscriptEntry;
import com.example.ooad.po.SectionCataLog;
import com.example.ooad.po.Transform;
import com.example.ooad.service.SectionService;
import com.example.ooad.service.TranscriptEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "")

public class ProfessorController {

    @Autowired
    Transform transform;

    @Autowired
    SectionService sectionService;

    @Autowired
    TranscriptEntryService transcriptEntryService;

    @RequestMapping(value = "TeacherIndex")
    public ModelAndView toTeacherIndex(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        Professor teacher = (Professor)session.getAttribute("user");
        List<SectionCataLog> sectionCataLogList = new ArrayList<SectionCataLog>();
        sectionCataLogList = transform.getProfessorSectionCataLogList(sectionCataLogList,teacher.getSsn());
        modelAndView.addObject("sectionCatalogList",sectionCataLogList);
        modelAndView.setViewName("TeacherIndex");
        return modelAndView;
    }

        @RequestMapping(value = "deleteSectionFromTeacher/{id}")
    public String deleteSelected(@PathVariable Integer id){
        Section section = sectionService.findById(id);
        section.setTeacherNo(null);
        sectionService.update(section);
        return "redirect:/TeacherIndex";
    }
    @RequestMapping(value = "TeacherSelectCourse")
    public ModelAndView selectCourse(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        Professor teacher = (Professor)session.getAttribute("user");
        List<Section>sectionList = sectionService.findCanSelect();
        List<SectionCataLog> sectionCataLogList = new ArrayList<SectionCataLog>();
        sectionCataLogList = transform.getProfessorSectionCataLogList(sectionCataLogList,sectionList,teacher.getSsn());
        modelAndView.addObject("sectionCatalogList",sectionCataLogList);
        modelAndView.setViewName("TeacherSelectCourse");
        return modelAndView;
    }
    @RequestMapping(value = "addSectionFromTeacher/{id}")

    public String addSelected(@PathVariable Integer id){
        Section section = sectionService.findById(id);
        section.setTeacherNo(id);
        sectionService.update(section);
        return "redirect:/TeacherSelectCourse";
    }

    @RequestMapping(value = "lookSectionFromTeacher/{id}")
    public ModelAndView LookCourse(HttpSession session,@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView();
        Professor teacher = (Professor)session.getAttribute("user");
        Section section = sectionService.findById(id);
        List<SectionCataLog> sectionCataLogList = new ArrayList<SectionCataLog>();
        sectionCataLogList = transform.getProfessorSectionCataLogList(sectionCataLogList,section);
        modelAndView.addObject("sectionCatalogList",sectionCataLogList);
        modelAndView.setViewName("SearchStudent");
        return modelAndView;
    }

    @RequestMapping(value = "editGrade")
    public String createCourse(Integer id, String grade,
                                     HttpSession session){
//        Integer myId = Integer.valueOf(id);
        TranscriptEntry transcriptEntry = transcriptEntryService.findById(id);
        transcriptEntry.setGrade(grade);
        transcriptEntryService.update(transcriptEntry);
        return "redirect:/TeacherIndex";
    }

    @RequestMapping(value = "CreateCourse")
    public ModelAndView createCourse(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("CreateCourse");
        return modelAndView;
    }

    @RequestMapping(value = "CourseInformation")
    public ModelAndView CourseInformation(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("CourseInformation");
        return modelAndView;
    }


}
