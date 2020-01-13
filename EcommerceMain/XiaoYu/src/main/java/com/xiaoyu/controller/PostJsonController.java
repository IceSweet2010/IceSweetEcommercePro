package com.xiaoyu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.xiaoyu.model.UserModel;

@RestController
public class PostJsonController {
	@RequestMapping(value = "/postjson", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public String postManTest(@RequestBody UserModel user) {
		System.out.println("username is:" + user.GetUsername());
		System.out.println("password is:" + user.GetPassword());
		return "ok" + user.GetUsername() + user.GetPassword();
	}
	
	//String str = "{\"name\": \"小玉\",     \"words\": \"你好\" }";
	/*public JSONObject inputmywords(@RequestBody String mywords, HttpServletRequest request) {
		String str = "{\"name\": \"小玉\",     \"words\": \"你好\" }";
		JSONObject jsonObject1 = JSONObject.parseObject(str);
		return jsonObject1;
	}*/
}
