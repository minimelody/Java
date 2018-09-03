package kh.java.com;

import java.util.Random;
import java.util.Scanner;

public class CoinGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		while(true) {
			System.out.println("동전 앞뒤 맞추기 게임 ver 1.0");
			int comCoin = r.nextInt(2)+1; //1~2
			System.out.print("선택하세요(1.앞면/2.뒷면) : ");
			int userCoin = sc.nextInt();
			
			if(comCoin==userCoin) {
				System.out.println("맞추셨습니다!!! 운이 좋네요");
			}else {
				System.out.println("틀리셨습니다!! 운이 없군요!!");
			}
			System.out.print("계속 하시겠습니까?(y,n) : ");
			char select = sc.next().charAt(0);
			if(select=='n') break;
		}
		
		System.out.println("동전 앞뒤 맞추기 게임을 종료합니다!");

	}

}
