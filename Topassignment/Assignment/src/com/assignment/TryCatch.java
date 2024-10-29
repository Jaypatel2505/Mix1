package com.assignment;
/*
 * WAP to demonstrate try catch block.
 */
public class TryCatch {
	public static void main(String[] args) {
		int a=10, b=0;
		try {
			System.out.println("Division is : "+a/b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}