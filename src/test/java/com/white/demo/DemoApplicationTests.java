package com.white.demo;

import com.white.jpa.UserJPA;
import com.white.mapper.UserMapper;
import com.white.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.white")
public class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @PersistenceContext
    private EntityManager em;

//    @Autowired
//    private UserJPA userJPA;

    @Test
    public void contextLoads() {
        System.out.println(userMapper.selectById(1).getName());
//        Optional<User> byId = userJPA.findById(1);
//        User user = byId.get();
//        System.out.println(user.getName());
        em.find(User.class, 1);
    }

}
