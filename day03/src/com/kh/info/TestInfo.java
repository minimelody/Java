package com.kh.info;

import java.util.Scanner;

public class TestInfo {
	public void student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름 입력 : ");
		String name = sc.next();
		System.out.print("학생의 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("학생의 국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("학생의 영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("학생의 수학점수 입력 : ");
		int math = sc.nextInt();
		System.out.println("----------- 결 과 출 력 -----------");
		System.out.println(name + "!! 당신은 " + age + "살 이군요!!");
		System.out.println("국어점수는 " + kor + "점 입니다.");
		System.out.println("영어점수는 " + eng + "점 입니다.");
		System.out.println("수학점수는 " + math + "점 입니다.");
		System.out.println("평균점수는 " + (kor+eng+math)/3 + "점 입니다.");
	}
}
