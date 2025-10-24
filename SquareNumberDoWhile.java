package com.codegnan.controlstatements;

import java.util.Scanner;

public class SquareNumberDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int i = 1;
		int count = 0;
		int square;
		do {
			square = i * i;
			if (square > N || count == M) break;
			System.out.print(square + " ");
			i++;
		} while (true);
		sc.close();
	}

}
