package com.codegnan.controlstatements;

import java.util.Scanner;

public class CollatzSequenceLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		while (n != 1) {
			if (n % 2 ==0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			} 
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
