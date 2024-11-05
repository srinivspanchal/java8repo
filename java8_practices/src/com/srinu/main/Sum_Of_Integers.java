package com.srinu.main;

import java.util.Arrays;
import java.util.List;

public class Sum_Of_Integers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 4, 5, 2);
		Integer count = list.stream().reduce(0, Integer::sum);
		System.out.println(count);

	}
}
