package com.srinu.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOrOdd {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 4, 6, 5, 7);

		System.out.println(numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));

	}

}
