package kh.java.test;

import java.util.Scanner;

public class TestMainTwo {

	public static void main(String[] args) {
		/*
		 한 개의 정수를 입력받아 양수(positive integer)인지 음수(negative number)인지 출력하는 작업을 반복하다가 
		 0이 입력되면 종료하는 프로그램을 작성하시오. (0이 입력되기 전까지는 반복)
		 */
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("number?");
			num = sc.nextInt();
			if(num>0) {
				System.out.println("positive integer");
			}else if(num<0) {
				System.out.println("negative number");
			}
		}while(num!=0);
		System.out.println("End");
	}

}
