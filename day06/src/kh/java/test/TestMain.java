package kh.java.test;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int firstNum = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int secondNum = sc.nextInt();
		int min=0;
		int max=0;
		if(firstNum<=secondNum) {
			min = firstNum;
			max = secondNum;
		}else if(firstNum>secondNum){
			min = secondNum;
			max = firstNum;
		}
		int sum=0;
		for(int i=min;i<=max;i++) {
			sum += i;
		}
		System.out.println(min + " ~ " + max + " 까지의 합 : " + sum);
	}

}
