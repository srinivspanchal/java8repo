package com.srinu.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltermethodPractices {

	public static void main(String[] args) {

		List<Employee> emp = Arrays.asList(new Employee("srinivas", 50000), 
				new Employee("mahesh", 50000),
				new Employee("harish", 40000),
				new Employee("rajesh", 60000),
				new Employee("sriman", 70000));
		
		
	List<Employee> salaries=	emp.stream().filter(i->i.getSalary()>=50000).collect(Collectors.toList());
	
	//Integer  sumOfSalaries=	emp.stream().filter(i->i.getSalary()).sorted().collect(Collectors.m)
	//System.out.println(sumOfSalaries);
	}

}
