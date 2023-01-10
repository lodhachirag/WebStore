package com.vwits.webstore.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vwits.webstore.entity.User;
import com.vwits.webstore.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
public class UserRestController {
	@Autowired
	private UserService service;
	@PostMapping
	public User checkUser(@RequestBody List<String> user) {
		User answer = service.check(user.get(0),user.get(1));
		System.out.println(answer.getId());
		return answer;
		
	}
}

