package com.example.advanced.springdata.demo;

import com.example.advanced.springdata.demo.domains.User;
import com.example.advanced.springdata.demo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ComponentScan("com.example.advanced.springdata.demo")
@DataJpaTest
public class DemoApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void contextLoads() {
        userRepository.findAll();
        List<User> byQuery = userRepository.getByPass("");
        System.out.println(byQuery);
    }

}
