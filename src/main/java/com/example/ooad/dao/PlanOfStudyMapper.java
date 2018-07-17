package com.example.ooad.dao;

import com.example.ooad.domain.PlanOfStudy;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanOfStudyMapper {

    List<PlanOfStudy> findBySemester(String semester);
}
