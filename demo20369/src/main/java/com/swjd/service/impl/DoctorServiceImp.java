package com.swjd.service.impl;

import com.swjd.exception.UserNotFoundException;
import com.swjd.mapper.DoctorMapper;
import com.swjd.pojo.Doctor;
import com.swjd.pojo.DoctorExample;
import com.swjd.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImp implements DoctorService {

    @Autowired
    DoctorMapper mapper;

    @Override
    public Doctor login(Integer id, String password) throws UserNotFoundException {
        DoctorExample example=new DoctorExample();
        DoctorExample.Criteria criteria=example.createCriteria();
        criteria.andDnoEqualTo(id);
        criteria.andPasswordEqualTo(password);
        List<Doctor> doctors=mapper.selectByExample(example);

        if(doctors==null||doctors.size()<=0){
            throw new UserNotFoundException("ID或者密码输入错误！");
        }

        return doctors.get(0);

    }
}
