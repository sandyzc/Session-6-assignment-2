package com.assignment2.primenumber;

public class PrimeThread implements Runnable{

	int n;
	// constructor
	public PrimeThread(int n) {
		this.n=n;
	}
	
		
		
		
	
	@Override
	//run method
	public void run() {
		
			int i = 2;
			if ( n%i == 0){
				System.out.println("The given number is Prime");
				
			}
			else{
				System.out.println("The given number is not Prime");
			}
			
	
		
		
		
	}

}
