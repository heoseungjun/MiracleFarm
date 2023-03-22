package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.Community;
import com.miracle.frame.MiracleService;
import com.miracle.mapper.CommunityMapper;

@Service
public class CommunityService implements MiracleService<Integer, Community>{
	
	@Autowired
	CommunityMapper mapper;
	
	public Community get(Integer k) throws Exception{
		return mapper.select(k);
	}
	
	public List<Community> get() throws Exception{
		return mapper.selectall();
	}
	
	public void register(Community v) throws Exception{
		mapper.insert(v);
	}
	
	public void modify(Community v) throws Exception{
		mapper.update(v);
	}
	
	public void remove(Integer k) throws Exception{
		mapper.delete(k);
	}
}
