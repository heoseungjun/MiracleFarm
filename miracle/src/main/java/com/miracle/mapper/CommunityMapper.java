package com.miracle.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.miracle.dto.Community;
import com.miracle.frame.MiracleMapper;

@Repository
@Mapper
public interface CommunityMapper extends MiracleMapper<Integer, Community>{
	
}
