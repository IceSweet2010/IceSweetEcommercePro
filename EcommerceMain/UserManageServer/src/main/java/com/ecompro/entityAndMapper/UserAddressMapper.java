package com.ecompro.entityAndMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserAddressMapper {
	@Select("select * from useraddress")
	List<UserAddress> selectAll();

	@Select("SELECT * FROM useraddress WHERE userid = #{arg0} and ifdefault=1 ")
	UserAddress findDefaultByUserid(String userid);
}
