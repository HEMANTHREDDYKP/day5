package com.ty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person8 {

	static ArrayList<Person8> arr = new ArrayList<>();
	static {
		arr.add(new Person8(23, 5.6, "mack", 70000.0, Arrays.asList("project 1", "project 2")));
		arr.add(new Person8(20, 5.0, "soma", 78000.0, Arrays.asList("project 1")));
		arr.add(new Person8(20, 6.0, "ranga", 45688.0, Arrays.asList("project 2", "project 1")));
		arr.add(new Person8(29, 5.9, "nag", 50000.0, Arrays.asList("project 81", "project 23")));
	}

	Integer age;
	Double height;
	String name;
	Double sal;
	List<String> project;

	public List<String> getProject() {
		return project;
	}

	public void setProject(List<String> project) {
		this.project = project;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Person8 [age=" + age + ", height=" + height + ", name=" + name + ", sal=" + sal + ", project=" + project
				+ "]";
	}

	public Person8(Integer age, Double height, String name, Double sal, List<String> project) {
		super();
		this.age = age;
		this.height = height;
		this.name = name;
		this.sal = sal;
		this.project = project;
	}

}

public class Program8 {

	public static void main(String[] args) {

		// stream
		// forEach
		// method Reference
		Person8.arr.stream().forEach(System.out::println);
		System.out.println("-------------------------------------------------------------------------");

		// map
		// collect(Collectors.toList())
		// collect(Collectors.toSet())
		// increasing salary by 10% for all employees and collecting back to list
		List<Person8> list = Person8.arr.stream().map(e -> new Person8(e.getAge(), e.getHeight(), e.getName(),
				e.getSal() + e.getSal() * (10.0 / 100.0), e.getProject())).collect(Collectors.toList());
		list.stream().forEach(System.out::println);
		System.out.println("-------------------------------------------------------------------------");

		// after increasing salary get only one employee in output
		Person8 p1 = Person8.arr.stream().map(person -> new Person8(person.getAge(), person.getHeight(),
				person.getName(), person.getSal() * 1.10, person.getProject())).findFirst().orElse(null);
		System.out.println(p1);
		System.out.println("-----------------------------------------------------------------------");

		// converting stream of streams to stream i.e { [a1,a2],[a3],[a4,a5] }-->
		// {a1,a2,a3,a4,a5}
		// converting groups of project into group of project
		String p = Person8.arr.stream().map(e -> e.getProject()).flatMap(str -> str.stream())
				.collect(Collectors.joining(","));
		System.out.println(p);
		System.out.println("-------------------------------------------------------------------------");

		// short circuit operation
		// we are skipping the 1st person and getting only one person
		List<Person8> pl = Person8.arr.stream().skip(1).limit(1).collect(Collectors.toList());
		System.out.println(p1);
		System.out.println("-----------------------------------------------------------------------------");

		// finite data
		// we are generating only three random numbers using the math class random
		// function
		Stream.generate(Math::random).limit(3).forEach(System.out::println);
		System.out.println("-------------------------------------------------------------------------------");

		
		
		// find min or max sal
		//if sal is int the u can use mapToInt
		System.out.println("max sal");
		Double maxsal = Person8.arr.stream().mapToDouble(e -> e.getSal()).max().orElse(0);
		System.out.println(maxsal);
		
		
		
		System.out.println("--------------------OR---------------------");
		System.out.println("max sal");
		Person8 person8= Person8.arr.stream().max(Comparator.comparingDouble(x->x.getSal())).orElse(null);
		System.out.println(person8);
		System.out.println("------------------------------------------------------");
		
		
		
		//printing the person with given salary
		Person8.arr.stream().filter(x->x.getSal()==45688.0).forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------------------------------");
		
		
		
		//print total salary
		
		Double total=Person8.arr.stream().map(x->x.getSal()).reduce(0.0,Double::sum);
		
		System.out.println(total);
		
		
		
		
		
		
		

	}
}
