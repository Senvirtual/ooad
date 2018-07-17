package com.example.ooad;


import com.example.ooad.domain.*;
import com.example.ooad.po.Identify;
import com.example.ooad.specification.IsInPlan;
import com.example.ooad.specification.IsPreCoursePassed;
import com.example.ooad.specification.IsSelectOne;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SectionTest {

    @Test
    public void sectionTest(){
        Professor pr1 = new Professor(1001,"张三","123456","教授","管理学院");
        Professor pr2 = new Professor(1002,"李四","123456","教授","理学院");
        Student st1 = new Student(001,"Tom","123456","电商","本科");
        Student st2 = new Student(002,"Sam","123456","电商","本科");
        ArrayList<Course> planOfStudy = new ArrayList<Course>();
        Course course1 = new Course(01,"高数",5);
        Course course2 = new Course(02,"线性代数",5);
        Course course3 = new Course(03,"概率论",5);
        Section sec1 = new Section(1,"周四","3，4节","教二B201");
        Section sec2 = new Section(2,"周一","3，4节","教四B201");
        Section sec3 = new Section(3,"周五","5，6节","教四B201");
        Section sec4 = new Section(4,"周一","3，4节","教四B201");
        Section sec5 = new Section(5,"周五","5，6节","教四B201");
        course1.addPrerequisite(course2);
        course1.ScheduleSection(sec1);
        course1.ScheduleSection(sec2);
        course2.ScheduleSection(sec3);
        course3.ScheduleSection(sec4);
        course3.ScheduleSection(sec5);
//        添加学习计划
        planOfStudy.add(course1);
        planOfStudy.add(course3);
        pr1.addSection(sec1);
        pr2.addSection(sec2);
//        老师选课
        pr1.addSection(sec1);
        pr1.addSection(sec2);
        pr1.addSection(sec3);
        pr2.addSection(sec4);
        pr2.addSection(sec5);
//        学生选课
        st1.setPlanOfStudy(planOfStudy);
        Identify identify = new Identify();
        if (identify.Identify(st1,course1)){
            st1.addSection(sec2);
        }
//        st1.getMySections().forEach(
//                (section)->{
//                    System.out.println(section.getSectionNo());
//                    System.out.println(section.getCourseNo());
//
//                }
//        );
//        if (identify.Identify(st1,course2)){
//            st1.addSection(sec3);
//        }


    }
}
