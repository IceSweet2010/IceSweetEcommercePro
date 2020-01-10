package com.ecompro.entityAndMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MapperUserOrder {
	@Select("select * from userorder")
	List<UserOrder> selectAll();

	@Select("SELECT * FROM userorder WHERE orderid = #{arg0}")
	UserOrder findByOrderid(String orderid);
}
