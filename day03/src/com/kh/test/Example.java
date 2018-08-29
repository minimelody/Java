package com.kh.test;

import java.util.Scanner;

public class Example {
	Scanner sc = new Scanner(System.in);
	
	public void example2() {
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		System.out.printf("면적 : %f \n", width*height);
		System.out.printf("둘레 : %f \n", (width+height)*2);
	}
}
