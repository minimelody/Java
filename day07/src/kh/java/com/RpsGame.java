package kh.java.com;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int exit = 1;
		do {
			System.out.println("========== 가위 바위 보 게임 ver 1.0 ==========");
			System.out.print("선택을 하세요(1.가위/2.바위/3.보) : ");
			int userSelect = sc.nextInt();
			switch(userSelect) {
				case 1:
					System.out.println("사용자가 가위를 냈습니다");
					break;
				case 2:
					System.out.println("사용자가 바위를 냈습니다");
					break;
				case 3:
					System.out.println("사용자가 보를 냈습니다");
					break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int comSelect = r.nextInt(3)+1;
			switch(comSelect) {
				case 1:
					System.out.println("컴퓨터가 가위를 냈습니다");
					break;
				case 2:
					System.out.println("컴퓨터가 바위를 냈습니다");
					break;
				case 3:
					System.out.println("컴퓨터가 보를 냈습니다");
					break;
			}
			if((userSelect==1&&comSelect==3) || (userSelect==2&&comSelect==1) || (userSelect==3&&comSelect==2)) { //사용자가 이겼을 때
				System.out.println("사용자가 이겼습니다 ^_^");
			}else if((comSelect==1&&userSelect==3) || (comSelect==2&&userSelect==1) || (comSelect==3&&userSelect==2)) { //사용자가 졌을 때 (컴퓨터가 이겼을 때)
				System.out.println("사용자가 졌습니다 ㅠ_ㅠ");
			}else { //비겼을 때
				System.out.println("비겼습니다!!-_-");
			}
			System.out.print("계속하시겠습니까?(1.yes/2.no) : ");
			exit = sc.nextInt();
		}while(exit==1);
	}

}
