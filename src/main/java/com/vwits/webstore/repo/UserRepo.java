package com.vwits.webstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vwits.webstore.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
