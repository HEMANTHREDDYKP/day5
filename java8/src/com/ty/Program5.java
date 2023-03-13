package com.ty;

import java.util.function.Supplier;

//Supplier functional interface
// this can be used in all contexts where there is no input but an output is expected
//it has one abstract method
//T get()--> it only returns something will not accept anything

/*Note: orElseGet()-> will internally uses Supplier get method*/




public class Program5 {
	
	public static void main(String[] args) {
		
		
	Supplier<String> s=()->{
		return "hi";
	};
	
	
	System.out.println(s.get());
	
	
		
	}

}
