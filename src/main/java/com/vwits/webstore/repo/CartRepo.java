package com.vwits.webstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vwits.webstore.entity.Cart;


public interface CartRepo extends JpaRepository<Cart, Integer>{

}
