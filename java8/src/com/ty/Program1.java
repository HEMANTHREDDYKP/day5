package com.ty;

//functional interface->an interface which as only one abstract method and can have
// n number of static and non static methods

//lambda expression  --> the expression through we can represent an anonymous function(name less function)
//() -> {}
//lambda expression can be written only for functional interface abstract method

//e.g for functional interfaces
/*
 * Function
 * Runnable
 * Callable
 * Comparator
 * Comparable
 * */




//functional interface 
interface Person2 {

	void work();//abstract method without argument
}

//functional interface 
interface Person1 {

	String work(String name);//abstract method with argument and with return type
}

public class Program1 {

	public static void main(String[] args) {

		
		Person2 p=()->{
			System.out.println("person is sleeping");
		};
		
		p.work();
		System.out.println("-----------------");
		Person1 p1=(name)->{
		 return name+" is sleeping";
		};
		System.out.println("OR");
		Person1 p2=(name)-> name+" is sleeping";//when method has only one line of code we can eleminate return keyword and bracket
		                                        // if we are using return then bracket is mandatory
			
		
		System.out.println(p1.work("ranga"));
		System.out.println(p2.work("ranga"));
		System.out.println("---------------------");
		
	}

}
