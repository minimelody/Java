package kh.java.test;

import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		//c.cal();
		HowManyDays days = new HowManyDays();
		//days.testDay();
		
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		int i;
		i=0;
		
		/* 반복문을 이용!
		System.out.print("정수값을 입력하세요 : ");
		num = sc.nextInt();
		sum = sum + num;
		
		System.out.print("정수값을 입력하세요 : ");
		num = sc.nextInt();
		sum = sum + num;
		
		System.out.print("정수값을 입력하세요 : ");
		num = sc.nextInt();
		sum = sum + num;
		
		System.out.print("정수값을 입력하세요 : ");
		num = sc.nextInt();
		sum = sum + num;
		
		System.out.print("정수값을 입력하세요 : ");
		num = sc.nextInt();
		sum = sum + num;
		*/
		
		while(i<5) {
			i++;
			System.out.print("정수값을 입력하세요 : ");
			num = sc.nextInt();
			sum = sum + num;
		}
		
		System.out.println("입력한 5개의 정수의 합 : " + sum);

	}

}
