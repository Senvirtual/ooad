package com.example.ooad.service.serviceimpl;

import com.example.ooad.dao.ProfessorMapper;
import com.example.ooad.dao.StudentMapper;
import com.example.ooad.domain.Professor;
import com.example.ooad.domain.Student;
import com.example.ooad.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    ProfessorMapper professorMapper;


    @Override
    public boolean loginByProfessor(String name, String pwd) {

        Student student = studentMapper.findStudentByName(name);
        if (student.getPassword().equals(pwd)){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean loginByStudent(String name, String pwd) {
        Professor professor = professorMapper.findByName(name);
        if (professor.getPassword().equals(pwd)){
            return true;
        }else {
            return false;
        }
    }
}
