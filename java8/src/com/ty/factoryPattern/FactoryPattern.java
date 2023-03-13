package com.ty.factoryPattern;

interface Shape {

	void area();
}

class Circle implements Shape {

	int radius = 2;

	@Override
	public void area() {
		System.out.println(3.14 * radius * radius);
	}

}

class Square implements Shape {

	int side = 4;

	@Override
	public void area() {

		System.out.println(side * side);

	}

}

public class FactoryPattern {

	public Shape getInstance(String s) {

		if (s.equals("Square")) {

			return new Square();
		} else if (s.equals("Circle")) {
			return new Circle();
		} else {
			return null;
		}

	}

	public static void main(String[] args) {

		FactoryPattern f = new FactoryPattern();

		Shape s = f.getInstance("Circle");
		s.area();
	}

}
