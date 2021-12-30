package org.test;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList();
		
		li.add(10);
		li.add(20);
		li.add(40);
		li.add(30);
		li.add(50);
		li.add(20);
		li.add(60);
		li.add(null);
		li.set(2, 100);
		System.out.println(li);
		
		// To get the Elements
		Integer integer = li.get(3);
		System.out.println("Get the Value from given index :"+integer);
		
		// To find the size of List
		int size = li.size();
		System.out.println(size);
		System.out.println(li.size());
		
		// To find the Index
		System.out.println(li.size()-1);
		
		// To iterate the elements from List
		System.out.println("For Loop");
		for (int i = 0; i < li.size(); i++) {
			
			Integer el = li.get(i);
			System.out.println(el);
		}
		
		System.out.println("Enhanced For loop");
		
		for (Integer y : li) {
			System.out.println(y);
		}
		
	}

}
