package com.assignment;
/*
 * WAP to concatenate a given string to the end of another string.
 */
public class ConcateString {
	public static void main(String[] args) {
		String s1="My name is jay",s2="MY NAME IS JAY";
		s1 = s1.concat(s2);
		
		System.out.println(s1);
	}
}