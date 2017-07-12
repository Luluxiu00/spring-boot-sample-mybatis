package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Person;
import com.example.mapper.PersonMapper;

@RestController
public class PersonController {

	protected static Logger logger=LoggerFactory.getLogger(PersonController.class); 
	
	@Autowired
	PersonMapper mapper;
	
	
	@RequestMapping("/query")
	public List<Person> findByAddress(String address){
		logger.info("query 开始");
		List<Person> list = mapper.findByAddress(address);
		logger.info("query 结束");
		return list;
		
	}
}
