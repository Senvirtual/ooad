package com.example.ooad.service.serviceimpl;

import com.example.ooad.dao.CourseMapper;
import com.example.ooad.dao.SectionMapper;
import com.example.ooad.dao.TranscriptEntryMapper;
import com.example.ooad.domain.Course;
import com.example.ooad.domain.Section;
import com.example.ooad.domain.TranscriptEntry;
import com.example.ooad.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;

    @Autowired
    TranscriptEntryMapper transcriptEntryMapper;

    @Autowired
    SectionMapper sectionMapper;
    @Override
    public void createCourse(Course course) {
        courseMapper.createCourse(course);
    }

    @Override
    public void deleteCourseById(Integer id) {
        courseMapper.deleteCourseById(id);

    }

    @Override
    public List<Course> findAll() {
        return courseMapper.findAll();
    }

    @Override
    public Course findById(Integer id) {
        return courseMapper.findById(id);
    }

    @Override
    public Course findCourseByTransId(Integer id){
        TranscriptEntry transcriptEntry = transcriptEntryMapper.findById(id);
        Section section = sectionMapper.findById(transcriptEntry.getSectionNo());
        return courseMapper.findById(section.getCourseNo());
    }
}
