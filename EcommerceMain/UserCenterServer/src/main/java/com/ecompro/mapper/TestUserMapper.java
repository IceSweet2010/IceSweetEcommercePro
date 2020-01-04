package com.ecompro.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.ecompro.entity.TestUsers;

@Mapper
public interface TestUserMapper {
	@Select("select * from testusers")
	List<TestUsers> selectAll();
}
