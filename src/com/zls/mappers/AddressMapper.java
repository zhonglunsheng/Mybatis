package com.zls.mappers;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.zls.model.Address;

public interface AddressMapper {
	
	@Select("select * from t_address where id=#{id}")
	@Results(
			{
				@Result(id=true,column="id",property="id"),
				@Result(column="province",property="province"),
				@Result(column="city",property="city")
			}
			)
	Address findById(Integer id);
}
