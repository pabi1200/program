package com.calculator;


	import java.util.Iterator;
import java.util.Scanner;

	public class Program3 {

	public static void operation() {
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int input = sc.nextInt();
		if (input%2 == 0) {
			value=input-1;
		} else {

			value=input;
		}
		
		int pre_val=value-1;
		int limit=value+pre_val;
		for(int i=1;i<=limit;i++) {
			if (i%2 !=0) {
				System.out.println(i);
			}
		}
	}
		
		public static void main(String[] args) {
		
	operation();
		}

	}

	

