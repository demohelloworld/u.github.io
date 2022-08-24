package com.swjd.controller;

import com.swjd.exception.UserNotFoundException;
import com.swjd.pojo.Doctor;
import com.swjd.pojo.Student;
import com.swjd.service.DoctorService;
import com.swjd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    DoctorService doctorService;

    @Autowired
    StudentService studentService;

    @RequestMapping("/signin")
    public String signin(Integer id, String password, Integer job) throws UserNotFoundException {
        if(job==1){
            Doctor d=doctorService.login(id,password);
        }else if (job==2){
            Student s=studentService.login(id,password);
        }else{
            System.out.println("系统管理员");
        }
        return "index";
    }
}
