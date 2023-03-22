package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.Myroutine;
import com.miracle.frame.MiracleService;
import com.miracle.mapper.MyroutineMapper;

@Service
public class MyroutineService implements MiracleService<Integer, Myroutine>{
	
	@Autowired
	MyroutineMapper mapper;
	
	public Myroutine get(Integer k) throws Exception{
		return mapper.select(k);
	}
	
	public List<Myroutine> get() throws Exception{
		return mapper.selectall();
	}
	
	public void register(Myroutine v) throws Exception{
		mapper.insert(v);
	}
	
	public void modify(Myroutine v) throws Exception{
		mapper.update(v);
	}
	
	public void remove(Integer k) throws Exception{
		mapper.delete(k);
	}
}
