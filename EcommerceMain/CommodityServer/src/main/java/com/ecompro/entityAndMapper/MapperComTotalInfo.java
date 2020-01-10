package com.ecompro.entityAndMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MapperComTotalInfo {
	@Select("select * from comtotalinfo")
	List<ComTotalInfo> selectAll();

	@Select("SELECT * FROM comtotalinfo WHERE comid = #{arg0} and shopid =#{arg1} ")
	ComTotalInfo findByComidAndShopid(String comid, String shopid);
}
