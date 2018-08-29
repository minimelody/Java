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
	
	public void example3() {
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.println("------ 결 과 출 력 ------");
		System.out.println("첫번째 문자 : " + str.charAt(0));
		System.out.println("두번째 문자 : " + str.charAt(1));
		System.out.println("세번째 문자 : " + str.charAt(2));
	}
}
