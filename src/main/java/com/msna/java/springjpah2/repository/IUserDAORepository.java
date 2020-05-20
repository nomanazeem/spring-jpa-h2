package com.msna.java.springjpah2.repository;

import com.msna.java.springjpah2.entity.User;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface IUserDAORepository extends JpaRepositoryImplementation<User, Long> {

}
