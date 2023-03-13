package com.ty;

import java.util.function.Consumer;

//Consumer functional interface

// it has void accept(T t); abstract method
// which only accepts the input and will not return anything

/* forEach() --> internally uses consumer functional interface*/

public class Program3 {

	public static void main(String[] args) {

		
		Consumer<Integer>  c=(x)->{
			System.out.println("hi "+x);
		};
		c.accept(21);
		
		
	}
}
