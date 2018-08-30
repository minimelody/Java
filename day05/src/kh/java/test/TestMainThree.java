package kh.java.test;

import java.util.Scanner;

public class TestMainThree {

	public static void main(String[] args) {
		/*
		 1~n 까지의 수중 짝수들만의 합이 나올 수 있도록 만들어 보아라.
		 n의 수는 입력을 받도록 하여라.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("n의 수를 입력 : ");
		int num = sc.nextInt();
		int i=0;
		int sum=0;
		while(i<num) {
			i++;
			if(i%2==0) sum+=i;
		}
		System.out.println("짝수들만의 합은 : " + sum);
	}

}
