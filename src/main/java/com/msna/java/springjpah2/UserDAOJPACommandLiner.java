package com.msna.java.springjpah2;

import com.msna.java.springjpah2.entity.User;
import com.msna.java.springjpah2.repository.IUserDAORepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAOJPACommandLiner implements CommandLineRunner {
    @Autowired
    private IUserDAORepository iUserDAORepository;

    private static final Logger log = LoggerFactory.getLogger(UserDAOJPACommandLiner.class);

    @Override
    public void run(String... args) throws Exception {
        //User 1
        User user = new User("Azeem 2", "Admin");
        User _user = iUserDAORepository.save(user);

        log.info("Saving data through repository" + _user);

        //User 2
        User user2 = new User("Saleem Khan 2", "Employee");
        User _user2 = iUserDAORepository.save(user2);

        log.info("Saving data 2 through repository " + _user2);


        //Update userr
        _user2.setRole("Tester");
        iUserDAORepository.save(_user2);

        log.info("Update user's role :" + _user2);

        //Find all users
        List<User> users = iUserDAORepository.findAll();

        log.info("All users -" + users);
    }
}