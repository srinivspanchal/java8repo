package com.srinu.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseInteger {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println(integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

	}

}
