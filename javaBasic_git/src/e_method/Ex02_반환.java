package e_method;

/*
 * 함수가 끝나기 전에 끝내려고 할 떄 : return 
 * return 할때 단 하나의 값을 반환 가능 
 * 
 * 
 * 
 * 
 */

public class Ex02_반환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = add(); //저장할 변수가 존재해야 함 
		System.out.println("합=" + sum);
		
	}

	static int add() { //void는 반환하는 애가 아무것도 없다는 것임 근데 return을 사용해서 반환하는 애가 생기면 void자리에 int라고 줘야함 
		//데이타 
		int a = 10, b = 20;
		int sum = a + b; 
		return sum;
	}
	
	
}
