package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumUntilPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num < 0) continue;
			if (isPerfect(num)) break;
			sum += num;
	    }

		System.out.println(sum);
		sc.close();
	}
	static boolean isPerfect(int n) {
		if (n <= 1) return false;
	    int total = 0;
	    for (int i = 1; i <= n / 2; i++) {
	    	    if (n % i == 0) total += i;
	    }
	    return total == n;
	}
}
