package com.codegnan.controlstatements;

import java.util.Scanner;

public class TriangularNumbersGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int triangular = 0;
		while (true) {
			triangular = i * (i + 1) / 2;
			if (triangular > n) {
				break;
			}
			System.out.print(triangular + " ");
			i++;
		} 
		sc.close();
	}

}
