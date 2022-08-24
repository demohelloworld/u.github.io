package com.swjd.controller;

import com.swjd.mapper.StudentMapper;
import com.swjd.pojo.ResultPage;
import com.swjd.pojo.Student;
import com.swjd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;



    @RequestMapping("findAll/{currPage}")
    @ResponseBody
    public ResultPage getStudentAll(@PathVariable("currPage")Integer currPage){

        ResultPage page = studentService.findAll(currPage,5);

        return page;
    }



}
