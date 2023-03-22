package com.miracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miracle.dto.Reply;
import com.miracle.frame.MiracleService;
import com.miracle.mapper.ReplyMapper;

@Service
public class ReplyService implements MiracleService<Integer, Reply>{
	
	@Autowired
	ReplyMapper mapper;
	
	public Reply get(Integer k) throws Exception{
		return mapper.select(k);
	}
	
	public List<Reply> get() throws Exception{
		return mapper.selectall();
	}
	
	public void register(Reply v) throws Exception{
		mapper.insert(v);
	}
	
	public void modify(Reply v) throws Exception{
		mapper.update(v);
	}
	
	public void remove(Integer k) throws Exception{
		mapper.delete(k);
	}
}
