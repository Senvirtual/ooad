package com.example.ooad.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapper {

    boolean loginByProfessor(String name,String pwd);

    boolean loginByStudent(String name,String pwd);

}
