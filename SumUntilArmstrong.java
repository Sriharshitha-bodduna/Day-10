package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumUntilArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num == 0) continue;
			if (isArmstrong(num)) break;
			sum += num;
		}
		System.out.println(sum);
		sc.close();
	}
	static boolean isArmstrong(int n) {
		int temp = n, digits = 0, sum = 0;
		while (temp > 0) {
			digits++;
			temp /= 10;
		}
		temp = n;
		while (temp > 0) {
			int d = temp % 10;
			sum += Math.pow(d, digits);
			temp /= 10;
		}
		return sum == n;
	}

}
