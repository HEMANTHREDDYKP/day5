package com.ty;
import java.util.ArrayList;
import java.util.Collections;

//applying lambda expression in real time


//sort the person by age if the age is same sort

//by height

class Person {

	Integer age;
	Double height;
	String name;

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

	public Person(Integer age, Double height, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", height=" + height + ", name=" + name + "]";
	}

}

public class Program2 {

	public static void main(String[] args) {

		ArrayList<Person> arr = new ArrayList<>();
		arr.add(new Person(23, 5.6, "mack"));
		arr.add(new Person(20, 5.0, "soma"));
		arr.add(new Person(20, 6.0, "ranga"));
		arr.add(new Person(29, 5.9, "nag"));

		Collections.sort(arr, (o1, o2) -> {

			if (o1.age == o2.age)
				return o1.height.compareTo(o2.height);
			else {

				return o1.age.compareTo(o2.age);
			}

		});
		
		
		for (Person person : arr) {
			
			System.out.println(person);
		}
		

	}

}






