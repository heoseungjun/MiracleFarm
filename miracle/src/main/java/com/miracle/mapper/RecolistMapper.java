package com.miracle.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.miracle.dto.Recolist;
import com.miracle.frame.MiracleMapper;

@Repository
@Mapper
public interface RecolistMapper extends MiracleMapper<Integer, Recolist>{
	
}
