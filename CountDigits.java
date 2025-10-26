package com.codegnan.controlstatements;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int count = 0;
		int n = Math.abs(num);
		while (n > 0) {
			n = n / 10;
			count++;
	    }
        if ( num == 0) {
         	count = 1;
        }
        System.out.println("Number of digits in " + num + " = " + count);
        sc.close(); 	
	}

}
