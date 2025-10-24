package com.codegnan.controlstatements;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prices[] = new int[n];
		for (int i = 0; i < n; i++) {
			prices[i] = sc.nextInt();
		}
		int maxLength = 1;
		int currentLength = 1;
		for (int i = 1; i < n; i++) {
			if (prices[i] > prices[i - 1]) {
				currentLength++;
			} else {
				if (currentLength > maxLength) {
					maxLength = currentLength;
				}
				currentLength = 1;
			}
		}
		if (currentLength > maxLength) {
			maxLength = currentLength;
		}
		System.out.println(maxLength);
		sc.close();
	}

}
