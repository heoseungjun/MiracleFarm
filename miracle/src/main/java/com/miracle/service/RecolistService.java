package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.Recolist;
import com.miracle.frame.MiracleService;
import com.miracle.mapper.RecolistMapper;

@Service
public class RecolistService implements MiracleService<Integer, Recolist>{
	
	@Autowired
	RecolistMapper mapper;
	
	public Recolist get(Integer k) throws Exception{
		return mapper.select(k);
	}
	
	public List<Recolist> get() throws Exception{
		return mapper.selectall();
	}
	
	public void register(Recolist v) throws Exception{
		mapper.insert(v);
	}
	
	public void modify(Recolist v) throws Exception{
		mapper.update(v);
	}
	
	public void remove(Integer k) throws Exception{
		mapper.delete(k);
	}
}
