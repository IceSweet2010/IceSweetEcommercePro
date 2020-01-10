package com.ecompro.entityAndMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MapperComMainInfo {
	@Select("select * from commaininfo")
	List<ComMainInfo> selectAll();

	@Select("SELECT * FROM commaininfo WHERE comid = #{arg0} and shopid =#{arg1} ")
	ComMainInfo findByComidAndShopid(String comid, String shopid);
}
