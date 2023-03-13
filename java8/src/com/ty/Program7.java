package com.ty;

import java.util.HashMap;
import java.util.Map;
/*SORTING HASHMAP USING STREAM API*/
public class Program7 {

	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();
		map.put("sam", 12);
		map.put("raghu", 67);
		map.put("sumanth", 23);
		map.put("rock", 10);
		map.put("mani", 100);
		
		//sort the hashmap using value
		System.out.println("---------------------sort the hashmap using value------------------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
		System.out.println("---------------------sort the hashmap using key------------------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
		
		
		
		
	}
}
