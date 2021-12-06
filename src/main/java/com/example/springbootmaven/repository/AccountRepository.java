package com.example.springbootmaven.repository;

import com.example.springbootmaven.vo.UsersVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Configuration;

@Configuration
@Mapper
public interface AccountRepository {
    String isExistID(UsersVO usersVO);
}
