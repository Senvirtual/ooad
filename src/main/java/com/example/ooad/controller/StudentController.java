package com.example.ooad.controller;

import com.example.ooad.domain.*;
import com.example.ooad.po.CourseCatalog;
import com.example.ooad.po.CourseCatalogFactory;
import com.example.ooad.po.SectionCataLog;
import com.example.ooad.po.Transform;
import com.example.ooad.service.*;
import com.example.ooad.service.serviceimpl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "")
public class StudentController {

    @Autowired
    CourseCatalogFactory courseCatalogFactory;

    @Autowired
    ProfessorService professorService;

    @Autowired
    StudentService studentService;

    @Autowired
    TranscriptEntryService transcriptEntryService;

    @Autowired
    CourseService courseService;

    @Autowired
    SectionService sectionService;

    @Autowired
    Transform transform;

    @RequestMapping(value = "StudentIndex")
    public ModelAndView toIndex(HttpSession session){
        Student student = (Student)session.getAttribute("user");
        List<TranscriptEntry> transcriptEntryList = new ArrayList<TranscriptEntry>();
        transcriptEntryService.findByStudentId(student.getSsn()).forEach((flag)->{if (flag.getGrade()!=null){transcriptEntryList.add(flag);}});
        List<CourseCatalog> courseCatalogList = new ArrayList<CourseCatalog>();
        courseCatalogList =courseCatalogFactory.CreateCourseCatalog(courseCatalogList,transcriptEntryList);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("courseCatalogList",courseCatalogList);
        modelAndView.setViewName("StudentIndex");
        return modelAndView;
    }
    @RequestMapping(value = "SearchCourse")
    public ModelAndView toFilter(HttpSession session){
        Student student = (Student)session.getAttribute("user");
        List<TranscriptEntry> transcriptEntryList = new ArrayList<TranscriptEntry>();
        transcriptEntryService.findByStudentId(student.getSsn()).forEach((flag)->{if (flag.getGrade()==null){transcriptEntryList.add(flag);}});
        List<SectionCataLog> sectionCatalogList = new ArrayList<SectionCataLog>();
        sectionCatalogList = courseCatalogFactory.CreateSectionCatalog(sectionCatalogList,transcriptEntryList);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("sectionCatalogList",sectionCatalogList);
        modelAndView.setViewName("SearchCourse");
        return modelAndView;
    }
    @RequestMapping(value = "deleteCourseByStudent/{id}")

    public String deleteSelected(@PathVariable Integer id){
        transcriptEntryService.deleteById(id);
        return "redirect:/SearchCourse";
    }
    @RequestMapping(value = "addCourseByStudent/{id}")

    public String addSelected(@PathVariable Integer id,HttpSession session){
        Student student = (Student)session.getAttribute("user");
        TranscriptEntry transcriptEntry = new TranscriptEntry();
        transcriptEntry.setStudentNo(student.getSsn());
        transcriptEntry.setSectionNo(id);
        transcriptEntryService.insert(transcriptEntry);
        return "redirect:/SearchCourse";
    }
    @RequestMapping(value = "SelectCourse")
    public ModelAndView toSelect(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        String semester = "2016第一学期";
        List<SectionCataLog> sectionCataLogList = new ArrayList<SectionCataLog>();
        sectionCataLogList = transform.getSectionCataLogList(sectionCataLogList,semester);
        modelAndView.addObject("sectionCataLogList",sectionCataLogList);
        modelAndView.setViewName("SelectCourse");
        return  modelAndView;
    }
//    添加sectionm没写


    @RequestMapping(value = "SearchGrade")
    public ModelAndView toSearchGrade(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        Student student = (Student)session.getAttribute("user");
        List<SectionCataLog> sectionCataLogList = new ArrayList<SectionCataLog>();
        sectionCataLogList = transform.getSectionCataLogList(sectionCataLogList,student.getSsn());
        modelAndView.addObject("sectionCataLogList",sectionCataLogList);
        modelAndView.setViewName("SearchGrade");
        return  modelAndView;
    }


}
