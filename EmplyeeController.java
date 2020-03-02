package com.jbk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmplyeeController {
	@Autowired
	EmployeeService empservice;
	@RequestMapping("getNameData") 
	String[] getNames() throws Exception
	{
// This is the comment now i have added to commit
//		System.out.println(3421);
//		System.out.println("EmpService"+empservice);
//		String xx[]= {"Pravin","Ganesh"};
		return empservice.getNamesData();
	}

}
