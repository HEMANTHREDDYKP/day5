package com.ty;
//Predicate functional interface

// it has one abstract method
//boolean test(T t)--> this will accept the input and returns only boolean output

import java.util.function.Predicate;

/*Note: filter()--> method internally uses test abstract method*/

public class Program4 {

	public static void main(String[] args) {

		Predicate<Integer> p = (y) -> {

			return y % 2 == 0;
		};

		System.out.println(p.test(24));
	}
}
