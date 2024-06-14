package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UsersDAO;
import com.example.domain.UserVO;

@RestController
@RequestMapping("/users")
public class UsersRestController {
	@Autowired
	UsersDAO dao;

	@GetMapping("/{uid}") // 테스트 /users/red
	public UserVO read(@PathVariable("uid") String uid) {
		return dao.read(uid);
	}

}
