package com.vwits.webstore.service;

import com.vwits.webstore.entity.Cart;
import com.vwits.webstore.entity.User;

public interface UserService {
	User check(String username, String password);
	Cart addItem(String item_name,int item_price,int user_id,String img);
}
