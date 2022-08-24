package com.swjd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swjd.exception.UserNotFoundException;
import com.swjd.mapper.DoctorMapper;
import com.swjd.mapper.StudentMapper;
import com.swjd.pojo.*;
import com.swjd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    StudentMapper mapper;

    @Override
    public Student login(Integer id, String password) throws UserNotFoundException {
        StudentExample example=new StudentExample();
        StudentExample.Criteria criteria=example.createCriteria();
        criteria.andSnEqualTo(id);
        criteria.andPasswordEqualTo(password);
        List<Student> students = mapper.selectByExample(example);

        if (students==null||students.size()<=0){
            throw new UserNotFoundException("ID或者密码输入错误！");
        }
        return students.get(0);
    }

    @Override
    public ResultPage findAll(Integer currPage,Integer pageSize) {
        ResultPage page=new ResultPage();
        PageHelper.startPage(currPage,pageSize);
        StudentExample example=new StudentExample();
        List<Student> students = mapper.selectByExample(example);

        PageInfo<Student> info=new PageInfo<Student>(students);

        page.setCurrPage(info.getPageNum());
        page.setPage(info.getPages());
        page.setPageList(info.getList());
        page.setPageSize(info.getPageSize());
        page.setTotal(info.getTotal());

        return page;
    }
}
