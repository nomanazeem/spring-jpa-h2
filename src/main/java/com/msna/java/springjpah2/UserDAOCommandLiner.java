package com.msna.java.springjpah2;

import com.msna.java.springjpah2.entity.User;
import com.msna.java.springjpah2.repository.IUserDAORepository;
import com.msna.java.springjpah2.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserDAOCommandLiner implements CommandLineRunner {

    @Autowired
    private UserDAOService userDAOService;
    private  static final Logger log = LoggerFactory.getLogger(UserDAOCommandLiner.class);


    @Override
    public void run(String... args) throws Exception {

        //User 1
        User user = new User("Azeem 1", "Admin");
        long id = userDAOService.Insert(user);

        log.info("New user :"+user);

        //User 2
        User user2 = new User("Asif Khan 1", "Employee");
        long id2 = userDAOService.Insert(user2);

        log.info("2 user created:"+user2);

        //Check user
        //localhost:8080/h2-console
    }
}
