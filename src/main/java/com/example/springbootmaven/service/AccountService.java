package com.example.springbootmaven.service;

import com.example.springbootmaven.vo.UsersVO;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

public interface AccountService {
    public void login(ModelAndView mView, HttpSession session, UsersVO usersVO);
}
