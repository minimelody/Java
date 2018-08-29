package test.kh.java;

public class JavaTest {

	public static void main(String[] args) {
		int firstNum = 20;
		int secondNum = 10;
		int result;
		// 다음 result 변수안에 각 각의 결과값을 담아서 다음과 같은 출력이 되도록 만들어 보아라
		// 조건1. firstNum과 secondNum 변수를 이용해야 함
		// 조건2. result에 결과값을 대입하고 result를 출력 해야함
		// System.out.println(result);
		
		// ----- 출력된 결과 -----
		// 30
		// 10
		// 200
		// 2
		
		result = firstNum + secondNum;
		System.out.println(result);
		result = firstNum - secondNum;
		System.out.println(result);
		result = firstNum * secondNum;
		System.out.println(result);
		result = firstNum / secondNum;
		System.out.println(result);

	}

}
