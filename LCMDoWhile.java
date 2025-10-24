package com.codegnan.controlstatements;

import java.util.Scanner;

public class LCMDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int lcm = B;
		do {
			if (lcm % A == 0) break;lcm += B;
		} while (true);
		System.out.println(lcm);
		sc.close();
	}

}
