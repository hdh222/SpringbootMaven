package com.example.springbootmaven.controller;

import com.example.springbootmaven.service.AccountService;
import com.example.springbootmaven.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("account/loginform")
    public String loginform(){
        return "account/loginform";
    }

    @PostMapping("account/login")
    public ModelAndView login(UsersVO usersVO, HttpSession session, ModelAndView mView){

        accountService.login(mView,session,usersVO);

        mView.setViewName("account/login");
        return mView;
    }
}
