package org.test;

public class ControlStatements {
	
	private void company() {
		System.out.println("company");

	}

	private void tcs() {
	System.out.println("TCS");

	}
	
public static void main(String[] args) {
	
	int empId = 99;
	int dpmtId = 10;
	//Outer If
	if (empId >= 100) {
		
		// Inner If
		if (dpmtId == 10) {
			System.out.println("Employee from Greens and testing dpmt");
		}
		//Inner else
		else {
			System.out.println("Employee from Greens and other dpmt");
		}
		
	}
	//Outer Else
	else {
		System.out.println("Employee not from Greens");
		System.out.println("Hi Mani");
	}
	
	
	
	
	
	
}
		
		
}
