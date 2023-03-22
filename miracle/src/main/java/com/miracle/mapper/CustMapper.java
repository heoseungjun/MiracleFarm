package com.miracle.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.miracle.dto.Cust;
import com.miracle.frame.MiracleMapper;

@Repository
@Mapper
public interface CustMapper extends MiracleMapper<String,Cust> {
	
}
