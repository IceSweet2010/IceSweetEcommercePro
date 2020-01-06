package com.ecompro.entityAndMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	@Select("select * from user")
	List<User> selectAll();

	@Select("SELECT * FROM user WHERE username = #{arg0} and password =#{arg1} ")
	User findByNameAndPwd(String username, String password);
}
