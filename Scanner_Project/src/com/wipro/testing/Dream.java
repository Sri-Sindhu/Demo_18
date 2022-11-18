package com.wipro.testing;

import java.util.Scanner;

public class Dream {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		
		
		System.out.println("What is your name?");
		String name = e.next();
		System.out.println("Account Holder name:" + name);

		System.out.println("What is Your Age");
		byte age = e.nextByte();
		System.out.println("Age: " + age);
		
		
		System.out.println("How much you will withdraw your money?");
		long amount = e.nextLong();
		System.out.println("The total amount is:" + amount);
	}

}
