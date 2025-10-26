package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		int n = Math.abs(num);
		while (n > 0) {
			int digits = n % 10;
			sum = sum + digits;
			n = n / 10;
		}
		System.out.println("Sum of digits of " +num+ "=" +sum);
		sc.close();
	}

}
