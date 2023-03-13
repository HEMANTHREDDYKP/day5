package com.ty.prototypePattern;

import java.util.Scanner;

/*Prototype Pattern says that cloning of an existing object instead of creating new one 
 * and can also be customized as per the requirement.*/

interface Prototype {  
	  
    public Prototype getClone();  
     
}

public class Main {

	public static void main(String[] args) {

		
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter id");
		int id=input.nextInt();
		System.out.println("enter name");
		String name=input.next();
		System.out.println("enter designation");
		String designation=input.next();
		System.out.println("enter salary ");
		double salary=input.nextDouble();
		System.out.println("enter address");
		String address=input.next();
		
		EmployeeRecord employeeRecord=new EmployeeRecord(id, name, designation, salary, address);
		employeeRecord.showRecord();
		System.out.println("----------------");
		EmployeeRecord employeeRecord2=(EmployeeRecord) employeeRecord.getClone();
		employeeRecord.showRecord();
		
		
	}

}
