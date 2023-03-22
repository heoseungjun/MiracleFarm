package com.miracle.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.miracle.dto.Reply;
import com.miracle.frame.MiracleMapper;

@Repository
@Mapper
public interface ReplyMapper extends MiracleMapper<Integer, Reply>{
	
}
