package com.example.springbootmaven.service;

import com.example.springbootmaven.repository.AccountRepository;
import com.example.springbootmaven.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void login(ModelAndView mView, HttpSession session, UsersVO usersVO) {

        String id = accountRepository.isExistID(usersVO);

        if(id != null){
            session.setAttribute("id", id);
            mView.addObject("id", id);
        }

    }
}
