package com.codegnan.controlstatements;

import java.util.Scanner;

public class SmallestPowerFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int i = 1;
		long power = K;
		while (power < N) {
			i++;
			power = power * K;
		}
		System.out.println(i);
		sc.close();
	}

}
