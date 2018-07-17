package com.example.ooad.dao;

import com.example.ooad.domain.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {
    void createCourse(Course course);

    void deleteCourseById(Integer id);

    List<Course> findAll();

    Course findById(Integer id);




}
