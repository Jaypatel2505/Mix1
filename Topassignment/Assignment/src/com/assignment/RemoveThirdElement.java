package com.assignment;

import java.util.ArrayList;

/*
 * WAP to remove the third element from a array list.
 */
public class RemoveThirdElement {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		
		a1.add(12);
		a1.add(56.45f);
		a1.add("Jay");
		a1.add('J');
		a1.add(new Integer(150));
		
		System.out.println("Original value is :"+a1);
		System.out.println("Original size is : "+a1.size());
		
		a1.remove(2);
		
		System.out.println("New value is :"+a1);
		System.out.println("New size is : "+a1.size());
		
	}
}
