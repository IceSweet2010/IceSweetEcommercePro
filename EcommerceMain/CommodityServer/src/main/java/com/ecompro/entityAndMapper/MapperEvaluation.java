package com.ecompro.entityAndMapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MapperEvaluation {
	@Select("select * from evaluation")
	List<Evaluation> selectAll();

	@Select("SELECT * FROM evaluation WHERE comid = #{arg0} and shopid =#{arg1} ")
	List<Evaluation> listOfOneCom(String comid, String shopid);
}
