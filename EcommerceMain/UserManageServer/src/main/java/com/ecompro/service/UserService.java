package com.ecompro.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecompro.entityAndMapper.User;
import com.ecompro.entityAndMapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public List<User> listAll() {
		return userMapper.selectAll();
	}

	public String login(String tel,String password) {
		User user = userMapper.findByTelAndPwd(tel,password);
		return user.getUserId();
	}
}
