package com.swjd.service;

import com.swjd.exception.UserNotFoundException;
import com.swjd.pojo.Doctor;

public interface DoctorService {
    Doctor login(Integer id, String password) throws UserNotFoundException;
}
