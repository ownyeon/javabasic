package e_method;


/*
 * call by value
 * 		:메소드의 인자(파라미터) 가 기본형인 경우 
 * 
 * 		=> 값만 복사 
 */

public class Ex06_CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 10, b = 20; 
		add(a, b);
		System.out.println("2. A=" + a + ",B=" + b);//2

	}
	
	static void add(int a, int b) {
		a += b; 
		System.out.println("1. A=" + a + ",B=" + b); //1
	}

}
