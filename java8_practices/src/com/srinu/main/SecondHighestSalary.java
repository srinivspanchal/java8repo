package com.srinu.main;

import java.util.Arrays;
import java.util.List;

public class SecondHighestSalary {

	public static void main(String[] args) {

		List<Integer> salary = Arrays.asList(40000, 50000, 2000, 70000, 30000);

		Integer secondHighest = salary.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("secong highest salary is   ::::" + secondHighest);
	}

}
