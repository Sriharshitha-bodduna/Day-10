package com.codegnan.controlstatements;

import java.util.Scanner;

public class SingleDigitNumberology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n >= 10) {
			int sum = 0;
			int temp = n;
			while (temp > 0) {
				int digit = temp % 10;
				sum += digit;
				temp = temp / 10;
			}
			n = sum;
		}
		System.out.println(n);
		sc.close();
	}

}
