package com.ecompro.entityAndMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MapperIndexRecommendOfCategory {
	@Select("select * from indexrecommendofcategory")
	List<IndexRecommendOfCategory> selectAll();

	@Select("SELECT * FROM indexrecommendofcategory WHERE "
			+ "comid = #{arg0} and shopid =#{arg1} and categoryid=#{arg2}")
	IndexRecommendOfCategory findByComidAndShopid(String comid, String shopid, String categoryid);
}
