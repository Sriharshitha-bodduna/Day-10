package com.codegnan.controlstatements;

import java.util.Scanner;

public class ProductNonComposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long product = 1;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num == 0) break;
			if (isComposite(num)) continue;
			product *= num;
		}
		System.out.println(product);
		sc.close();
	}
		static boolean isComposite(int n) {
			if (n <= 1) return false;
			for (int i = 2; i*i <= n; i++) {
				if (n % i == 0) return true;
			}
			return false;
	}

}
