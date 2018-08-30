package kh.java.test;

import java.util.Scanner;

public class HowManyDays {
	public void testDay() {
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고 싶은 달을 입력하세요 : ");
		int dal = sc.nextInt();
		if(1<=dal && dal<=12) {
			switch(dal) {
				case 2:
					System.out.println("2월달은 28일수 입니다.");
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println(dal + "월달은 30일수 입니다.");
					break;
				default:
					System.out.println(dal + "월달은 31일수 입니다.");
					break;
			}
		}else {
			System.out.println("잘못 입력하셨습니다!");
		}
	}
}
