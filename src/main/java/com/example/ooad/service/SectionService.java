package com.example.ooad.service;

import com.example.ooad.domain.Section;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface SectionService {

    void deleteById(Integer id);

    List<Section> findByTeacherId(Integer id);
    List<Section> findByCourseId(Integer id);
    Section findById(Integer id);
    void update(Section section);
    List<Section> findAll();
    List<Section> findCanSelect();

}
