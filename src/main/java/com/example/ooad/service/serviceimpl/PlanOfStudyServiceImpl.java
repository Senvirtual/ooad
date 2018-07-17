package com.example.ooad.service.serviceimpl;

import com.example.ooad.dao.PlanOfStudyMapper;
import com.example.ooad.domain.PlanOfStudy;
import com.example.ooad.service.PlanOfStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanOfStudyServiceImpl implements PlanOfStudyService {

    @Autowired
    PlanOfStudyMapper planOfStudyMapper;
    @Override
    public List<PlanOfStudy> findBySemester(String semester) {
        return planOfStudyMapper.findBySemester(semester) ;
    }
}
