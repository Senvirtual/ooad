package com.example.ooad.service.serviceimpl;

import com.example.ooad.dao.StudentMapper;
import com.example.ooad.domain.Student;
import com.example.ooad.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public void deleteById(Integer id) {
        studentMapper.deleteById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public Student findStudentById(Integer id) {
        return studentMapper.findStudentById(id);
    }

    @Override
    public Student findStudentByName(String ssn) {
        return studentMapper.findStudentByName(ssn);
    }
}
