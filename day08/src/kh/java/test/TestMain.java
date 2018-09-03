package kh.java.test;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[4];
		
		System.out.print("국어점수 입력 : ");
		arr[0] = sc.nextInt();
		
		System.out.print("영어점수 입력 : ");
		arr[1] = sc.nextInt();
		
		System.out.print("수학점수 입력 : ");
		arr[2] = sc.nextInt();
		
		arr[3] = arr[0] + arr[1] + arr[2];
		
		System.out.println("국어점수 : " + arr[0]);
		System.out.println("영어점수 : " + arr[1]);
		System.out.println("수학점수 : " + arr[2]);
		System.out.println("합계점수 : " + arr[3]);
		System.out.printf("평균점수 : %.2f",arr[3]/3.0);
	}

}
