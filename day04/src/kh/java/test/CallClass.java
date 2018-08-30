package kh.java.test;

import java.util.Scanner;

public class CallClass {
	public void menuTest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("********* 주메뉴 *********");
		System.out.println("a.불고기버거 --------5000원");
		System.out.println("b.새우버거 ---------4000원");
		System.out.println("c.치킨버거 ---------4500원");
		System.out.println("d.한우버거 --------10000원");
		System.out.println("e.디버거 -----------7000원");
		System.out.println("************************");
		System.out.print("주 메뉴 선택(a~e) : ");
		char mainMenu = sc.next().charAt(0);
		
		String mainMenuName = ""; //메인메뉴의 이름 변수
		int mainMenuPrice = 0; //메인메뉴의 가격 변수
		
		switch(mainMenu) {
			case 'a':
				mainMenuName = "불고기버거"; 
				mainMenuPrice = 5000;
				break;
			case 'b':
				mainMenuName = "새우버거";
				mainMenuPrice = 4000;
				break;
			case 'c':
				mainMenuName = "치킨버거";
				mainMenuPrice = 4500;
				break;
			case 'd':
				mainMenuName = "한우버거";
				mainMenuPrice = 10000;
				break;
			case 'e':
				mainMenuName = "디버거";
				mainMenuPrice = 7000;
				break;
			default:
				System.out.println("번호를 잘못 누르셨습니다.");
				System.out.println("영업을 종료합니다.");
				return;
		}
		
		System.out.println("******* 사이드메뉴 *******");
		System.out.println("1.콜라 ------------1500원");
		System.out.println("2.사이다 -----------1500원");
		System.out.println("3.밀크쉐이크 ---------2500원");
		System.out.println("4.레드불 -----------3000원");
		System.out.println("**********************");
		System.out.print("사이드 메뉴 선택(1~4) : ");
		int sideMenu = sc.nextInt();
		
		String sideMenuName = ""; //메인메뉴의 이름 변수
		int sideMenuPrice = 0; //메인메뉴의 가격 변수
		
		switch(sideMenu) {
			case 1:
				sideMenuName = "콜라"; 
				sideMenuPrice = 1500;
				break;
			case 2:
				sideMenuName = "사이다";
				sideMenuPrice = 1500;
				break;
			case 3:
				sideMenuName = "밀크쉐이크";
				sideMenuPrice = 2500;
				break;
			case 4:
				sideMenuName = "레드불";
				sideMenuPrice = 3000;
				break;
			default:
				System.out.println("번호를 잘못 누르셨습니다.");
				System.out.println("영업을 종료합니다.");
				return;
		}
		
		System.out.printf("%s,%s 총 %d원 입니다 \n",mainMenuName,sideMenuName,mainMenuPrice+sideMenuPrice);
		
	}
}
