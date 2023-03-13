package com.ty;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//usage of predicate , consumer , supplier ,forEach, stream, filter
public class Program6 {

	public static void main(String[] args) {

		/* USING STREAMS ON LIST */
		
		List<Integer> list = Arrays.asList(1, 12, 30, 4, 5, 6);

		/* print even numbers in list */
		list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		System.out.println("-------------------OR---------------------");
		list.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
		System.out.println("---------------------------------------------");

		System.out.println("--------print all the numbers in list-------");
		list.stream().forEach(System.out::println);
		System.out.println("--------------------------------------------------------");

		List<String> list1 = Arrays.asList("hi", "hello", "bye", "how", "are", "you");
		System.out.println("-----------print all the words starting with h------------");
		list1.stream().filter(x -> x.startsWith("h")).forEach(System.out::println);
		System.out.println("-----------------------------------------------------------");
		// if the list doese'nt contains any elements will print ha ha ha
		String s = list1.stream().findAny().orElseGet(() -> "ha ha ha");
		System.out.println(s);
		System.out.println("---------------------------------------------------------------");
		
		/*SORT LIST USING STREAM API IN ASSCENDING ORDER*/
		list.stream().sorted().forEach(x->System.out.println(x));
		System.out.println("------------------------------------------------------------");
		/*SORT LIST USING STREAM API IN DESCENDING ORDER*/
		list.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
		/*USING STREAM API ON ARRAYS*/
		
		
		System.out.println("-------------------------------");
		
		int[] a= {1,2,3,4,5,6};
		
		Arrays.stream(a).filter(x->x%2==0).forEach(System.out::println);
		
		
		
		
		
	}

}
