package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * WAP to iterate through all elements in an array list.
 */
public class IterateArrayList {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		
		System.out.println("Default value is :"+a1);
		System.out.println("Defalt size is : "+a1.size());
		
		a1.add(12);
		a1.add(56.45f);
		a1.add("Jay");
		a1.add('J');
		a1.add(new Integer(150));
		
		System.out.println("New value is :"+a1);
		System.out.println("New size is : "+a1.size());
		
		a1.add("Jay");		// Duplicate values
		
		System.out.println("New value is :"+a1);
		System.out.println("New size is : "+a1.size());
		
		a1.remove(0);
		
		System.out.println("New value is :"+a1);
		System.out.println("New size is : "+a1.size());
		
		a1.remove("Jay");
		
		System.out.println("New value is :"+a1);
		System.out.println("New size is : "+a1.size());
		
		// Iterator Code
		Iterator i1 = a1.iterator();
		while (i1.hasNext()) {
			System.out.print(i1.next()+", ");
		}

	}
}