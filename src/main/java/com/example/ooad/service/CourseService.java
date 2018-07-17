package com.example.ooad.service;

import com.example.ooad.domain.Course;

import java.util.List;

public interface CourseService {
    void createCourse(Course course);

    void deleteCourseById(Integer id);

    List<Course> findAll();

    Course findById(Integer id);
    Course findCourseByTransId(Integer id);
}
