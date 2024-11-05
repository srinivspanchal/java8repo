package com.srinu.main;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlphabeticalOrderString {

	public static void main(String[] args) {

		String str="bdfeasbbhg";
		
		String orderedstring =Stream.of(str.split("")).distinct().sorted().collect(Collectors.joining());
		
		System.out.println("Alphabetical Order ::"+orderedstring);
	}

}
