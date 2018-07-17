package com.example.ooad.controller;

import com.example.ooad.domain.Professor;
import com.example.ooad.domain.Student;
import com.example.ooad.service.LoginService;
import com.example.ooad.service.ProfessorService;
import com.example.ooad.service.StudentService;
import com.example.ooad.service.serviceimpl.LoginServiceImpl;
import com.example.ooad.service.serviceimpl.ProfessorServiceImpl;
import com.example.ooad.service.serviceimpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "")
public class LoginController {

    @Autowired
    LoginService loginService;

    @Autowired
    StudentService studentService;
    @Autowired
    ProfessorService professorService;


    @RequestMapping(value="index")

    public String loginReturn(){

        return "index";

    }



    @RequestMapping(value="login")

    public String login(HttpServletRequest request,HttpSession session){
        String ssn = request.getParameter("username");
        String password = request.getParameter("password");
        if(request.getParameter("type").equals("student")){

            if(loginService.loginByStudent(ssn,password)){

                Student student = studentService.findStudentByName(ssn);
                session.setAttribute("user",student);

                return "redirect:/StudentIndex";

            }
        }
        if (request.getParameter("type").equals("teacher")){
            if (ssn.equals("root")){
                return "redirect:/CreateCourse";
            }
            if(loginService.loginByProfessor(ssn,password)){
                Professor professor = professorService.findByName(ssn);

                session.setAttribute("user",professor);

                return "redirect:/TeacherIndex";

            }
        }

        return "index";

    }
}
