package kh.java.test;

import java.util.Scanner;

public class Motel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [10];
		while(true) {
			System.out.println("====== 모텔 관리 프로그램 ver 1.0 ======");
			System.out.println("1.입실 / 2.퇴실 / 3.방보기 / 4.프로그램 종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			int roomNum;
			switch(select) {
				case 1:
					System.out.print("몇번 방에 입실하시겠습니까? ");
					roomNum = sc.nextInt();
					if(arr[roomNum-1]==0) {
						arr[roomNum-1]=1;
						System.out.println(roomNum + "번째 방에 입실하였습니다");
					}else {
						System.out.println(roomNum + "번째 방에는 현재 손님이 있습니다!!!!!!");
					}
					break;
				case 2:
					System.out.print("몇번 방에서 퇴실하시겠습니까? ");
					roomNum = sc.nextInt();
					if(arr[roomNum-1]==1) {
						arr[roomNum-1]=0;
						System.out.println(roomNum + "번째 방에서 퇴실하였습니다");
					}else {
						System.out.println("이미 빈방입니다");
					}
					break;
				case 3:
					for(int i=0;i<arr.length;i++) {
						if(arr[i]==0) {
							System.out.println((i+1)+"번째 방은 현재 빈방입니다.");
						}else if(arr[i]==1) {
							System.out.println((i+1)+"번째 방은 현재 손님이 있습니다.");
						}
					}
					break;
				case 4:
					System.out.println("프로그램을 종료합니다");
					System.out.println("항상 좋은 하루 보내세요 ♥");
					return;
			}
		}
	}

}
