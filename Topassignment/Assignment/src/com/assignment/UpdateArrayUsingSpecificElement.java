package com.assignment;

import java.util.HashMap;
/*
 * WAP to update specific array element by given element.
 */
public class UpdateArrayUsingSpecificElement {
	public static void main(String[] args) {
		HashMap h1 = new HashMap();
		
		h1.put(1, 123444);
		h1.put("Jay", 982554028);
		h1.put("Jay", "Patel");
		h1.put(23.5f, 'J');
		
		System.out.println("Original value is :"+h1);
		System.out.println("Original size is :"+h1.size());
		
		h1.put("Jay", 98255402);
		System.out.println("Now value is :"+h1);
		System.out.println("Now size is :"+h1.size());
		
		h1.put(2, 123444);
		System.out.println("Now value is :"+h1);
		System.out.println("Now size is :"+h1.size());
		
	}
}