package com.wipro.testing;

import java.util.Scanner;

public class Doll {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		e.nextLine();
		System.out.println("How many childrens in your School?");
		byte children = e.nextByte();
		System.out.println("Total strength is: " + children);

		System.out.println("who is the first mark  in your class?");
		String name = e.nextLine();
		System.out.println("myself:" + name);

		System.out.println("Who is your class teacher?");
		String teachername = e.nextLine();
		System.out.println("Her name is:" + teachername);
	}

}
