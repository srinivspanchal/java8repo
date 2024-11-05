package com.srinu.main;

import java.util.Map;
import java.util.stream.Collectors;

public class CountEachCahrInString {

	public static void main(String[] args) {

		String str = "aabbcccdefgghi";

		Map<Character, Long> counts = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(n -> n, Collectors.counting()));

		counts.entrySet().forEach(entry -> {
							System.out.println("Character :" + entry.getKey() + "  has  " + entry.getValue() + "  alphabets");
		});
	}
}
