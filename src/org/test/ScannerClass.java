package org.test;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		
		System.out.println("Enter your City");
		String city = sc.next();
		
		System.out.println("Enter your 1City");
		String city1 = sc1.next();
	
		
		System.out.println(" Enter your id :");
		int id = sc.nextInt();
		
		System.out.println("Employee city "+city);
		System.out.println("Employee name "+name);
		System.out.println("Employee id "+id);
		System.out.println("Employee city "+city1);
		
		
		
//		System.out.println("Enter your age :");
//		byte age = sc.nextByte();
//		
//		System.out.println("Enter your Atm pin :");
//		short atmPin = sc.nextShort();
//		
//		System.out.println("Enter your pincode :");
//		int pinCode = sc.nextInt();
//		
//		System.out.println("Enter your Account number :");
//		long accNum = sc.nextLong();
//		
//		System.out.println("Enter your weight :");
//		float weight = sc.nextFloat();
//		
//		System.out.println("Enter your Salary :");
//		double salary = sc.nextDouble();
//		
//		System.out.println("Enter your Gender :");
//		char gen = sc.next().charAt(2);
//		
//		System.out.println("Above the Information are true or false :");
//		boolean info = sc.nextBoolean();
//		
//		
//		System.out.println("Employee age :"+age);
//		System.out.println("Employee ATM pin :"+atmPin);
//		System.out.println("Employee Pincode :"+pinCode);
//		System.out.println("Employee Account number :"+accNum);
//		System.out.println("Employee weight :"+weight);
//		System.out.println("Employee salary :"+salary);
//		System.out.println("Employee Gender :"+gen);
//		System.out.println("Employee Informations are :"+info);
//		
		
		
	}
	
	
	
}
