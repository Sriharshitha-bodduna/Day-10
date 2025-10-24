package com.codegnan.controlstatements;

import java.util.HashSet;
import java.util.Scanner;

public class SumUntilRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> seen = new HashSet<>();
		int sum = 0;;
		while (true) {
			int num = sc.nextInt();
			if (num == 0) break;
			sum += num;
			if (seen.contains(num)) {
				break;
			}
			seen.add(num);
		}
		System.out.println(sum);
		sc.close();
	}

}
