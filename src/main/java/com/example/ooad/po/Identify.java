package com.example.ooad.po;

import com.example.ooad.domain.Course;
import com.example.ooad.domain.Student;
import com.example.ooad.specification.IsInPlan;
import com.example.ooad.specification.IsPreCoursePassed;
import com.example.ooad.specification.IsSelectOne;

public class Identify {
    private boolean canSelect ;
    IsInPlan isInPlan = new IsInPlan();
    IsPreCoursePassed isPreCoursePassed = new IsPreCoursePassed();
    IsSelectOne isSelectOne = new IsSelectOne();

    public boolean Identify(Student student,Course course){
        if (course.getPrerequisites().size()==0){
            if (isInPlan.validate(student,course)==true &isSelectOne.validate(student,course)==false){
                canSelect =true;
            }
        }else {
            if (isInPlan.validate(student,course)==true &isSelectOne.validate(student,course)==false&isPreCoursePassed.validate(student, course)==true){
                canSelect = true;
            }
        }
        System.out.println(canSelect);
        System.out.println(this.errorInf(canSelect));
        return canSelect;
    }

    public String errorInf(boolean flag){
        if (flag){
            return "选课成功";
        }else {
            return "选课失败";
        }

    }
}
