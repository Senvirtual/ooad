package com.example.ooad.specification;

import com.example.ooad.domain.Course;
import com.example.ooad.domain.Student;

public class IsInPlan implements Specification {

    private boolean flag =false;
    @Override
    public boolean validate(Student student, Course course) {
        student.getPlanOfStudy().forEach((myCourse)->
        {if (myCourse.getCourseNo().equals(course.getCourseNo())){this.flag=true;}});
        System.out.println(this.errorInf(flag));
        return flag;
    }

    @Override
    public String errorInf(boolean flag) {
        if (flag==true){
            return "学习计划中有此课程";
        }else {
            return "学习计划中没有此课程";
        }
    }
}
