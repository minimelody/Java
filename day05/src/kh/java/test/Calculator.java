package kh.java.test;

import java.util.Scanner;

public class Calculator {
	public void cal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 계산기 프로그램 ver 1.0 ========");
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		char oper = sc.next().charAt(0);
		if(oper=='+' || oper=='-' || oper=='*' || oper=='/') {
			System.out.print("첫번째 수 입력 : ");
			int firstNum = sc.nextInt();
			System.out.print("두번째 수 입력 : ");
			int secondNum = sc.nextInt();
			
			System.out.println("========= 결 과 출 력 =========");
			switch(oper) {
				case '+':
					System.out.printf("%d + %d = %d",firstNum,secondNum,firstNum+secondNum);
					break;
				case '-':
					System.out.printf("%d - %d = %d",firstNum,secondNum,firstNum-secondNum);
					break;
				case '*':
					System.out.printf("%d * %d = %d",firstNum,secondNum,firstNum*secondNum);
					break;
				case '/':
					System.out.printf("%d / %d = %.2f",firstNum,secondNum,(double)firstNum/secondNum);
					break;
			}
		}else {
			System.out.println("잘못 입력하셨습니다 " + oper + "는 연산할 수 없습니다.");
		}
	}
}
