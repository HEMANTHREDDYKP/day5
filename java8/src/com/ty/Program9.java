package com.ty;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program9 {

	public static void main(String[] args) {

		//1.get the count of each character in a given string
		
		String s="hihellobye";
		
		
		Map<String, Long> t=Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(t);
		
	}

}
