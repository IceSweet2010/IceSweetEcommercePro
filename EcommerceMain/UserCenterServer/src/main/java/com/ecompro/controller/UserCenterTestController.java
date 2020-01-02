package com.ecompro.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ecompro.model.UserTestModel;

@RestController
public class UserCenterTestController {

	@RequestMapping("/postTest1")
	public String postTest1(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		return "post test" + username + password;
	}

	@RequestMapping(value = "/postTest2", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String postTest2(@RequestBody UserTestModel user) {
		return "ok" + user.getUsername() + user.getPassword();
	}
}
