package com.assignment;
import java.util.Scanner;
/*
 * W.A.J.P for create Fibonacci Series.
 */
public class FibonacciSeries {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter to how many number you want to generate:");
			 int num1=0,num2=1,num3,count;    
			 count = sc.nextInt();
			 System.out.print(num1+" "+num2);    
			    
			 for(int i=2; i<count; i++)    
			 {    
				 num3 = num1 + num2;    
				 System.out.print(" "+num3);    
				 num1 = num2;    
				 num2 = num3;    
			 }
		}    
	}
}