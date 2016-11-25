package com.assignment2.primenumber;

import java.util.Scanner;

public class MainThread {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check weather prime or not");
		int n = scan.nextInt();
		//runnable Class object
		PrimeThread pt = new PrimeThread(n);
		//thread object
		Thread prime = new Thread(pt);//new state
		
		
		//runnable
		prime.start();
		
	}

}
