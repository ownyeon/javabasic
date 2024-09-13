package e_method;

public class Ex00_흐름 {

	static void method() { //자바의 메인 함수에서 불러쓰려면 static이 붙게 써야한다. static이 붙은 애들은 static이 붙은 애만 찾음
		System.out.println("method 실행");
	}
	
	public static void main(String[] args) {
		System.out.println("main 시작"); //1
		method();//2
		method();//2
		method();//2

		System.out.println("main 끝");//3
		
	}


}

/*
 *무조건 main부터 실행함. 
 * 
 */
