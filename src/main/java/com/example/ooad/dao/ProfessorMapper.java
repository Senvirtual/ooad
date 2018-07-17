package com.example.ooad.dao;

import com.example.ooad.domain.Professor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorMapper {

    Professor findById(Integer ssn);

    Professor findByName(String name);
}
