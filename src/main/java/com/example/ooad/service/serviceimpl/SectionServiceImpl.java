package com.example.ooad.service.serviceimpl;

import com.example.ooad.dao.SectionMapper;
import com.example.ooad.domain.Section;
import com.example.ooad.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {

    @Autowired
    SectionMapper sectionMapper;

    @Override
    public void deleteById(Integer id) {
        sectionMapper.deleteById(id);
    }

    @Override
    public List<Section> findByTeacherId(Integer id) {
        return sectionMapper.findByTeacherId(id);
    }

    @Override
    public List<Section> findByCourseId(Integer id) {
        return sectionMapper.findByCourseId(id);
    }

    @Override
    public Section findById(Integer id) {
        return sectionMapper.findById(id);
    }

    @Override
    public void update(Section section) {
        sectionMapper.update(section);
    }

    @Override
    public List<Section> findAll() {
        return sectionMapper.findAll();
    }

    @Override
    public List<Section> findCanSelect() {
        List<Section> sections = new ArrayList<Section>();
        sectionMapper.findAll().forEach(
                (flag)->{
                    if (flag.getTeacherNo()==null){
                        sections.add(flag);
                    }
                }
        );
        return sections;
    }
}
