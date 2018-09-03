package kh.java.test;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1 + "번째 숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		int tmp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}				
			}
		}
		System.out.printf("%d \t %d \t %d \t %d \t %d",arr[0],arr[1],arr[2],arr[3],arr[4]);

	}

}
