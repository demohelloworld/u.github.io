package com.swjd.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({com.swjd.exception.UserNotFoundException.class})
    public String toSignin(Exception e, Model model){
        model.addAttribute("msg",e.getMessage());
        return "redirect:/page/signin";
    }

    @ExceptionHandler({java.lang.Exception.class})
    public String toError(Exception e, Model model){
        model.addAttribute("msg",e.getMessage());
        e.printStackTrace();
        return "error";
    }
}
