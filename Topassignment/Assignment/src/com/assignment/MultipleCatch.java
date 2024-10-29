package com.assignment;
/*
 * WAP to demonstrate multiple catch blocks
 */
public class MultipleCatch {
	public static void main(String[] args) {
		int a[]=new int[5], b; 
		try{    
         	b=30/0;
         	System.out.println("The Division is: "+b);
	        for (int i = 0; i <6; i++) {
				a[i]=i+1;
				System.out.println(a[i]);
	         }
        }    
        catch(ArithmeticException e){
        	System.out.println("Arithmetic Exception occurs");
	        e.printStackTrace();
	    }    
        catch(ArrayIndexOutOfBoundsException e){  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
            e.printStackTrace();
        }    
        catch(Exception e){  
            System.out.println("Other Exception occurs");  
        }             
        System.out.println("Other Codes");      	
	}
}