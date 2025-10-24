package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumNotDivisibleByDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num == 0) break;
			int digitSum = getDigitSum(num);
			if (num % digitSum == 0) continue;
			sum += num;
		}
		System.out.println(sum);
		sc.close();
	}
		static int getDigitSum(int n) {
			int sum = 0;
			while (n > 0) {
				sum += n % 10;
				n /= 10;
			}
			return sum;
		}
	}
