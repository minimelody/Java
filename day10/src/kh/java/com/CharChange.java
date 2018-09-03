package kh.java.com;

public class CharChange {
	public void test() {
		int [] arr = {1,2,3,4,5};
		test2(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void test2(int [] a) {
		a[0] = 999;
	}
}
