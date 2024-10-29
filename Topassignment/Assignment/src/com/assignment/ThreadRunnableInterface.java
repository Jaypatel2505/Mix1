package com.assignment;
/*
 * WAP to create one thread by implementing Runnable interface in Class.
 */
class First implements Runnable{
	@Override
	public void run(){
		for (int i = 1; i <= 5; i++) {
			System.out.println("This is First Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadRunnableInterface {
	public static void main(String[] args) throws InterruptedException {
		First s1 = new First();
		
		Thread t1 = new Thread(s1);
		t1.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("This is Main Thread");
			Thread.sleep(2000);
		}
	}
}
