package com.example.service;  

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Person;
import com.example.mapper.PersonMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServicesTest {  

    @Mock  
    PersonMapper mapper;  
      
    @Test  
    public void testShow() {  
        String expectedResult="hello world!"; 
        when(mapper.show()).thenReturn("hello world!");
        String result = mapper.show();
        Assert.assertTrue("数据一致", expectedResult.equals(result));  
        Assert.assertFalse("数据不一致", !expectedResult.equals(result));  
    }  

    @Test  
    public void testFindByAddress() {
    	List<Person> list= new ArrayList<>();
    	Person p1 = new Person(1L, "nb", 23, "北京");
    	Person p2 = new Person(2L, "sb", 13, "北京");
    	list.add(p1);
    	list.add(p2);
    	
    	when(mapper.findByAddress("北京")).thenReturn(list);
        List<Person> list2= mapper.findByAddress("北京");  
        Assert.assertTrue("数据集不对", list2.size() == 2);  
        Assert.assertTrue("数据一致", list2.get(0).getName().equals("nb"));  
    }  

}  