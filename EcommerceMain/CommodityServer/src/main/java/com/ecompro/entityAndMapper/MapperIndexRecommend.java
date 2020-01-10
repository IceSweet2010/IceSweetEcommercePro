package com.ecompro.entityAndMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MapperIndexRecommend {
	@Select("select * from indexrecommend")
	List<IndexRecommend> selectAll();
	
	@Select("SELECT * FROM indexrecommend WHERE comid = #{arg0} and shopid =#{arg1} ")
	IndexRecommend findByComidAndShopid(String comid, String shopid);
}
