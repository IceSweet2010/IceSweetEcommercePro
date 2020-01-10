package com.ecompro.entityAndMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MapperComDetials {
	@Select("select * from comdetials")
	List<ComDetials> selectAll();

	@Select("SELECT * FROM comdetials WHERE comid = #{arg0} and shopid =#{arg1} ")
	ComDetials findByComidAndShopid(String comid, String shopid);
}
