package com.swjd.service;

import com.swjd.exception.UserNotFoundException;
import com.swjd.pojo.ResultPage;
import com.swjd.pojo.Student;

import java.util.List;

public interface StudentService {
    Student login(Integer id, String password) throws UserNotFoundException;

    ResultPage findAll(Integer currPage, Integer pageSize);
}
