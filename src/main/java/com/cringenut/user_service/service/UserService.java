package com.cringenut.user_service.service;

import com.cringenut.user_service.Dao.UserDao;
import com.cringenut.user_service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public ResponseEntity<User> getUserById(Integer id) {
        System.out.println(id);
        User user = userDao.findById(id).get();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
