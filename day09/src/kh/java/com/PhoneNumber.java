package kh.java.com;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		//사용자의 전화번호를 입력받고, 13자리의 문자형배열에 저장한 후, 가운데 4자리를 *로 가리기.
		//단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력 : ");
		String str = sc.next();
		char [] arr = new char [str.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		//복사
		char [] arr2 = new char [arr.length];
		arr2 = arr.clone();
		for(int i=4;i<8;i++) {
			arr2[i] = '*';
		}
		System.out.println(arr2);
		System.out.println(arr);
	}

}
