package kh.java.com;

import java.util.Scanner;

public class Apart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- A 아파트 정보 입력 -----");
		System.out.print("건물 총 층수 입력 : ");
		int apt = sc.nextInt();
		
		System.out.println(apt + "층이 생성 되었습니다");
		String [][] str = new String [apt][];
		
		for(int i=0;i<str.length;i++) {
			System.out.print((i+1) + "층의 총 호실 입력 : ");
			str[i] = new String[sc.nextInt()];
		}
		
		for(int i=0;i<str.length;i++) {
			System.out.println((i+1) + "층은 " + str[i].length + "호실까지 생성 되었습니다");
		}
		
		System.out.println("각 호실마다 입주자의 이름을 입력하세요");
		
		for(int i=0;i<str.length;i++) {
			System.out.println("========== " + (i+1) + "층 정보 입력 ==========");
			for(int j=0;j<str[i].length;j++) {
				System.out.print((i+1) + "층 " + (j+1) + "호 입주자 : ");
				str[i][j] = sc.next();
			}
		}
		
		System.out.println("------- 각 층 입주자 정보 출력 -------");
		for(int i=0;i<str.length;i++) {
			System.out.print((i+1) + "층 : ");
			for(int j=0;j<str[i].length;j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
	}

}
