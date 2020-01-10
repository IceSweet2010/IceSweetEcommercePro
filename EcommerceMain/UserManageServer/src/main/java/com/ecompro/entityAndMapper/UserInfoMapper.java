package com.ecompro.entityAndMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserInfoMapper {
	@Select("select * from userinfo")
	List<UserInfo> selectAll();

	@Select("SELECT * FROM userinfo WHERE userid = #{arg0}")
	UserInfo findByUserid(String userid);
}
