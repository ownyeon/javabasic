package e_method;

public class Ex03_인자와반환 {

	public static void main(String[] args) {

		int a= 10, b = 20;
		int result = add(a,b);
		//결과 
		System.out.println("합:" + result);

	}
	
	static int add(int a, int b) {
		//데이타처리
		
		int sum = a+b;
//		System.out.println("합:" + sum);
		return sum;
	}

}
