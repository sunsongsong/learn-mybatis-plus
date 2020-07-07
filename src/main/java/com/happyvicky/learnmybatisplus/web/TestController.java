package com.happyvicky.learnmybatisplus.web;

import com.happyvicky.learnmybatisplus.entity.User;
import com.happyvicky.learnmybatisplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: sunss
 * @Date: 2020/7/7 16:18
 * @Version: 1.0
 */
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/test")
    public void test(){
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
