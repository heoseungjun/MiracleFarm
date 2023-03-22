package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.Cust;
import com.miracle.frame.MiracleService;
import com.miracle.mapper.CustMapper;

@Service
public class CustService implements MiracleService<String, Cust>{
	
	@Autowired
	CustMapper mapper;
	
	public Cust get(String k) throws Exception{
		return mapper.select(k);
	}
	
	public List<Cust> get() throws Exception{
		return mapper.selectall();
	}
	
	public void register(Cust v) throws Exception{
		mapper.insert(v);
	}
	
	public void modify(Cust v) throws Exception{
		mapper.update(v);
	}
	
	public void remove(String k) throws Exception{
		mapper.delete(k);
	}
}
