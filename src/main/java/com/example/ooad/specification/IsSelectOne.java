package com.example.ooad.specification;

import com.example.ooad.domain.Course;
import com.example.ooad.domain.Student;

public class IsSelectOne implements Specification {

    private boolean flag =false;



    @Override
    public boolean validate(Student student, Course course) {
        course.getOfferedAsSection().forEach(
                (section)->{
                    student.getMySections().forEach((mySection)->{if (section.getSectionNo().equals(mySection.getSectionNo())){this.flag=true;}});
                }
        );
        System.out.println(this.errorInf(flag));
        return flag;
    }

    @Override
    public String errorInf(boolean flag) {
        if (flag==true){
            return "你已经选过该课程";
        }else {
            return "你未曾选过此课程";
        }
    }
}
