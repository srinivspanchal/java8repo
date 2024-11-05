package com.srinu.main;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringRevrseJava8 {

	public static void main(String[] args) {

		String str = "srinivasvadla";

		String reversedString = IntStream.range(0, str.length()).mapToObj(i -> str.charAt(str.length() - 1 - i)).map(String::valueOf).collect(Collectors.joining());
		
		System.out.println(reversedString);

	}

}
