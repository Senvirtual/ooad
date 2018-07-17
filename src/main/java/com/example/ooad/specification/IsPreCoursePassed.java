package com.example.ooad.specification;

import com.example.ooad.domain.Course;
import com.example.ooad.domain.Student;

public class IsPreCoursePassed implements Specification {

    private boolean flag =false;
    @Override
    public boolean validate(Student student, Course course) {
        if (course.getPrerequisites().size()!=0){
            course.getPrerequisites().forEach((preCourse)->{
                preCourse.getOfferedAsSection().forEach((preSection)->{
                    if(student.getMySections().contains(preSection)==true){
                        student.getTranscript().getTranscriptEntries().forEach((myTranscript)->{
                            if (myTranscript.getSection().getSectionNo().equals(preSection.getSectionNo())){
                                Integer grade  = Integer.valueOf(myTranscript.getGrade());
                                Integer t =preCourse.getCredits();
                                if (grade>t/2){
                                    flag =true;
                                }
                            }
                        });
                    }
                });
            });
        }
        System.out.println(this.errorInf(flag));
        return flag;
    }

    @Override
    public String errorInf(boolean flag) {
        if (flag!=true){
            return "先修课程未通过";
        }else {
            return "先修课程已经通过";
        }
    }
}
