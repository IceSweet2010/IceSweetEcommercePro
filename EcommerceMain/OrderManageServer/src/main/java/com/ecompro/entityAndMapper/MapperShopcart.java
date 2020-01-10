package com.ecompro.entityAndMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MapperShopcart {
	@Select("select * from shopcart")
	List<Shopcart> selectAll();

	@Select("SELECT * FROM shopcart WHERE userid = #{arg0}")
	Shopcart listOfUser(String userid);
}
