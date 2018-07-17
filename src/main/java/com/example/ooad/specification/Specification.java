package com.example.ooad.specification;

import com.example.ooad.domain.Course;
import com.example.ooad.domain.Section;
import com.example.ooad.domain.Student;

public interface Specification<T> {
    boolean validate(Student student, Course course);

    String errorInf(boolean flag);
}
