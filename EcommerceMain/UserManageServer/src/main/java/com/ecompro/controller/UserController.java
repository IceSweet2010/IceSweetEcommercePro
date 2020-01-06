package com.ecompro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ecompro.entityAndMapper.User;
import com.ecompro.model.LoginModel;
import com.ecompro.service.UserService;

@RequestMapping("user")
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/list/all")
	public List<User> listAll() {
		return userService.listAll();
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String login(@RequestBody LoginModel user) {
		String userid = userService.login(user.getUsername(),user.getPassword());
		return "ok" + userid;
	}
}
