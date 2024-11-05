package com.srinu.main;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesFromString {

	public static void main(String[] args) {

		String str="aabbccddffrrgg";
		
		String duplicatesString= Stream.of(str.split("")).sorted().distinct().collect(Collectors.joining());
		
		System.out.println("Duplicates are  ::"+duplicatesString);
		System.out.println("Duplicates are  ::"+duplicatesString);
		System.out.println("");
	}

}
