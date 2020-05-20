package com.msna.java.springjpah2.service;

import com.msna.java.springjpah2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public  UserDAOService(){

    }

    public long Insert(User user){
        //Open transaction

        //Note: those users in persist will be tracked throughout application life cycle.
        entityManager.persist(user);
        return user.getId();
        //Close transaction
    }
}
