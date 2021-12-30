package org.test;

public class SampleClass {

	public static void main(String[] args) {

		System.out.println("Immutable String:");

		String s1 = "Java ";
		String s2 = "Program";
	
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		 s1 = s1.concat(s2);
		
		 System.out.println(s1);
		 System.out.println(System.identityHashCode(s1));
		
		
		
		
		
		System.out.println("\nNon-Literal String:");

		String s4 = new String("Python");
		String s5 = new String("Python");

		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));

	}

}
