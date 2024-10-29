package com.assignment;
/*
 * WAP to Compare Two String.
 */
public class CompareString {
	public static void main(String[] args) {
		String s1="My name is jay",s2="MY NAME IS JAY";
		if (s1.equals(s2)) {
			System.out.println("Both String are same");
		} else {
			System.out.println("Both string are not same");
		}

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Both String are same");
		} else {
			System.out.println("Both string are not same");
		}
	}
}