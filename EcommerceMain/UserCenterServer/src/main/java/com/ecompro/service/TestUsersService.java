package com.ecompro.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecompro.entity.TestUsers;
import com.ecompro.mapper.TestUserMapper;

@Service
public class TestUsersService {
	@Autowired
	private TestUserMapper testuserMapper;

	public List<TestUsers> listAll() {
		return testuserMapper.selectAll();
	}

	public String loadUserByUsername(String username){
		TestUsers user = testuserMapper.findByUserName(username);
		//List<? extends GrantedAuthority> authorities = new ArrayList();
		//return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),authorities);
		return user.getPassword();
	}
}
