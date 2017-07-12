package com.example.mapper;

import java.util.List;

import com.example.domain.Person;

public interface PersonMapper{
	
	List<Person> findByAddress(String address);
	
	String show();
}
