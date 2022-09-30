package com.calculator;

import java.util.Scanner;

public class Calculator {

	public static void operation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("give first value");
		double nextDouble = sc.nextDouble();
		System.out.println("give second value");
		double nextDouble2 = sc.nextDouble();
		System.out.println("write the operation to perform(addition,substration,multipication,division)");
		String nextLine = sc.next(); 
		
		if(nextLine.equalsIgnoreCase("addition")) {
			System.out.println("output is : "+(nextDouble+nextDouble2));
		}else if (nextLine.equalsIgnoreCase("substration")) {
			System.out.println("output is"+(nextDouble-nextDouble2));
		}else if (nextLine.equalsIgnoreCase("multipication")) {
			System.out.println("output is : "+(nextDouble*nextDouble2));
		}else if (nextLine.equalsIgnoreCase("division")) {
			System.out.println("output is : "+(nextDouble/nextDouble2));
		}else {
			System.out.println("wrong input");
		}
	}
	public static void main(String[] args) {
	operation();
	}

}
