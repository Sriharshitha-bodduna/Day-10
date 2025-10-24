package com.codegnan.controlstatements;

import java.util.Scanner;

public class PalindromeicNumbersDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int num = 1;
		do {
			if (isPalindrome(num)) {
				count++;
			}
			num++;
		} while (num <= N);
		System.out.println(count);
		sc.close();
	}
	static boolean isPalindrome(int n) {
		int original = n, reverse = 0;
		while (n > 0) {
			reverse = reverse * 10 + (n % 10);
			n /= 10;
		}
		return original == reverse;
	}

}
