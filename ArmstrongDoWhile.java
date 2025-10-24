package com.codegnan.controlstatements;

import java.util.Scanner;

public class ArmstrongDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int original = N;
		int digits = 0;
		int temp = N;
		do {
			digits++;
			temp /= 10;
		} while (temp > 0);
		int sum = 0;
		temp = N;
		do {
			int digit = temp % 10;
			sum += Math.pow(digit, digits);
			temp /= 10;
		} while (temp > 0);
		if (sum == original) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
		sc.close();
	}

}
