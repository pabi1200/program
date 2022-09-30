package com.calculator;

import java.util.Scanner;

public class Program2 {

	public static void operation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int nextInt = sc.nextInt();
		
		int previous_val=nextInt-1;
		int a=nextInt+previous_val;
		for(int i=1;i<=a;i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
	
operation();
	}

}
