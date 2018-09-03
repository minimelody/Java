package kh.java.com;

import java.util.Scanner;

public class Cal {
	public void calcu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("======== Ms 계산기 프로그램 ver 1.4 ========");
			System.out.print("연산자 입력 (+,-,*,/(종료:q)) : ");
			char oper = sc.next().charAt(0);
			if(oper=='q' || oper=='Q') {
				break;
			}
			if(oper!='+' && oper!='-' && oper!='*' && oper!='/') {
				System.out.println("연산자 " + oper + "를 잘못입력하셨습니다.");
				continue;
			}
			System.out.print("첫번째 숫자 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("계산중.");
			for(int i=0;i<10;i++) {
				System.out.print(".");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("\n\n- - - - - - - 결 과 출 력 - - - - - - -");
			switch(oper) {
				case '+' : 
					System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
					break;
				case '-' : 
					System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
					break;
				case '*' : 
					System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
					break;
				case '/' : 
					System.out.println(num1 + "/" + num2 + "=" + (num1/(double)num2));
					break;
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			clear();
		}
	}
	public void clear() {
		for(int i=0; i<50; i++) {
			System.out.println();
		}
	}
}
