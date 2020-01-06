package com.ecompro.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ecompro.entity.TestUsers;
import com.ecompro.model.UserTestModel;
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

	@RequestMapping(value = "/getuserbyname", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String getuserbyname(@RequestBody UserTestModel user) {
		String password = userService.loadUserByUsername(user.getUsername());
		return "ok" + user.getUsername() + user.getPassword() + password;
	}
}
