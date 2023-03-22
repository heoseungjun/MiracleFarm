package com.miracle.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.miracle.dto.Myroutine;
import com.miracle.frame.MiracleMapper;

@Repository
@Mapper
public interface MyroutineMapper extends MiracleMapper<Integer, Myroutine>{
	
}
