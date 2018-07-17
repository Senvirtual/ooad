package com.example.ooad.dao;


import com.example.ooad.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    void deleteById(Integer id);
    List<Student> findAll();
    Student findStudentById(Integer id);
    Student findStudentByName(String ssn);
}
