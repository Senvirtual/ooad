package com.example.ooad;

import com.example.ooad.service.serviceimpl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OOADApplicationTests {


    @Autowired
    StudentServiceImpl studentService;

    @Test
    public void testMapper(){
        studentService.findAll().forEach((flag)->{
            System.out.println("开始");
            System.out.println(flag.getDegree());
        });
    }

}
