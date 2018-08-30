package kh.java.test;

public class TestMainTwo {

	public static void main(String[] args) {
		/*
		 while 문을 사용하여 1~100까지 수중 짝수들의 합을 더한 후 
		 최종적으로 짝수들만의 합 값이 출력 될 수 있도록 만들어 보아라
		 */
		int i=0;
		int sum=0;
		while(i<100) {
			i++;
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println("짝수들만의 합은 : " + sum);

	}

}
