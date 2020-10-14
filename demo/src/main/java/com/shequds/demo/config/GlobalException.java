package com.shequds.demo.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@ControllerAdvice
public class GlobalException {


    @ExceptionHandler(Exception.class)
    public String error(HttpServletRequest request, HttpServletResponse response, Exception ex)throws Exception{
         log.info("统一异常处理配置@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return "error";
    }

}
