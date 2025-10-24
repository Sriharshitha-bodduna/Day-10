package com.codegnan.controlstatements;

import java.util.Scanner;

public class PalindromicNumberCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int original = i;
			int reversed = 0;
			int temp = i;
			while (temp > 0) {
				int digit = temp % 10;
				reversed = reversed * 10 + digit;
				temp = temp / 10;
			}
			if (original == reversed) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
