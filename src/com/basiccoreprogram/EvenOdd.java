package com.basiccoreprogram;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num%2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}

}
