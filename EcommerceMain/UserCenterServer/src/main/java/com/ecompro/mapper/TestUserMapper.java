package com.ecompro.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;
import com.ecompro.entity.TestUsers;

@Mapper
public interface TestUserMapper {
	@Select("select * from testusers")
	List<TestUsers> selectAll();

	@Select("SELECT * FROM testusers WHERE username = #{username}")
	TestUsers findByUserName(@Param("username") String username);
}
