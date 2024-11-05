package com.srinu.main;

import java.util.Arrays;
import java.util.List;

public class MaxNumberFind {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 4, 7, 9);

		System.out.println("Max number is   ::"+numbers.stream().reduce(1, Integer::min));

	}

}
