package com.codegnan.controlstatements;

import java.util.Scanner;

public class PalindromicNumberCounter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int num = 1;
		while (num <= N) {
			if (isPalindrome(num)) {
				count++;
			}
			num++;
		}
		System.out.println(count);
	}
	static boolean isPalindrome(int n) {
		int rev = 0, temp = n;
		while (n > 0) {
			rev = rev * 10 + (n % 10);
			n /= 10;
		}
		return temp == rev;
	}

}
