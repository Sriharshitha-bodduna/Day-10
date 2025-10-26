package com.codegnan.controlstatements;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		int digits = 0;
		int temp = num;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = num;
		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, digits);
			temp = temp / 10;
		}
		if (sum == original) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong");
		}
		sc.close();
	}

}
