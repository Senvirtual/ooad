package com.example.ooad.service;


import com.example.ooad.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface StudentService {
    void deleteById(Integer id);
    List<Student> findAll();
    Student findStudentById(Integer id);
    Student findStudentByName(String ssn);
}
