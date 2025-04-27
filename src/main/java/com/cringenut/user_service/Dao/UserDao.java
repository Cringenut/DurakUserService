package com.cringenut.user_service.Dao;

import com.cringenut.user_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
