package com.ecompro.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecompro.entity.TestUsers;
import com.ecompro.service.TestUsersService;

@RequestMapping("testusers")
@RestController
public class TestUsersController {
	@Autowired
	private TestUsersService userService;

	@GetMapping("/list/all")
	public List<TestUsers> listAll() {
		return userService.listAll();
	}
}
