package com.example.ooad.service.serviceimpl;

import com.example.ooad.dao.ProfessorMapper;
import com.example.ooad.domain.Professor;
import com.example.ooad.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorServiceImpl implements ProfessorService {
    @Autowired
    ProfessorMapper professorMapper;
    @Override
    public Professor findById(Integer ssn) {
        return professorMapper.findById(ssn);
    }

    @Override
    public Professor findByName(String name) {
        return professorMapper.findByName(name);
    }
}
