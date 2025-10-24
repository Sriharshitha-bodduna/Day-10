package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumUniquwDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num < 0) break;
			if (!hasUniqueDigits(num)) continue;
			sum += num;
		}
		System.out.println(sum);
		sc.close();
	}
	static boolean hasUniqueDigits(int n) {
		boolean[] seen = new boolean[10];
		while (n > 0) {
			int digit = n % 10;
			if (seen[digit]) return false;
			seen[digit] = true;
			n /= 10;
		}
		return true;
	}

}
