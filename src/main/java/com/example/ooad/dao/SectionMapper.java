package com.example.ooad.dao;

import com.example.ooad.domain.Section;
import com.example.ooad.domain.TranscriptEntry;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionMapper {

    void deleteById(Integer id);

    List<Section> findByTeacherId(Integer id);
    List<Section> findByCourseId(Integer id);
    Section findById(Integer id);
    void update(Section section);
    List<Section> findAll();

}
