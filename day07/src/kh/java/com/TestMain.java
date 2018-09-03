package kh.java.com;

import java.util.Random;

public class TestMain {

	public static void main(String[] args) {
		Example ex = new Example();
		//ex.ex1();
		//ex.ex2();
		//ex.ex3();
		//ex.ex4();
		//ex.ex5();
		//ex.ex6();
		//ex.ex7();
		//ex.ex8();
		//ex.ex9();
		//ex.ex10();
		//ex.ex11();
		//ex.ex12();
		//ex.ex13();
		Cal c = new Cal();
		//c.calcu();
		
		Random r = new Random();
		while(true) {
			int data = r.nextInt(6)+1;
			System.out.println(data);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
