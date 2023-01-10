package com.vwits.webstore.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vwits.webstore.entity.Cart;
import com.vwits.webstore.entity.User;
import com.vwits.webstore.repo.CartRepo;
import com.vwits.webstore.repo.UserRepo;
import com.vwits.webstore.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo repo;
	@Autowired
	private CartRepo crepo;
	public User check(String username,String password) {
		for(User u : repo.findAll()) {
//			
			if(u.getUsername().equals(username) && u.getPassword().equals(password)) {
				System.out.println(u.getId());
				return u;
			}
		}
		return null;
		
	}
	public Cart addItem(String item_name,int item_price,int user_id,String img) {
		Cart c = new Cart();
		c.setItem_name(item_name);
		c.setItem_price(item_price);
		c.setUser_id(user_id);
		c.setImg(img);
		crepo.save(c);
		return null;
	}
	
}
