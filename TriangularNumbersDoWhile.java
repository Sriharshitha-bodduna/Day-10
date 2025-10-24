package com.codegnan.controlstatements;

import java.util.Scanner;

public class TriangularNumbersDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		int triangular;
		do {
			triangular = i * (i + 1) / 2;
			if (triangular > N) break;
			System.out.print(triangular + " ");
			i++;
		} while (true);
		sc.close();
	}

}
