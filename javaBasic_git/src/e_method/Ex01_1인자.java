package e_method;

/*
 * 인자 - argument
 * 매개변수 - parameter
 * 
 * 인자 := 매개변수 (비슷하다.) 
 */

public class Ex01_1인자 {

	public static void main(String[] args) {
		//데이타
		int a = 10, b = 20; 
		
		add(a, b); //a와 b의 값을 보낸다 = 인자 : argument 
		
		
	}
	static void add(int a, int b) { // 값을 받을 게 :parameter 
		//데이타에 대한 처리
		int sum = a + b; 
		System.out.println("합은: " + sum);
	}

}
